package ui;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.google.gson.Gson;

import bean.Equipment;
import bean.User;
import service.EquipmentService;
import service.UserService;
import service.impl.EquipmentServiceImpl;
import service.impl.UserServiceImpl;

public class demo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
	   /* UserService service = new UserServiceImpl();
		ArrayList<User> us;
		us = service.queryAll();	
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
			
		Set set=new TreeSet(); 
		int i=0;
		for (Equipment equipment : us) {
			set.add(us.get(i).getTClass());
			System.out.println("=================="+g.toJson(us.get(i).getTClass()));
			i++;
		}		
		System.out.println("set"+set);
		
		System.out.println(g.toJson(set));
		
		set.remove("0");
		
		System.out.println(set);
		*/
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyƒÍMM‘¬dd»’HH-mm-ss");
		String str = sdf.format(date);
		System.out.println(str);
		
		

		String sql="select * from t_class where 1=1 ";
		
		
			sql+=" and cid=xxxx";

		
			sql+=" and cname like '%%'";
			
		
		sql+=" limit 5,5";
		System.out.println(sql);
		
	}

}
