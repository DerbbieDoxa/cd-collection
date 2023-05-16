<%-- 
    Document   : view_genres
    Created on : May 16, 2023, 11:05:50 AM
    Author     : iamdveloper
--%>

<div class="view-genre">
    <h1>List of all Genre

        <hr />

    </h1>


    <div class="genre-list">
        <% if (request.getAttribute("genres") != null) { %>
        <h1>Data available:</h1>
        <ul>
            <l1>Data gere</l1>
        </ul>
        <% } else { %>
        <p>${error}.</p>
        <% } %>

    </div>



</div>


<!--         <div class="single-genre">
                         Image goes here 
                        <div class="genre-cover"></div>
                        <p>Genre name goes here</p>
                    </div>-->