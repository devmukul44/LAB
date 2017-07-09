import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import javax.servlet.annotation.WebServlet;
@WebServlet(urlPatterns = {"/Searchh"})
public class Searchh extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
  		String term=request.getParameter("term");
  		String[] fl={"a.txt","b.txt","c.txt"}; 
                int vx,flag,count=0;
                 for(vx=0;vx<=2;vx++)   
                 {
                     flag=0;
                 
                
      FileReader fr = new FileReader("C:\\Users\\ANAND UJJWAL\\Documents\\NetBeansProjects\\search_engine\\web\\"+fl[vx]);
      BufferedReader br = new BufferedReader(fr);
      String s;int i=0;
      String[] m=new String[100]; 
      while((s = br.readLine()) != null) 
      {
      
      m[i]=s;
      i++;
      }

      out.println("<HTML>");  
      out.println("<HEAD>"); 
      out.println("<TITLE>Search Results</TITLE>"); 
      out.println("</HEAD>"); 
      out.println("<BODY>"); 

      for(int k=0;k<m.length;k++)
        if(m[k].equals(term))
        {
            out.println(m[k]);
            out.println(m[k+1]);
            out.println(m[k+2]);
        }
      fr.close();
      
                 }

        out.println("</BODY>"); 
        out.println("</HTML>"); 

      
	}
}