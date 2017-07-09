<%-- 
    Document   : newjsp
    Created on : Apr 25, 2015, 4:44:57 AM
    Author     : ANAND UJJWAL
--%>
<%@page import ="java.sql.*"%>
<%@page import ="java.io.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            
            String op1,op2,op3,op4,op5;
            int sc=0;
            
            if(request.getParameter("xy1")!=null)
                op1=request.getParameter("xy1");
            else op1="0";
            if(request.getParameter("xy2")!=null)
                op2=request.getParameter("xy2");
            else op2="0";
            if(request.getParameter("xy3")!=null)
                op3=request.getParameter("xy3");
            else op3="0";
            if(request.getParameter("xy4")!=null)
                op4=request.getParameter("xy4");
            else op4="0";
            if(request.getParameter("xy5")!=null)
                op5=request.getParameter("xy5");
            else op5="0";
            
            if(op1.equals("a1"))
                sc++;
            if(op2.equals("b2"))
                sc++;
            if(op3.equals("c3"))
                sc++;
            if(op4.equals("d4"))
                sc++;
            if(op5.equals("e1"))
                sc++;
            
          
            
    String name=session.getAttribute("thename").toString();
      String pwd=session.getAttribute("thepw").toString();
        
         
    try{
        
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Krishna","root","");
PreparedStatement st=con.prepareStatement("insert into quiz values (?,?,?)" );

st.setString( 1 ,name);
st.setString( 2 ,pwd);
st.setInt( 3 ,sc);

st.executeUpdate();
 response.sendRedirect("index.html");
con.commit();

st.close();
con.close();
        
        


}
catch (ClassNotFoundException err) { }
catch (SQLException err) { }
catch(Exception err)
{ }

    %>
    </body>
</html>
