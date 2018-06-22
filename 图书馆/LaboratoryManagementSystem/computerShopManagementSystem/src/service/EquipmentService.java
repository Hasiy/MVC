package service;

import java.sql.SQLException;
import java.util.ArrayList;

import bean.Equipment;

public interface EquipmentService {
	
	boolean insert(Equipment data);// 新增

	boolean update(Equipment data);// 修改
	boolean updateTClass(String TID,String TClass) ;// 修改归属教室
	boolean updateTStatus(String TID);// 修改物品状态
	
	boolean delete(String TID);// 删除

	ArrayList<Equipment> queryAll() throws SQLException;// 查询获取
	ArrayList<Equipment> queryClass(String TClass) throws SQLException ;// 查询教室配置
	ArrayList<Equipment> queryTStatus(int TStatus) throws SQLException ;//状态查询
	ArrayList<Equipment> queryTClass() throws SQLException ;//库房设备查询
	ArrayList<Equipment> querySection(String Search) throws SQLException ;//模糊查询
	ArrayList<Equipment> queryChange(String Search) throws SQLException ;
	
}
