package servlet;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import bean.Equipment;

import service.EquipmentService;
import service.UserService;
import service.impl.EquipmentServiceImpl;
import service.impl.UserServiceImpl;

/**
 * Servlet implementation class EquipmentUpdate
 */
@WebServlet("/EquipmentUpdate")
public class EquipmentUpdate extends HttpServlet {
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
		
		EquipmentService service = new EquipmentServiceImpl();
		Equipment us=new Equipment();
		Gson g = new Gson();
		
		us.setTID(request.getParameter("DpdateTID"));
		us.setTName(request.getParameter("DpdateTName"));
		us.setTType(Integer.valueOf(request.getParameter("DpdateTType")));
		us.setTCount(Integer.valueOf(request.getParameter("DpdateTCount")));
		us.setTClass(request.getParameter("DpdateTClass"));
		us.setTStatus(Integer.valueOf(request.getParameter("DpdateTStatus")));
		us.setTSpec(request.getParameter("DpdateTSpec"));
		us.setTUnit(request.getParameter("DpdateTUnit"));
		us.setTUse(request.getParameter("DpdateTUse"));
		us.setTConfiguration(request.getParameter("DpdateTConfiguration"));
		
		System.out.println(us);
		service.update(us);
		/*service.update(us);*/
	}

}
