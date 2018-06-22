package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import bean.Equipment;


/**
 * 专门用来处理EquipmentDao这个表的增删改查等
 *
 */

public interface EquipmentDao {

	public boolean insert(Equipment data) ;// 新增

	public boolean update(Equipment data) ;// 修改
	public boolean updateTClass(String TID,String TClass) ;// 修改归属教室
	public boolean updateTStatus(String TID);// 修改物品状态
	
	public boolean delete(String TID) ;// 删除

	public ArrayList<Equipment> queryAll() throws SQLException, SQLException ;// 查询获取
	public ArrayList<Equipment> queryClass(String TClass) throws SQLException ;// 查询教室配置
	public ArrayList<Equipment> queryTStatus(int TStatus) throws SQLException ;//状态查询
	public ArrayList<Equipment> queryTClass() throws SQLException ;//库房设备查询
	public ArrayList<Equipment> querySection(String Search) throws SQLException ;//模糊查询
	public ArrayList<Equipment> queryChange(String Search) throws SQLException ;
	
	
	
}
