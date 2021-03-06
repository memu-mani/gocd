package com.verizon.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.verizon.service.Service;

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
		String latitude=request.getParameter("latitute");
		String longitude=request.getParameter("longitude");
		Service sl=new Service();
		double latsrc = Double.parseDouble(latitude);
		double longsrc = Double.parseDouble(longitude);
		
		try {
			//response.getWriter().write(sl.distanceCalculator(latsrc, longsrc));
			//response.getWriter().write("origin="+city+"&destination=601+F+St+NW+Washington+DC+20004");
            //RequestDispatcher rd = request.getRequestDispatcher("New.jsp");
           // rd.include(request, response);
            String str = "origin="+city+"&destination="+sl.distanceCalculator(latsrc, longsrc);
            response.getWriter().write(str);
//request.setAttribute("res", (str));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
