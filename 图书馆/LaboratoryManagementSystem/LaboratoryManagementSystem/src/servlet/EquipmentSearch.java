package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import bean.Equipment;
import service.EquipmentService;
import service.impl.EquipmentServiceImpl;


/**
 * Servlet implementation class EquipmentSearch
 */
@WebServlet("/EquipmentSearch")
public class EquipmentSearch extends HttpServlet {
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
		response.setHeader("Access-Control-Allow-Methods","POST"); // 允许的请求方法，一般是GET,POST,PUT,DELETE,OPTIONS
		response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type"); // 允许哪些请求头可以跨域
	
		EquipmentService service = new EquipmentServiceImpl();
		ArrayList<Equipment> us=null;
		Gson g = new Gson();
	
		String Search = request.getParameter("Search");
		String TClass = request.getParameter("TClass");
		String TStatus = request.getParameter("TStatus");
		
		System.out.println(Search);
		System.out.println(TStatus);
		
		switch (Search) {
		
			case "SearchALL":
			{
				try {
					us=service.queryAll();
					us.get(11);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				response.getWriter().print(g.toJson(us));	
				}
			System.out.println(us);
			break;

			case "SearchClass":
			{
				try {
					us=service.queryClass(TClass);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				response.getWriter().print(g.toJson(us));	
				}
			break;
			
			case "SearchTStatus":
			{
				try {
					us=service.queryTStatus(Integer.valueOf(TStatus));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				response.getWriter().print(g.toJson(us));	
				}
			break;

		default:
			try {
				us=service.querySection(Search);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.getWriter().print(g.toJson(us));	
			break;
		}
		
			
			/*try {
				us=service.queryAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			response.getWriter().print(g.toJson(us));	*/

			
		
	}
	
}
