package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import bean.Recording;
import service.RecordingService;
import service.impl.RecordingServiceImpl;

/**
 * Servlet implementation class RecordingADD
 */
@WebServlet("/RecordingADD")
public class RecordingADD extends HttpServlet {
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

		RecordingService service = new RecordingServiceImpl();
		Recording rd = new Recording();
		Gson g = new Gson();

		/*.setDateFormat("yyyy-MM-dd HH:mm")
		.create();*/
		ArrayList<Recording> re = null;

		String Search = request.getParameter("SearchRecording");
		
		System.out.println("Search="+Search);
		/*if (Search.equals("SearchALL")) {
			try {
				re = service.queryAll();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			response.getWriter().print(g.toJson(re));
			System.out.println("us======" + g.toJson(re));
			System.out.println("us=" +re);
		}*/
		
		switch (Search) {
		
			case "SearchALL":
			{
				try {
					re = service.queryAll();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				response.getWriter().print(g.toJson(re));
				System.out.println("us======" + g.toJson(re));
				System.out.println("us=" +re);
				}
			System.out.println(re);
			break;
			
			/*case "SearchTStatus":
			{
				try {
					us=service.queryTStatus(Integer.valueOf(TStatus));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				response.getWriter().print(g.toJson(us));	
				}
			break;*/

		default:
			try {
				re=service.querySection(Search);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.getWriter().print(g.toJson(re));	
			break;
		}
		
		

		rd.setUid(request.getParameter("RecordingUID"));
		rd.setUname(request.getParameter("RecordingUname"));
		rd.setTID(request.getParameter("DpdateTID"));
		rd.setTName(request.getParameter("DpdateTName"));
		rd.setNotes(request.getParameter("RecordingNote"));

		System.out.println("rd!!!!!!!!!!!!!!!!!!!!!!"+rd);

		if( request.getParameter("RecordingUID")!=null&&
			request.getParameter("RecordingUname")!=null&&
			request.getParameter("DpdateTID")!=null&&
			request.getParameter("DpdateTName")!=null&&
			request.getParameter("RecordingNote")!=null){
			
			service.insert(rd);
		}

	}

}
