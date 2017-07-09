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
         String z1=request.getParameter("uname");
      String z8=request.getParameter("pass");
      
      try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Krishna","root","");
PreparedStatement st=con.prepareStatement("insert into identy values (?,?)" );

st.setString( 1 ,z1);
st.setString( 2 ,z8);
st.executeUpdate();
con.commit();
st.close();
con.close();
}
catch (ClassNotFoundException err) { out.println(err); }
catch (SQLException err) {  }
      response.sendRedirect("welcome.jsp");

      %>
      </body>


</html>