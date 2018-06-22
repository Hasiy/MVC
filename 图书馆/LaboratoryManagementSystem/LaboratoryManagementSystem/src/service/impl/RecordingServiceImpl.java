package service.impl;

import java.sql.SQLException;
import java.util.ArrayList;

import bean.Recording;
import dao.RecordingDao;
import dao.impl.RecordingDaoImpl;
import service.RecordingService;


public class RecordingServiceImpl implements RecordingService{

	private RecordingDao dao = new RecordingDaoImpl();
	
	public boolean insert(Recording data){
		return dao.insert(data);
	}
	
	public ArrayList<Recording> queryAll() throws SQLException{
		return dao.queryAll();	
	}
	
	public ArrayList<Recording> querySection(String Search) throws SQLException {
		return dao.querySection(Search);
	}
}
