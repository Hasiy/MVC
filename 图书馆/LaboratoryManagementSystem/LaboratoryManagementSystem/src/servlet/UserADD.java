package servlet;

import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class UserADD
 */
@WebServlet("/UserADD")
public class UserADD extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setHeader("Access-Control-Allow-Origin", "*"); // ������Щurl���Կ������󵽱���
		response.setHeader("Access-Control-Allow-Methods", "POST"); // ��������󷽷���һ����GET,POST,PUT,DELETE,OPTIONS
		response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type"); // ������Щ����ͷ���Կ���

		UserService use=new UserServiceImpl();
		User us=new User();	
		
		//������û�
		us.setUID(request.getParameter("addUID"));
		us.setUPwd(request.getParameter("addUPwd"));
		us.setUName(request.getParameter("addUName"));
		us.setUPriority(Integer.valueOf(request.getParameter("addUPriority")));
		us.setUSex(Integer.valueOf(request.getParameter("addUSex")));
		us.setUIDcard(request.getParameter("addUIDcard"));
		us.setUPosition(request.getParameter("addUPosition"));
		us.setUMajor(request.getParameter("addUMajor"));
		System.out.println(us);
		use.insert(us);
		
		//ɾ���û�
		String delete=request.getParameter("DeleteUID");
		System.out.println(delete);
		
		PrintWriter pw = response.getWriter();	
		
	}
	

}
