package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        
        String name = request.getParameter("user_name");
        String password = request.getParameter("user_password");
        String email = request.getParameter("user_email");
        String gender = request.getParameter("user_gender");
        String course = request.getParameter("usel_course");
        String Cond = request.getParameter("condition");

        if (Cond != null) {

            if (Cond.equals("checked")) {
                out.println("<h2>Registation Successful</h2>");
                out.println("<h2>Name : " + name + "</h2>");
                out.println("<h2>Password : " + password + "</h2>");
                out.println("<h2>Email : " + email + "</h2>");
                out.println("<h2>Gender : " + gender + "</h2>");
                out.println("<h2>Course : " + course + "</h2>");
            } else {

                out.println("<h2>You have not accepted terms and conditions</h2>");
            }

        } else {
            out.println("<h2>You have not accepted terms and conditions</h2>");
        }
    }
}
