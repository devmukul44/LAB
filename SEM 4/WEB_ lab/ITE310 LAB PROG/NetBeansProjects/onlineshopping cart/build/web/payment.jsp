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
String z2=request.getParameter("mb");
  String z3=request.getParameter("mail");
    String z4=request.getParameter("add");
      String z5=request.getParameter("city");
      String z6=request.getParameter("state");
      String z7=request.getParameter("pin");
      
      
      try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Krishna","root","");
PreparedStatement st=con.prepareStatement("insert into info values (?,?,?,?,?,?,?,?)" );

st.setString( 1 ,z1);
st.setString( 2 ,z2);
st.setString( 3 ,z3 );
st.setString( 4 ,z4);
st.setString( 5 ,z5 );
st.setString( 6 ,z6);
st.setString( 7 ,z7 );
st.setString( 8 ,z8);
st.executeUpdate();
con.commit();
st.close();
con.close();
}
catch (ClassNotFoundException err) { out.println(err); }
catch (SQLException err) {  }
      
       try
{
   
      String name=session.getAttribute("thename").toString();
         String pwd= session.getAttribute("thepw").toString();
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Krishna","root","");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("SELECT * from movie WHERE customer='"+name+"' AND pwd='"+pwd+"' ");
rs.next();
int i,sum=0;
for(i=3;i<=11;i++)
 sum+=Integer.parseInt(rs.getString(i));

out.println("Delivery wil be done to \n");
out.println("Amount payable ="+sum+"$<br>");



}
catch (ClassNotFoundException err) {out.println(err); }
catch (SQLException err) { out.println(err);}
catch(Exception err)
{ out.println(err);}

      %>
<form action="confirm.jsp" method="post">
<pre>

Enter the payment option:
<input type="radio"  id="debit" name="card" value="debit"><label for="debit">Debit Card</label><br/> 
<input type="radio"  id="credit" name="card" value="credit"><label for="credit">Credit Card</label><br/>
Enter the Card type:<select><option>VISA</option><option>MAESTRO</option><option>MASTER CARD</option><option>PAY PAL</option><select> <BR/>

Enter the card number<input type="text" name="name" ><br/>
Enter the bank name <input type="text" name="mb"><br/>
Enter the C V V number<input type="text" name="mail"><br/>
Enter card holder's name<input type="text" name="city"><br/>

<input type="submit" value="pay"><br/>
</pre>
</form>
</body>


</html>