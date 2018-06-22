package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import bean.User;

/**
 * 专门用来处理User这个表的增删改查等
 *
 */
public interface UserDao {

	public boolean insert(User data);// 新增

	public boolean update(User data);// 修改
	public boolean PwdChange(String uID, String uPwd);// 修改密码

	public boolean delete(int eid);// 删除
	
	public ArrayList<User> querySection(String Search) throws SQLException;

	public ArrayList<User> querySex(int sex) throws SQLException;// 权限查询
	public ArrayList<User> queryUPriority(int upriority) throws SQLException;// 权限查询
	public ArrayList<User> queryAll() throws SQLException, SQLException;// 查询获取
	public ArrayList<User> queryLogin(String uID, String uPwd) throws SQLException, SQLException;// 查询用户名

	
	
}
