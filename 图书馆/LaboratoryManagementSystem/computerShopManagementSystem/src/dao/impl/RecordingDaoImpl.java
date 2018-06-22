package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


import bean.Recording;
import dao.RecordingDao;


public class RecordingDaoImpl implements RecordingDao{
	
	private DBUtil db = new DBUtil();

	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
	String str = sdf.format(date);
	
	//�����¼
	public boolean insert(Recording data) {
		String a="insert into Recording values('" 
				+ data.getUid()+ "','" 
				+ data.getUname() + "','" 
				+ data.getTID()+ "','"
				+ data.getTName()+ "','"
				+ str + "','"
				+ data.getNotes() + "')";
		System.out.println(a);
		return db.update(a) > 0;		
	}
	
	//�鿴
	public ArrayList<Recording> queryAll() throws SQLException {
		ArrayList<Recording> arrR = new ArrayList<>();
		String sql="select * from Recording";
		
		
		ResultSet rs = db.query(sql);
		System.out.println(sql);
		while (rs.next()) { // �õ�ʱ��rs���ܹر� Ӱ�����ݿ��Ч��		
			Recording data = new Recording();// ÿһ�����ݷŵ�һ��ʵ�����д���
			data.setUid(rs.getString(1));
			data.setUname(rs.getString(2));
			data.setTID(rs.getString(3));
			data.setTName(rs.getString(4));
			data.setTUpdateData(rs.getTimestamp(5));
			data.setNotes(rs.getString(6));
			arrR.add(data);
		}
		System.out.println(arrR);
		db.closeRs();// �ǵùر�
		return arrR;
	}
	
	public ArrayList<Recording> querySection(String Search) throws SQLException {
		ArrayList<Recording> arrR = new ArrayList<>();
		String a="select * from Recording where CONCAT"
				+ "(Uid,Uname,TID,TName,TUpdateData,Notes) "
				+ " like '%"+ Search+"%'";
		ResultSet rs = db.query(a);
		System.out.println(a);
		while (rs.next()) { 
			Recording data = new Recording();// ÿһ�����ݷŵ�һ��ʵ�����д���
			data.setUid(rs.getString(1));
			data.setUname(rs.getString(2));
			data.setTID(rs.getString(3));
			data.setTName(rs.getString(4));
			data.setTUpdateData(rs.getTimestamp(5));
			data.setNotes(rs.getString(6));
			arrR.add(data);
		}
		db.closeRs();
		System.out.println(arrR);
		return arrR;
	}
	
	
}
