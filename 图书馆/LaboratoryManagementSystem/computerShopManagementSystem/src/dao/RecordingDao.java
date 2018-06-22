package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import bean.Recording;

/**
 * 专门用来处理Recording这个表的记录
 *
 */
public interface RecordingDao {
	public boolean insert(Recording data) ;// 新增	
	public ArrayList<Recording> queryAll() throws SQLException ;
	
	public ArrayList<Recording> querySection(String Search) throws SQLException ;
}
