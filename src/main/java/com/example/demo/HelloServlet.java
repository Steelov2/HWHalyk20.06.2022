package com.example.demo;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        // получаем параметр id
        String name = request.getParameter("name");
        String position = request.getParameter("position");


        try {
            writer.println("<h2>Name:" + name + "</h2>");
            writer.println("<h2>Position:" + position + "</h2>");
        } finally {
            writer.close();
        }
    }
}