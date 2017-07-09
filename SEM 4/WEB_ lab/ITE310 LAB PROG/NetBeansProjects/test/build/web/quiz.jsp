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
<title>quiz</title>
        <link rel="shortcut icon" type="image/jpg" href="me.jpg"/>
        <title>Quiz server side</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>

<body bgcolor="black" onload="tm()">


<form action="newjsp.jsp" method="post">

<div id="code">

<div id="q1" style="font-weight: bold; position:static;font-size:35px;color: #ffffff;">
which is the longest river in the world?


</div>
    <div id="op1" style="font-weight: bold; position:static;font-size:35px;color: #ffffff;" >
 
<input type="radio"   name="xy1" value="a1"><label for="op11">NILE</label><br/> 
<input type="radio"  name="xy1" value="a2"><label for="op12">ZAIRE</label><br/>
<input type="radio" name="xy1" value="a3"><label for="op13">GANGA</label><br/>
<input type="radio"  name="xy1" value="a4"><label for="op14">YAMUNA</label><br/>
</div>
    <hr>
<div id="q2" style="font-weight: bold; position:static;font-size:35px;color: #ffffff;">
which is the coldest COUNTRY of the world?

 </div>
    <div id="op2" style="font-weight: bold; position:static;font-size:35px;color: #ffffff;">
<input type="radio" name="xy2" value="b1"><label for="op21">ATLANTIC</label><br/>
<input type="radio"  name="xy2" value="b2"><label for="op22">GREENLAND</label><br/> 
<input type="radio"   name="xy2" value="b3"><label for="op23">RUSSIA</label><br/>
<input type="radio"   name="xy2" value="b4"><label for="op24">LADAKH</label><br/>
    </div><hr>
<div id="q3" style="font-weight: bold; position:static;font-size:35px;color: #ffffff;">
what is the roof of the world?


</div>
     <div id="op3" style="font-weight: bold; position:static;font-size:35px;color: #ffffff;">
<input type="radio"  name="xy3" value="c1"><label for="op31">ALPS</label><br/>
<input type="radio"  name="xy3" value="c2"><label for="op32">ARAVALI</label><br/>
<input type="radio"  name="xy3" value="c3"><label for="op33">HIMALAYAS</label><br/>
<input type="radio"  name="xy3" value="c4"><label for="op34">GREAT WALL OF CHINA</label><br/></div><hr>
<div id="q4" style="font-weight: bold; position:static;font-size:35px;color: #ffffff;">how many world cups have india won?

</div>
<div id="op4" style="font-weight: bold; position:static;font-size:35px;color: #ffffff;">
<input type="radio"  name="xy4" value="d1"><label for="op41">ONE</label><br/>
<input type="radio"  name="xy4" value="d2"><label for="op42">THREE</label><br/>
<input type="radio"  name="xy4" value="d3"><label for="op43">FIVE</label><br/>
<input type="radio"  name="xy4" value="d4"><label for="op44">TWO</label><br/>
<br/></div>
   
<div id="q5" style="font-weight: bold; position:static;font-size:35px;color: #ffffff;">how many states are there are in United States of America?
</div>


<div id="op5" style="font-weight: bold; position:static;font-size:35px;color: #ffffff;">
<input type="radio"  name="xy5" value="e1"><label for="op51">FIFTY</label><br/>
<input type="radio" name="xy5" value="e2"><label for="op52">HUNDRED</label><br/>
<input type="radio"  name="xy5" value="e3"><label for="op53">FIFTY ONE</label><br/>
<input type="radio"  name="xy5" value="e4"><label for="op54">SIXTY</label><br/>
</div>

<br><br><br><br>
</div>
<br><br><br><br><br><br><br>
  <input type="submit" name="q1" value="SUBMIT" ><br/>

 </form>

 <%
           
    String name=request.getParameter("uname");
      String pwd=request.getParameter("pass");
      
        session.setAttribute("thename",name);
         session.setAttribute("thepw",pwd);
         %>

</body>
</html>

