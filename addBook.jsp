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
        <h1 >Add New Book</h1>
        <form method="POST" action="" >
            <table border="1" style="border: 1px solid #ddd; border-radius: 5px;">
            <!-- Book ID -->
            <tr>
                <td><label for="book-id">Book ID:</label></td>
                <td><input type="text" id="bookid" name="bookid" required></td>
            </tr>

            <!-- Book Name -->
            <tr>
                <td><label for="book-name">Book Name:</label></td>
                <td><input type="text" id="bname" name="bname" required></td>
            </tr>

            <!-- Book Author -->
            <tr>
                <td><label for="book-author">Book Author:</label></td>
                <td><input type="text" id="author" name="author" required></td>
            </tr>

            <!-- Book Publisher -->
            <tr>
                <td><label for="book-publisher">Book Publisher:</label></td>
                <td><input type="text" id="publish" name="publish" required></td>
            </tr>

            <!-- Book Genre -->
            <tr>
                <td><label for="book-genre">Book Genre:</label></td>
                <td><input type="text" id="genre" name="genre" required></td>
            </tr>

            <!-- Book Price -->
            <tr>
                <td><label for="book-price">Book Price ($):</label></td>
                <td><input type="number" id="price" name="price" step="0.01" required></td>
            </tr>

            <!-- Book Description -->
            <tr>
                <td><label for="book-description">Description:</label></td>
                <td><textarea id="desc" name="desc" rows="4" required></textarea></td>
            </tr>

            <!-- Stock Available -->
            <tr>
                <td><label for="stock-available">Stock Available:</label></td>
                <td><input type="number" id="avail" name="avail" required></td>
            </tr>

            <!-- Event ID -->
            <tr>
                <td><label for="event-id">Event ID:</label></td>
                <td><input type="text" id="eventid" name="eventid" required></td>
            </tr>

            <!-- Book Image -->
            <tr>
                <td><label for="book-image">Book Image:</label></td>
                <td><input type="file" id="bookPicture" name="bookPicture" accept="image/*" required></td>
            </tr>

            <!-- Submit Button -->
            <tr>
                <td colspan="2" style="text-align:center;">
                    <input type="submit" value="Submit">
                </td>
            </tr>
        </table>
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
