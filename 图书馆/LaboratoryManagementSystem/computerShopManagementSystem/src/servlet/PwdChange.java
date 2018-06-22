package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import bean.User;
import service.UserService;
import service.impl.UserServiceImpl;

/**
 * Servlet implementation class PwdChange
 */
@WebServlet("/PwdChange")
public class PwdChange extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
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
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setHeader("Access-Control-Allow-Origin", "*"); // 允许哪些url可以跨域请求到本域
		response.setHeader("Access-Control-Allow-Methods", "POST"); // 允许的请求方法，一般是GET,POST,PUT,DELETE,OPTIONS
		response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type"); // 允许哪些请求头可以跨域
		
		UserService service = new UserServiceImpl();	
		String uID=request.getParameter("UID");
		String uPwd=request.getParameter("newPassword");
		System.out.println("uid="+uID+" : "+"uPwd="+uPwd);
		service.PwdChange(uID, uPwd);
		
		
	}

}
