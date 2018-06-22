package ui;

import java.sql.SQLException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


import bean.Recording;


import service.RecordingService;


import service.impl.RecordingServiceImpl;


public class jsondemo {

	public static void main(String[] args)  {
		/*UserService service = new UserServiceImpl();
		ArrayList<User> us = null;
		try {
			us = service.queryAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		//arraylist->json
		System.out.println(us);
		System.out.println("\n");
		Gson g =new Gson();
		System.out.println(g.toJson(us));*/

		/*EquipmentService service = new EquipmentServiceImpl();
		ArrayList<Equipment> us = null;
		try {
			us = service.queryAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		//arraylist->json
		System.out.println(us);
		System.out.println("\n");
		Gson g =new Gson();
		System.out.println(g.toJson(us));
		*/
		
		RecordingService service = new RecordingServiceImpl();
		ArrayList<Recording> us=null;	
		Gson g = new Gson();
		
		try {
			us=service.queryAll();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		System.out.println("us======"+g.toJson(us));
		
	

		
	
	}
}
