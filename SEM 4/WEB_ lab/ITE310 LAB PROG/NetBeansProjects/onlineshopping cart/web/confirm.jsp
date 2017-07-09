<%-- 
    Document   : confirm.jsp
    Created on : Apr 24, 2015, 6:49:19 PM
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
        

    try
{
   
      String name=session.getAttribute("thename").toString();
         String pwd= session.getAttribute("thepw").toString();
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Krishna","root","");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("SELECT * from info WHERE name='"+name+"' AND pwd='"+pwd+"' ");
rs.next();
String nm=rs.getString(1);
String mb=rs.getString(2);
String mail=rs.getString(3);
String add=rs.getString(4);
String city=rs.getString(5);
String state=rs.getString(6);
String pin=rs.getString(7);
out.println("Delivery wil be done to \n");
out.println(nm+"<br>"+mb+"<br>"+add+"<br>"+city+"<br>"+state+"<br>"+pin+"<br>");



}
catch (ClassNotFoundException err) {out.println(err); }
catch (SQLException err) { out.println(err);}
catch(Exception err)
{ out.println(err);}
     out.println("thanks for shopping \n Delivery will be made to you shortly ");
%>
    </body>
</html>
