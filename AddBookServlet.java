/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.book.controller;
import com.book.dao.*;
import com.book.pojo.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//@WebServlet(name = "AddBookServlet", urlPatterns = {"/AddBookServlet"})
public class AddBookServlet extends HttpServlet {
    RequestDispatcher  rd=null;
    HttpSession session=null;
    BookDAO bookDAO=null;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        session = request.getSession(true);
        try (PrintWriter out = response.getWriter()) {
            Book book=new Book(Integer.parseInt(request.getParameter("bookid")),
            request.getParameter("bname"),
            request.getParameter("author"),
            request.getParameter("publish"),
            request.getParameter("genre"),
            Integer.parseInt(request.getParameter("price")),
            request.getParameter("desc"),
            Integer.parseInt(request.getParameter("avail")),
            Byte.parseByte(request.getParameter("bookPicture")),
            Integer.parseInt(request.getParameter("eventid"))//Check this one not sure about it
            );
            boolean hasInserted = bookDAO.executeInsert(book);
            rd = request.getRequestDispatcher("addBook.jsp");
            if(hasInserted){
                session.setAttribute("fontcolor", "green");
                session.setAttribute("result", "NEW BOOK ADDED"); 
            }
            else{
                session.setAttribute("fontcolor", "red");
                session.setAttribute("result", "NEW BOOK CREATION FAILED");
            }
            rd.forward(request, response);
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
    @Override
    public void init(ServletConfig config)throws ServletException{
        System.out.println("Servlet Initialized");
        try {
            bookDAO = BookDAO.getInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddBookServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
