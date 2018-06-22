package service.impl;

import java.sql.SQLException;
import java.util.ArrayList;

import bean.User;
import dao.UserDao;
import dao.impl.UserDaoImpl;
import service.UserService;

public class UserServiceImpl implements UserService{
	
private UserDao dao = new UserDaoImpl();

	public boolean insert(User data) {
		return dao.insert(data);
	}
	public boolean update(User data) {
		return dao.update(data);
	}
	
	// �޸�����
	public boolean PwdChange(String uID, String uPwd){
		return dao.PwdChange(uID,uPwd);
	}
	
	public boolean delete(int eid){
		return dao.delete(eid);
	}
	public ArrayList<User> queryAll() throws SQLException {
		return dao.queryAll();
	}
	
	//��¼��ѯ
	public ArrayList<User> queryLogin(String uID, String uPwd) throws SQLException{
		return dao.queryLogin(uID, uPwd);
	}
	
	public ArrayList<User> querySection(String Search) throws SQLException{
		return dao.querySection(Search);
	}
	
	public ArrayList<User> queryUPriority(int upriority) throws SQLException{
		return  dao.queryUPriority(upriority);
		
	}// Ȩ�޲�ѯ
	
	public ArrayList<User> querySex(int sex) throws SQLException{
		return  dao.querySex(sex);
	}// Ȩ�޲�ѯ
	
}
	