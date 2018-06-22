package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import bean.Recording;

/**
 * ר����������Recording�����ļ�¼
 *
 */
public interface RecordingDao {
	public boolean insert(Recording data) ;// ����	
	public ArrayList<Recording> queryAll() throws SQLException ;
	
	public ArrayList<Recording> querySection(String Search) throws SQLException ;
}
