package com.programmingstuff.simple.servlet;

import com.programmingstuff.simple.ws.SimpleWS;
import com.programmingstuff.simple.ws.SimpleWSService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WSClientServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            SimpleWSService service = new SimpleWSService();
            SimpleWS port = service.getSimpleWSPort();
            out.println(port.sayHello(request.getParameter("name")));
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
