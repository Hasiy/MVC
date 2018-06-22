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

import bean.Equipment;
import bean.User;
import service.EquipmentService;
import service.impl.EquipmentServiceImpl;

/**
 * Servlet implementation class EquipmentADD
 */
@WebServlet("/EquipmentADD")
public class EquipmentADD extends HttpServlet {
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
		
		EquipmentService service = new EquipmentServiceImpl();
		Equipment us=new Equipment();
		Gson g = new Gson();
		
		//添加器材
		us.setTID(request.getParameter("addTID"));
		us.setTName(request.getParameter("addTName"));
		us.setTType(Integer.valueOf(request.getParameter("addTType")));
		us.setTCount(Integer.valueOf(request.getParameter("addTCount")));
		us.setTClass(request.getParameter("addTClass"));
		us.setTStatus(Integer.valueOf(request.getParameter("addTStatus")));
		us.setTSpec(request.getParameter("addTSpec"));
		us.setTUnit(request.getParameter("addTUnit"));
		us.setTUse(request.getParameter("addTUse"));
		us.setTConfiguration(request.getParameter("addTConfiguration"));
		System.out.println(us);

		service.insert(us);
				
	}

}
