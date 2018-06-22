package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

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
 * Servlet implementation class ClassSearchAll
 */
@WebServlet("/ClassSearchAll")
public class ClassSearchAll extends HttpServlet {
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
		response.setHeader("Access-Control-Allow-Origin", "*"); // ������Щurl���Կ������󵽱���
		response.setHeader("Access-Control-Allow-Methods", "POST"); // ��������󷽷���һ����GET,POST,PUT,DELETE,OPTIONS
		response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type"); // ������Щ����ͷ���Կ���
		
		
		Gson g =new Gson();
		EquipmentService service = new EquipmentServiceImpl();
		ArrayList<Equipment>  eq= null;
		try {
			eq = service.queryAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		Set set=new TreeSet(); 
		int i=0;
		for (Equipment equipment : eq) {
			set.add(eq.get(i).getTClass());
			System.out.println("=================="+g.toJson(eq.get(i).getTClass()));
			i++;
		}		
		set.remove("0");
		response.getWriter().print(g.toJson(set));	
		System.out.println("set"+set);
	}

}
