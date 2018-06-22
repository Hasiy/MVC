package service;

import java.sql.SQLException;
import java.util.ArrayList;

import bean.Equipment;

public interface EquipmentService {
	
	boolean insert(Equipment data);// ����

	boolean update(Equipment data);// �޸�
	boolean updateTClass(String TID,String TClass) ;// �޸Ĺ�������
	boolean updateTStatus(String TID);// �޸���Ʒ״̬
	
	boolean delete(String TID);// ɾ��

	ArrayList<Equipment> queryAll() throws SQLException;// ��ѯ��ȡ
	ArrayList<Equipment> queryClass(String TClass) throws SQLException ;// ��ѯ��������
	ArrayList<Equipment> queryTStatus(int TStatus) throws SQLException ;//״̬��ѯ
	ArrayList<Equipment> queryTClass() throws SQLException ;//�ⷿ�豸��ѯ
	ArrayList<Equipment> querySection(String Search) throws SQLException ;//ģ����ѯ
	ArrayList<Equipment> queryChange(String Search) throws SQLException ;
	
}
