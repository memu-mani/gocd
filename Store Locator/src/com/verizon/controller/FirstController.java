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
public class FirstController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	System.out.println("get");
		String city= "chennai";//request.getParameter("city");
		String latitude = "85.12";//request.getParameter("latitude");
		String longitude = "102.54";//request.getParameter("longitude");
		Service sl=new Service();
		double latsrc = Double.parseDouble(latitude);
		double longsrc = Double.parseDouble(longitude);
		
		try {
			String destination=sl.distanceCalculator(latsrc, longsrc);
			System.out.println(destination);
			//response.getWriter().write(destination);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post");
		String city= request.getParameter("city");
		String latitude = request.getParameter("latitude");
		String longitude = request.getParameter("longitude");
		Service sl=new Service();
		double latsrc = Double.parseDouble(latitude);
		double longsrc = Double.parseDouble(longitude);
		
		try {
//			response.getWriter().write(sl.distanceCalculator(latsrc, longsrc));

            RequestDispatcher rd = request.getRequestDispatcher("New.jsp");
            rd.include(request, response);
            String str = sl.distanceCalculator(latsrc, longsrc);
request.setAttribute("res", (str));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
