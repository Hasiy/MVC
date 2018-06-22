package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.User;
import dao.UserDao;

public class UserDaoImpl implements UserDao {

	private DBUtil db = new DBUtil();

	//增加
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

	//修改
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

	//删除
	public boolean delete(int uid) {
		return db.update("delete from User where Uid=" + uid) > 0;
	}

	//查看
	public ArrayList<User> queryAll() throws SQLException {
		ArrayList<User> arr = new ArrayList<>();
		ResultSet rs = db.query("select * from user");
		while (rs.next()) { // 用的时候rs不能关闭 影响数据库的效率
			User data = new User();// 每一行数据放到一个实体类中带出
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
		db.closeRs();// 记得关闭
		return arr;
	}
	
	//查询性别
	public ArrayList<User> querySex(int sex) throws SQLException{
		ArrayList<User> arr = new ArrayList<>();
		ResultSet rs = db.query("select * from user where USex="+sex );
		while (rs.next()) { // 用的时候rs不能关闭 影响数据库的效率
			User data = new User();// 每一行数据放到一个实体类中带出
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
		db.closeRs();// 记得关闭
		return arr;
	}
	
	
	//权限查询
	public ArrayList<User> queryUPriority(int upriority) throws SQLException {
		ArrayList<User> arr = new ArrayList<>();
		ResultSet rs = db.query("select * from user where UPriority="+upriority );
		while (rs.next()) { // 用的时候rs不能关闭 影响数据库的效率
			User data = new User();// 每一行数据放到一个实体类中带出
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
		db.closeRs();// 记得关闭
		return arr;
	}
	
	//登录查询
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
	
	//模糊查询
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
	
	//修改密码
	public boolean PwdChange(String uID, String uPwd) {
		return db.update("update user set UPwd='" + uPwd+ "'where uid="+ uID +"")>0;
	}


}
