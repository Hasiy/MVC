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

import bean.User;
import service.UserService;
import service.impl.UserServiceImpl;

/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("servlet调用正常（默认get方法）");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setHeader("Access-Control-Allow-Origin", "*"); // 允许哪些url可以跨域请求到本域
		response.setHeader("Access-Control-Allow-Methods", "POST"); // 允许的请求方法，一般是GET,POST,PUT,DELETE,OPTIONS
		response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type"); // 允许哪些请求头可以跨域
		
		UserService service = new UserServiceImpl();
		ArrayList<User> us = null;
		Gson g = new Gson();
		PrintWriter pw = response.getWriter();
		String UID = request.getParameter("uidlogin");
		String UPwd = request.getParameter("upwdlogin");
		System.out.println(UID);
		System.out.println(UPwd);
		
		try {
			us=service.queryLogin(UID,UPwd);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.getWriter().print(g.toJson(us));//arraylist->json
		
		/*try {
			us = service.queryAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < us.size(); i++) {
			for (int j = 0 ; j < us.size(); j++) {
				if (us.get(i).getUID().equals(UID) && us.get(j).getUPwd().equals(UPwd)) {
					System.out.println(UID);
					System.out.println(UPwd);
					response.getWriter().print(g.toJson(us.get(i)));//arraylist->json
					return;
				} else {
					pw.write("1");//查不到
					return;
				}
			}
		}*/
	}

}
