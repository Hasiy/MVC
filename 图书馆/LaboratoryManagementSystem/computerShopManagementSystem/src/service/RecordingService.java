package service;

import java.sql.SQLException;
import java.util.ArrayList;

import bean.Recording;

public interface RecordingService {

	boolean insert(Recording data) ;
	ArrayList<Recording> queryAll() throws SQLException ;
	
	ArrayList<Recording> querySection(String Search) throws SQLException ;

}
