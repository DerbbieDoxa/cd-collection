<%-- 
    Document   : view_genres
    Created on : May 16, 2023, 11:05:50 AM
    Author     : iamdveloper
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="view-genre">
    <h1>List of all Genre

        <hr />

    </h1>


    <div class="genre-list">

        <c:if test="${not empty genres}">

          
                <c:forEach var="col" items="${genres}">
           
                    <div class="single-genre">
           
                        <div class="genre-cover"></div>
                        <p>${col.getGenreName()}</p>
                    </div>
                </c:forEach>
      

        </c:if>

        <c:if test="${not empty error}">
            <h1>${error}</h1>
        </c:if>
    </div>



</div>


<!--         <div class="single-genre">
                         Image goes here 
                        <div class="genre-cover"></div>
                        <p>Genre name goes here</p>
                    </div>-->