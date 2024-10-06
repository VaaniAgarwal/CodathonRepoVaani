<%-- 
    Document   : addBook
    Created on : 06-Oct-2024, 2:13:35 pm
    Author     : VAANI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Books Dashboard</title>
    </head>
    <body>
        <h1>Add New Book</h1>
        <form method="POST" action="AddBookServlet" >
            Book ID <input type="number" name="bookid" id="bookid"><br><br>
            Book Name <input type="text" name="bname" id="bname"><br><br>
            Book Author <input type="text" name="author" id="author"><br><br>
            Book Publisher <input type="text" name="publish" id="publish"><br><br>
            Book Genre <input type="text" name="genre" id="genre"><br><br>
            Book Price <input type="number" name="price" id="price"><br><br>
            Description <input type="text" name="desc" id="desc"><br><br>
            Stock Available <input type="number" name="avail" id="avail"><br><br>
            <input type="file" id="bookPicture" name="bookPicture" accept=".jpg, .jpeg, .png, .gif" class="book-input" required>
            <input type="Submit" value="Add New Book">
        </form>
        
        <%String resultData = (String)session.getAttribute("result");
            String valColor= (String)session.getAttribute("fontcolor");
            System.out.println ("COLOR"+valColor);
            if(resultData!=null){
            
            %>
            <p style="font-family:verdana;color:<%=valColor%>">
            <%out.println("STATUS:-->"+resultData);
                }
            %>
    </body>
</html>
