<%-- 
    Document   : payment
    Created on : Apr 23, 2015, 6:52:52 PM
    Author     : ANAND UJJWAL
--%>
<%@page import ="java.sql.*"%>
<%@page import ="java.io.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
      
<html>
<head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Payment details</title>
</head>
<body>
    <%
        String z1=session.getAttribute("thename").toString();
         String z8= session.getAttribute("thepw").toString();
         
      
      try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Krishna","root","");

Statement st=con.createStatement();
ResultSet rs=st.executeQuery("SELECT * from quiz WHERE name='"+z1+"' AND pwd='"+z8+"' ");
rs.next();

 int sum=rs.getInt(3);

out.println(z1+"\n");
out.println("your score ="+sum+"<br>");



}
catch (ClassNotFoundException err) {out.println(err); }
catch (SQLException err) { out.println(err);}
catch(Exception err)
{ out.println(err);}

      %>
      </body>


</html>