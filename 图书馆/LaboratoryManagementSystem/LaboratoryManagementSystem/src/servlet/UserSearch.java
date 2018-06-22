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
 * Servlet implementation class UserSearch
 */
@WebServlet("/UserSearch")
public class UserSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSearch() {
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
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setHeader("Access-Control-Allow-Origin", "*"); // 允许哪些url可以跨域请求到本域
		response.setHeader("Access-Control-Allow-Methods","POST"); // 允许的请求方法，一般是GET,POST,PUT,DELETE,OPTIONS
		response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type"); // 允许哪些请求头可以跨域
	
		UserService service = new UserServiceImpl();
		ArrayList<User> us=null;
		Gson g = new Gson();
		PrintWriter pw = response.getWriter();
		String Search = request.getParameter("Search");
	
		System.out.println(Search);
		
		
		switch (Search) {
		
		case "SearchALL":
		{
			try {
				us=service.queryAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.getWriter().print(g.toJson(us));	
			
			}
		
		break;
		
		case "SearchUPriority":
			String UPriority = request.getParameter("UPriority");
			{
			try {
				us=service.queryUPriority(Integer.valueOf(UPriority));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.getWriter().print(g.toJson(us));	
			}
		System.out.println(UPriority);
		System.out.println(g.toJson(us));
		break;
		
		case "Searchsex":
			String Usex = request.getParameter("Usex");
			{
			try {
				us=service.querySex(Integer.valueOf(Usex));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.getWriter().print(g.toJson(us));	
			}
		System.out.println(Usex);
		System.out.println(g.toJson(us));
		break;



		default:
		{
			try {
				us=service.querySection(Search);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.getWriter().print(g.toJson(us));
		}
			break;
		}
	
	}

}
