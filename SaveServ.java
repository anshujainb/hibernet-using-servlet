package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLmanager;
import com.pojo.Pancard;
import com.pojo.User;

/**
 * Servlet implementation class SaveServ
 */
@WebServlet("/SaveServ")
public class SaveServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLmanager bl =new BLmanager();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pan=request.getParameter("pnum");
		Pancard p = new Pancard();
		String name= request.getParameter("name");
		System.out.println(name);
		User u=new User();
		p.setPnum(pan);
		bl.Insert(p);
		p=bl.serachByPanNum(pan);
		u.setPancard(p);
		u.setName(name);
		bl.InsertUser(u);
		
	}

}
