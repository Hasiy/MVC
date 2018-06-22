package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.User;
import dao.UserDao;

public class UserDaoImpl implements UserDao {

	private DBUtil db = new DBUtil();

	//����
	public boolean insert(User data) {
		return db.update("insert into User values('" 
			+ data.getUID()+ "','" 
			+ data.getUPwd() + "','" 
			+ data.getUName() + "','" 
			+ data.getUPriority() + "','"
			+ data.getUSex() + "','"
			+ data.getUIDcard() + "','"
			+ data.getUPosition() + "','"
			+ data.getUMajor() + "')") > 0;
	}

	//�޸�
	public boolean update(User data) {

		String update="update user set UPwd='" + data.getUPwd()
		+"',UName='" + data.getUName()
		+"',UPriority='" + data.getUPriority()
		+"',USex='" + data.getUSex()
		+"',UIDcard='" + data.getUIDcard()
		+"',UPosition='" + data.getUPosition()
		+"',UMajor='" + data.getUMajor() 
		+"'where uid = "+data.getUID()+"";
		System.out.println(update);
		
		return db.update(update)>0;
	}

	//ɾ��
	public boolean delete(int uid) {
		return db.update("delete from User where Uid=" + uid) > 0;
	}

	//�鿴
	public ArrayList<User> queryAll() throws SQLException {
		ArrayList<User> arr = new ArrayList<>();
		ResultSet rs = db.query("select * from user");
		while (rs.next()) { // �õ�ʱ��rs���ܹر� Ӱ�����ݿ��Ч��
			User data = new User();// ÿһ�����ݷŵ�һ��ʵ�����д���
			data.setUID(rs.getString(1));
			data.setUPwd(rs.getString(2));
			data.setUName(rs.getString(3));
			data.setUPriority(rs.getInt(4));
			data.setUSex(rs.getInt(5));
			data.setUIDcard(rs.getString(6));
			data.setUPosition(rs.getString(7));
			data.setUMajor(rs.getString(8));
			arr.add(data);
		}
		db.closeRs();// �ǵùر�
		return arr;
	}
	
	//��ѯ�Ա�
	public ArrayList<User> querySex(int sex) throws SQLException{
		ArrayList<User> arr = new ArrayList<>();
		ResultSet rs = db.query("select * from user where USex="+sex );
		while (rs.next()) { // �õ�ʱ��rs���ܹر� Ӱ�����ݿ��Ч��
			User data = new User();// ÿһ�����ݷŵ�һ��ʵ�����д���
			data.setUID(rs.getString(1));
			data.setUPwd(rs.getString(2));
			data.setUName(rs.getString(3));
			data.setUPriority(rs.getInt(4));
			data.setUSex(rs.getInt(5));
			data.setUIDcard(rs.getString(6));
			data.setUPosition(rs.getString(7));
			data.setUMajor(rs.getString(8));
			arr.add(data);
		}
		db.closeRs();// �ǵùر�
		return arr;
	}
	
	
	//Ȩ�޲�ѯ
	public ArrayList<User> queryUPriority(int upriority) throws SQLException {
		ArrayList<User> arr = new ArrayList<>();
		ResultSet rs = db.query("select * from user where UPriority="+upriority );
		while (rs.next()) { // �õ�ʱ��rs���ܹر� Ӱ�����ݿ��Ч��
			User data = new User();// ÿһ�����ݷŵ�һ��ʵ�����д���
			data.setUID(rs.getString(1));
			data.setUPwd(rs.getString(2));
			data.setUName(rs.getString(3));
			data.setUPriority(rs.getInt(4));
			data.setUSex(rs.getInt(5));
			data.setUIDcard(rs.getString(6));
			data.setUPosition(rs.getString(7));
			data.setUMajor(rs.getString(8));
			arr.add(data);
		}
		db.closeRs();// �ǵùر�
		return arr;
	}
	
	//��¼��ѯ
	public ArrayList<User> queryLogin(String uID,String uPwd) throws SQLException {
		ArrayList<User> arr = new ArrayList<>();
		String a="select * from user where uid="+ uID +" and upwd=" + uPwd;
		ResultSet rs = db.query(a);
		System.out.println(a);
		while (rs.next()) { 
			User data = new User();
			data.setUID(rs.getString(1));
			data.setUPwd(rs.getString(2));
			data.setUName(rs.getString(3));
			data.setUPriority(rs.getInt(4));
			data.setUSex(rs.getInt(5));
			data.setUIDcard(rs.getString(6));
			data.setUPosition(rs.getString(7));
			data.setUMajor(rs.getString(8));
			arr.add(data);
		}
		db.closeRs();
		return arr;
	}
	
	//ģ����ѯ
	public ArrayList<User> querySection(String Search) throws SQLException {
		ArrayList<User> arr = new ArrayList<>();
		String a="select * from user where CONCAT"
				+ "(uid,upwd,uname,upriority,usex,uidcard,uposition,umajor) "
				+ " like '%"+ Search+"%'";
		ResultSet rs = db.query(a);
		System.out.println(a);
		while (rs.next()) { 
			User data = new User();
			data.setUID(rs.getString(1));
			data.setUPwd(rs.getString(2));
			data.setUName(rs.getString(3));
			data.setUPriority(rs.getInt(4));
			data.setUSex(rs.getInt(5));
			data.setUIDcard(rs.getString(6));
			data.setUPosition(rs.getString(7));
			data.setUMajor(rs.getString(8));
			arr.add(data);
		}
		db.closeRs();
		System.out.println(arr);
		return arr;
	}
	
	//�޸�����
	public boolean PwdChange(String uID, String uPwd) {
		return db.update("update user set UPwd='" + uPwd+ "'where uid="+ uID +"")>0;
	}


}
