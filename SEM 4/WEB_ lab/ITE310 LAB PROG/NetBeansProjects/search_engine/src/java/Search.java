/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/Search"})
public class Search extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
  		String term=request.getParameter("term");
                String[] fl={"C:/USERS/ANAND UJJWAL/Videos/a.txt","C:/USERS/ANAND UJJWAL/Videos/b.txt","C:/USERS/ANAND UJJWAL/Videos/c.txt"};
                int vv,count=0,flag,k;
                for(vv=0;vv<3;vv++)
                {
                    flag=0;
  		FileReader fr = new FileReader(fl[vv]);
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

      for(k=0;k<m.length;k++)
        if(m[k].equals(term))
        {
            count++;
            flag=1;
        }
      fr.close();
      if(flag==1)
          out.println("<a href="+fl[vv]+"> Go back to login page</a><br>");
                }
                
                if(count==0)
                    out.println("Search not found");
        out.println("</BODY>"); 
        out.println("</HTML>"); 

      
	}
}














