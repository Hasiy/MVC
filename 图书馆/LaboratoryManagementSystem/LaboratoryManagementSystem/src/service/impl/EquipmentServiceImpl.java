package service.impl;

import java.sql.SQLException;
import java.util.ArrayList;

import bean.Equipment;
import dao.EquipmentDao;
import dao.impl.EquipmentDaoImpl;
import service.EquipmentService;

public class EquipmentServiceImpl implements EquipmentService{

	private EquipmentDao dao = new EquipmentDaoImpl();

	public boolean insert(Equipment data) {
		return dao.insert(data);
	}
	public boolean update(Equipment data) {
		return dao.update(data);
	}
	public boolean updateTClass(String TID,String TClass) {
		return dao.updateTClass(TID,TClass);
	}// 修改归属教室
	
	public boolean updateTStatus(String TID){
		return dao.updateTStatus(TID);
	}// 修改物品状态
	
	public boolean delete(String TID){
		return dao.delete(TID);
	}
	public ArrayList<Equipment> queryAll() throws SQLException {
		return dao.queryAll();
	}
	
	public ArrayList<Equipment> queryClass(String TClass) throws SQLException {
		return dao.queryClass(TClass);
	}// 查询教室配置
	
	public ArrayList<Equipment> queryTStatus(int TStatus) throws SQLException{
		return dao.queryTStatus(TStatus);
	}//状态查询
	
	public ArrayList<Equipment> queryTClass() throws SQLException{
		return dao.queryTClass();
	}//库房设备查询查询
	
	public ArrayList<Equipment> querySection(String Search) throws SQLException{
		return dao.querySection(Search);
	}//模糊查询
	
	public ArrayList<Equipment> queryChange(String Search) throws SQLException{
		return dao.queryChange(Search);
	}//查询库存
}
