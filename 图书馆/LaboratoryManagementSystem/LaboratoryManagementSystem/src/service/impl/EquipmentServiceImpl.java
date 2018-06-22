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
	}// �޸Ĺ�������
	
	public boolean updateTStatus(String TID){
		return dao.updateTStatus(TID);
	}// �޸���Ʒ״̬
	
	public boolean delete(String TID){
		return dao.delete(TID);
	}
	public ArrayList<Equipment> queryAll() throws SQLException {
		return dao.queryAll();
	}
	
	public ArrayList<Equipment> queryClass(String TClass) throws SQLException {
		return dao.queryClass(TClass);
	}// ��ѯ��������
	
	public ArrayList<Equipment> queryTStatus(int TStatus) throws SQLException{
		return dao.queryTStatus(TStatus);
	}//״̬��ѯ
	
	public ArrayList<Equipment> queryTClass() throws SQLException{
		return dao.queryTClass();
	}//�ⷿ�豸��ѯ��ѯ
	
	public ArrayList<Equipment> querySection(String Search) throws SQLException{
		return dao.querySection(Search);
	}//ģ����ѯ
	
	public ArrayList<Equipment> queryChange(String Search) throws SQLException{
		return dao.queryChange(Search);
	}//��ѯ���
}
