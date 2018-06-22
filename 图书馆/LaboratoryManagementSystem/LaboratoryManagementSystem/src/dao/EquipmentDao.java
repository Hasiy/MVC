package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import bean.Equipment;


/**
 * ר����������EquipmentDao��������ɾ�Ĳ��
 *
 */

public interface EquipmentDao {

	public boolean insert(Equipment data) ;// ����

	public boolean update(Equipment data) ;// �޸�
	public boolean updateTClass(String TID,String TClass) ;// �޸Ĺ�������
	public boolean updateTStatus(String TID);// �޸���Ʒ״̬
	
	public boolean delete(String TID) ;// ɾ��

	public ArrayList<Equipment> queryAll() throws SQLException, SQLException ;// ��ѯ��ȡ
	public ArrayList<Equipment> queryClass(String TClass) throws SQLException ;// ��ѯ��������
	public ArrayList<Equipment> queryTStatus(int TStatus) throws SQLException ;//״̬��ѯ
	public ArrayList<Equipment> queryTClass() throws SQLException ;//�ⷿ�豸��ѯ
	public ArrayList<Equipment> querySection(String Search) throws SQLException ;//ģ����ѯ
	public ArrayList<Equipment> queryChange(String Search) throws SQLException ;
	
	
	
}
