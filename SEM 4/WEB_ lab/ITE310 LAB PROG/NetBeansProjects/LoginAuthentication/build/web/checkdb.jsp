
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
    String name=request.getParameter("name");
String password=request.getParameter("pass");
int verified=0;
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Krishna","root","");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from identy");
while(rs.next())
{
String dbname=rs.getString(1);
String dbpassword=rs.getString(2);
if(name.equals(dbname)&&password.equals(dbpassword))
verified=1;
}
}
catch (ClassNotFoundException err) {out.println(err); }
catch (SQLException err) { out.println(err);}
catch(Exception err)
{ out.println(err);}
if(verified==1)
out.println("valid user");
else out.println("Invalid user.login Again");
%>
        
    </body>
</html>