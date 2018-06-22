package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import service.UserService;
import service.impl.UserServiceImpl;

/**
 * Servlet implementation class UserUpdate
 */
@WebServlet("/UserUpdate")
public class UserUpdate extends HttpServlet {
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
		
		UserService service = new UserServiceImpl();	
		User us=new User();	
		
		us.setUID(request.getParameter("DpdateUID"));
		us.setUPwd(request.getParameter("DpdateUPwd"));
		us.setUName(request.getParameter("DpdateUName"));
		us.setUPriority(Integer.valueOf(request.getParameter("DpdateUPriority")));
		us.setUSex(Integer.valueOf(request.getParameter("DpdateUSex")));
		us.setUIDcard(request.getParameter("DpdateUIDcard"));
		us.setUPosition(request.getParameter("DpdateUPosition"));
		us.setUMajor(request.getParameter("DpdateUMajor"));
		
		System.out.println(us);
		service.update(us);
		
	}

}
