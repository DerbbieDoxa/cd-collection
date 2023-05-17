<%-- 
    Document   : main.jsp
    Created on : May 16, 2023, 11:05:33 AM
    Author     : iamdveloper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="./assets/styles.css" />
        <title>CD Collection</title>
    </head>
    
    <body>
        <main class="main-content">
            <!-- This will contain the create genre and display the available genres -->
            <div class="create-genre-container">
                <jsp:include page="create_genre.jsp" flush="true"></jsp:include>        
            </div>

            <div class="view-genre-container">
                <jsp:include page="view_genres.jsp" flush="true"></jsp:include>
            </div>
        </main>
    </body>
</html>
