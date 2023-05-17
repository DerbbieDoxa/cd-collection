<%-- 
    Document   : create_genre
    Created on : May 16, 2023, 11:04:58 AM
    Author     : iamdveloper
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="create-genre">
    <c:if test="${not empty message}">
        <div class="alert alert-success alert-dismissible fade show" role="alert">
            ${message}
            <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
        </div>
    </c:if>

    <form method='post' action="${pageContext.request.contextPath}/genres">
        <label for="genre_name">Create Genre</label>
        <input name="genre_name" placeholder="Enter genre name" required="true"/>

        <button class="save-btn" type="submit">Save</button>
    </form>
</div>
