package dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import bean.Equipment;
import bean.Recording;
import bean.User;

public class DBUtil {

	// url���û��������� �ŵ��ļ��� ����Ϊ����Ҫ�޸�
	private Connection conn = null;//����İ���java.sql�еĽӿ�
	private Statement st = null;
	private int resultCount = 0;// ��Ӱ�������
	private ArrayList<User> arr = new ArrayList<>();
	private ArrayList<Equipment> arre = new ArrayList<>();
	private ArrayList<Recording> arrR = new ArrayList<>();
	private ResultSet rs = null;// ���صĽ����

	private void init() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/laboratorycaiweihua?characterEncoding=UTF-8";
		String username = "root";
		String pwd = "root";
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, username, pwd);
		st = conn.createStatement();
	}

	private void closeConn() throws SQLException {
		if (st != null) {
			st.close();
		}
		if (conn != null) {
			conn.close();
		}
	}

	public int update(String sql) {
		try {
			init();
			resultCount = st.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				closeConn();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultCount;
	}

	public ResultSet query(String sql) {
		try {
			init();
			rs = st.executeQuery(sql);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return rs;// �ȱ�ر�
	}

	public void closeRs() throws SQLException {
		if (rs != null) {
			rs.close();
		}
		closeConn();
	}
}
