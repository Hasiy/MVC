package service;

import java.sql.SQLException;
import java.util.ArrayList;

import bean.User;

public interface UserService {
	boolean insert(User data);

	boolean update(User data);
	
	boolean PwdChange(String uID, String uPwd);// �޸�����

	boolean delete(int eid);

	ArrayList<User> queryAll() throws SQLException;
	ArrayList<User> queryLogin(String uID, String uPwd) throws SQLException;
	public ArrayList<User> querySection(String Search) throws SQLException;
	public ArrayList<User> queryUPriority(int upriority) throws SQLException;// Ȩ�޲�ѯ
	public ArrayList<User> querySex(int sex) throws SQLException;// �Ա��ѯ
	
	
}
