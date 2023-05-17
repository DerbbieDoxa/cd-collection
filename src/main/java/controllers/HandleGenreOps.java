/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controllers;

import admin.AdminClass;
import genre.Genre;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 *
 * @author iamdveloper
 */
public class HandleGenreOps extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        AdminClass ad_genre = new AdminClass();
        RequestDispatcher rd = request.getRequestDispatcher("main.jsp");

        if (request.getMethod() == "POST") {

//            Get genre name
            String name = request.getParameter("genre_name");

            if (!name.isEmpty()) {
                try {
//                    Save data here
                    Genre genre = new Genre(name);
                    int insertRowsAffected = ad_genre.insertGenre(genre);

//                    Get updated data here
                    ArrayList<Genre> allGenre = ad_genre.getAll();

                    request.setAttribute("genres", allGenre);

                    request.setAttribute("message", "Data saved successfully!");

                    rd.forward(request, response);
                } catch (Exception e) {
                    request.setAttribute("message", "Error saving data: " + e.getMessage());
                    rd.forward(request, response);
                }

            } else {
                request.setAttribute("message", "Genre name cannot be empty");
                rd.forward(request, response);
            }

//            Handle Get requests
        } else if (request.getMethod() == "GET") {

            try {

                ArrayList<Genre> allGenre = ad_genre.getAll();

                request.setAttribute("genres", allGenre);

                rd.forward(request, response);
            } catch (Exception e) {
                request.setAttribute("error", e.getMessage());
                rd.forward(request, response);
            }

//            Handle Delete
        } else if (request.getMethod() == "DELETE") {
//            Handle update
        } else if (request.getMethod() == "PUT") {
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
