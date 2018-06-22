package servlet;

import java.io.IOException;
import java.sql.SQLException;
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
import service.UserService;
import service.impl.EquipmentServiceImpl;
import service.impl.UserServiceImpl;


/**
 * Servlet implementation class EquipmentChange
 */
@WebServlet("/EquipmentChange")
public class EquipmentChange extends HttpServlet {
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
		ArrayList<Equipment> us=null;
		String Search=request.getParameter("Search");
		if(Search==null){
			System.out.println("1111");
		}
		
		Gson g = new Gson();
		
		try {
			us=service.queryChange(Search);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.getWriter().print(g.toJson(us));	
			
		String TID=request.getParameter("DpdateTID");
		String TClass=request.getParameter("DpdateTClass");
		if(TID==null||TClass==null){
			System.out.println("未输入更改实验室");
		}else{
			System.out.println("TID="+TID+" : "+"TClass="+TClass);
			service.updateTClass(TID,TClass);
		}
	}

}
