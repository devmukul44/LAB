<%-- 
    Document   : newjsp
    Created on : Apr 23, 2015, 6:51:35 PM
    Author     : ANAND UJJWAL
--%>
<%@page import ="java.sql.*"%>
<%@page import ="java.io.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
      
<html>
<head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
<title> customer info</title>
</head>
<body>
    
    <% 
        String xx=session.getAttribute("thename").toString();
         String xy= session.getAttribute("thepw").toString();
        
        
   try
{String x1,x2,x3,x4,x5,x6,x7,x8,x9;
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Krishna","root","");
PreparedStatement st=con.prepareStatement("insert into movie values (?,?,?,?,?,?,?,?,?,?,?)" );
if(request.getParameter("m1")!=null)
x1=request.getParameter("m1");
else x1="0";
if(request.getParameter("m2")!=null)
 x2=request.getParameter("m2");
else x2="0";
if(request.getParameter("m3")!=null)
x3= request.getParameter("m3");
else x3="0";
if(request.getParameter("m4")!=null)
  x4=request.getParameter("m4");
else x4="0";
if(request.getParameter("m5")!=null)
  x5=request.getParameter("m5");
else x5="0";
if(request.getParameter("m6")!=null)
 x6= request.getParameter("m6");
else x6="0";
if(request.getParameter("m7")!=null)
  x7=request.getParameter("m7");
else x7="0";
if(request.getParameter("m8")!=null)
  x8=request.getParameter("m8");
else x8="0";
if(request.getParameter("m9")!=null)
  x9=request.getParameter("m9");
else x9="0";
  st.setString( 1 ,xx );
st.setString( 2 ,xy);
st.setString( 3 ,x1  );
st.setString( 4 ,x2);
st.setString( 5 , x3 );
st.setString( 6 ,x4);
st.setString( 7 ,x5  );
st.setString( 8 ,x6 );
st.setString( 9 ,x7  );
st.setString( 10,x8 );
st.setString( 11,x9 );
st.executeUpdate();
con.commit();
st.close();
con.close();
}
catch (ClassNotFoundException err) { System.out.println(err); }
catch (SQLException err) { System.out.println(err); }
   
%>

<form action="payment.jsp" method="post">
<pre>
Enter the shipping details:

Mobile <input type="text" name="mb"><br/>
email<input type="text" name="mail"><br/>
Enter your address:
<textarea  name="add" rows="5" cols="42" wrap="hard"></textarea><br/>

city<input type="text" name="city"><br/>
state<input type="text" name="state"><br/>
pin code<input type="text" name="pin"><br/>
submit details<input type="submit" value="submit"><br/>
</pre>
</form>

</body>


</html>
