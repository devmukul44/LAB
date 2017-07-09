<%-- 
    Document   : searchengine
    Created on : 29 Apr, 2015, 3:13:53 PM
    Author     : mock1
--%>

<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Engine</title>
    </head>
    <body>
        <% String[] fileNames = {"one.txt","two.txt","three.txt"}; %>
        <%
            
                
                String searchWord = request.getParameter("search");
                for(int i = 0; i < 3; i++){
                    try{
                        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ANAND UJJWAL\\Documents\\NetBeansProjects\\search_engine\\web\\"+fileNames[i]));
                        String line,all;
                        all = new String();
                        while((line = br.readLine()) != null){
                            all += line;
                        }
                        if(all.indexOf(searchWord) != -1)
                            out.println("<a href = " + fileNames[i] + ">"
                            + fileNames[i]+"</a></br>");
                        
                            //out.println("Not present in file " + fileNames[i] +"</br>");
                    }catch(Exception g){out.println(g);}
                    }
            %>
    </body>
</html>
