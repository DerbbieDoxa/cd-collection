<%-- 
    Document   : create_genre
    Created on : May 16, 2023, 11:04:58 AM
    Author     : iamdveloper
--%>

<div class="create-genre">
    <form method='post' action="${pageContext.request.contextPath}/genres">
        <label for="genre_name">Create Genre</label>
        <input name="genre_name" placeholder="Enter genre name" required="true"/>
        
        <button type="submit">Save</button>
    </form>
</div>
