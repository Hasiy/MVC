package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import bean.User;

/**
 * ר����������User��������ɾ�Ĳ��
 *
 */
public interface UserDao {

	public boolean insert(User data);// ����

	public boolean update(User data);// �޸�
	public boolean PwdChange(String uID, String uPwd);// �޸�����

	public boolean delete(int eid);// ɾ��
	
	public ArrayList<User> querySection(String Search) throws SQLException;

	public ArrayList<User> querySex(int sex) throws SQLException;// Ȩ�޲�ѯ
	public ArrayList<User> queryUPriority(int upriority) throws SQLException;// Ȩ�޲�ѯ
	public ArrayList<User> queryAll() throws SQLException, SQLException;// ��ѯ��ȡ
	public ArrayList<User> queryLogin(String uID, String uPwd) throws SQLException, SQLException;// ��ѯ�û���

	
	
}
