package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post");
		String city=request.getParameter("city");
		//String latitude=request.getParameter("latitute");
		//String longitude=request.getParameter("longitude");
		//Serviceclass sc=new Serviceclass();
		//sc.passvalues(city,latitude,longitude);
		//response.getWriter().write("origin="+latitude+","+longitude+"&destination=delhi");
		response.getWriter().write("origin="+city+"&destination=601+F+St+NW+Washington+DC+20004");
	}

}
