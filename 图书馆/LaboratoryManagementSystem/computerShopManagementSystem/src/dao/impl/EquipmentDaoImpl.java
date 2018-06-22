package dao.impl;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import bean.Equipment;
import bean.User;
import dao.EquipmentDao;

public class EquipmentDaoImpl implements EquipmentDao{

	private DBUtil db = new DBUtil();

	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
	String str = sdf.format(date);
	
	//����
	public boolean insert(Equipment data) {
		String a="insert into Equipment values('" 
				+ data.getTID()+ "','" 
				+ data.getTName() + "','" 
				+ data.getTType() + "','" 
				+ data.getTCount() + "','"
				+ data.getTClass() + "','"
				+ data.getTStatus() + "','"
				+ data.getTSpec() + "','"
				+ data.getTUnit() + "','"
				+ data.getTUse() + "','"
				+ data.getTConfiguration() + "','"
				+ str + "')";
		System.out.println(a);
		return db.update(a) > 0;		
	}

	//�޸�
	public boolean update(Equipment data) {
		String update="update Equipment set TName='" + data.getTName()
		+"',TType='" + data.getTType()
		+"',TCount='" + data.getTCount()
		+"',TClass='" + data.getTClass()
		+"',TStatus='" + data.getTStatus()
		+"',TSpec='" + data.getTSpec() 
		+"',TUnit='" + data.getTUnit() 
		+"',TConfiguration='" + data.getTConfiguration() 
		+"',TUse='" + data.getTUse() 
		+"'where TID = '"+data.getTID()+"'";
		System.out.println(update);
		return db.update(update)>0;
	}
	
	//�޸Ľ��ҹ���
	public boolean updateTClass(String TID,String TClass) {
		String update="update Equipment set TClass='" + TClass	
		+"'where TID = '"+TID+"'";
		System.out.println(update);
		return db.update(update)>0;
	}
	
	//�޸���Ʒ״̬RepairTStatus
		public boolean updateTStatus(String TID) {
			String update="update Equipment set TStatus= 2 where TID = "+TID+"";
			System.out.println(update);
			return db.update(update)>0;
		}

	//ɾ��
	public boolean delete(String TID) {
		return db.update("delete from Equipment where TID=" + TID) > 0;
	}

	//�鿴
	public ArrayList<Equipment> queryAll() throws SQLException {
		ArrayList<Equipment> arre = new ArrayList<>();
		ResultSet rs = db.query("select * from Equipment");
		while (rs.next()) { // �õ�ʱ��rs���ܹر� Ӱ�����ݿ��Ч��		
			Equipment data = new Equipment();// ÿһ�����ݷŵ�һ��ʵ�����д���
			data.setTID(rs.getString(1));
			data.setTName(rs.getString(2));
			data.setTType(rs.getInt(3));
			data.setTCount(rs.getInt(4));
			data.setTClass(rs.getString(5));
			data.setTStatus(rs.getInt(6));
			data.setTSpec(rs.getString(7));
			data.setTUnit(rs.getString(8));
			data.setTUse(rs.getString(9));
			data.setTConfiguration(rs.getString(10));
			data.setTCreatData(rs.getTimestamp(11));
			arre.add(data);
		}
		db.closeRs();// �ǵùر�
		return arre;
	}
	
	//��ѯ���
	public ArrayList<Equipment> queryChange(String Search) throws SQLException {
		ArrayList<Equipment> arre = new ArrayList<>();
		String a="select * from Equipment where TClass='0' and CONCAT"
				+ "(TID,TName,TType,TCount,TStatus,TSpec,TUnit,TUse,TConfiguration,TCreatData) "
				+ " like '%"+ Search+"%'";
		System.out.println(a);
		ResultSet rs = db.query(a);
		while (rs.next()) { // �õ�ʱ��rs���ܹر� Ӱ�����ݿ��Ч��		
			Equipment data = new Equipment();// ÿһ�����ݷŵ�һ��ʵ�����д���
			data.setTID(rs.getString(1));
			data.setTName(rs.getString(2));
			data.setTType(rs.getInt(3));
			data.setTCount(rs.getInt(4));
			data.setTClass(rs.getString(5));
			data.setTStatus(rs.getInt(6));
			data.setTSpec(rs.getString(7));
			data.setTUnit(rs.getString(8));
			data.setTUse(rs.getString(9));
			data.setTConfiguration(rs.getString(10));
			data.setTCreatData(rs.getTimestamp(11));
			arre.add(data);
		}
		db.closeRs();// �ǵùر�
		return arre;
	}
	
	//�鿴��������
	public ArrayList<Equipment> queryClass(String TClass) throws SQLException {
		ArrayList<Equipment> arre = new ArrayList<>();
		String a="select * from Equipment where TClass="+ "'"+TClass+ "'";
		System.out.println(a);
		ResultSet rs = db.query(a);
		while (rs.next()) { // �õ�ʱ��rs���ܹر� Ӱ�����ݿ��Ч��		
			Equipment data = new Equipment();// ÿһ�����ݷŵ�һ��ʵ�����д���
			data.setTID(rs.getString(1));
			data.setTName(rs.getString(2));
			data.setTType(rs.getInt(3));
			data.setTCount(rs.getInt(4));
			data.setTClass(rs.getString(5));
			data.setTStatus(rs.getInt(6));
			data.setTSpec(rs.getString(7));
			data.setTUnit(rs.getString(8));
			data.setTUse(rs.getString(9));
			data.setTConfiguration(rs.getString(10));
			data.setTCreatData(rs.getTimestamp(11));
			arre.add(data);
		}
		db.closeRs();// �ǵùر�
		return arre;
	}
	
	//״̬��ѯ
	public ArrayList<Equipment> queryTStatus(int TStatus) throws SQLException {
		ArrayList<Equipment> arre = new ArrayList<>();
		String a="select * from Equipment where TStatus="+ TStatus;
		System.out.println(a);
		ResultSet rs = db.query(a);
		while (rs.next()) { // �õ�ʱ��rs���ܹر� Ӱ�����ݿ��Ч��		
			Equipment data = new Equipment();// ÿһ�����ݷŵ�һ��ʵ�����д���
			data.setTID(rs.getString(1));
			data.setTName(rs.getString(2));
			data.setTType(rs.getInt(3));
			data.setTCount(rs.getInt(4));
			data.setTClass(rs.getString(5));
			data.setTStatus(rs.getInt(6));
			data.setTSpec(rs.getString(7));
			data.setTUnit(rs.getString(8));
			data.setTUse(rs.getString(9));
			data.setTConfiguration(rs.getString(10));
			data.setTCreatData(rs.getTimestamp(11));
			arre.add(data);
		}
		db.closeRs();// �ǵùر�
		return arre;
	}	
	
	//���ҹ�����ѯ
	public ArrayList<Equipment> queryTClass() throws SQLException{//���ҹ�����ѯ
		ArrayList<Equipment> arre = new ArrayList<>();
		String a="select * from Equipment where TClass= '0'";
		ResultSet rs = db.query(a);
		System.out.println(a);
		while (rs.next()) { 
			Equipment data = new Equipment();// ÿһ�����ݷŵ�һ��ʵ�����д���
			data.setTID(rs.getString(1));
			data.setTName(rs.getString(2));
			data.setTType(rs.getInt(3));
			data.setTCount(rs.getInt(4));
			data.setTClass(rs.getString(5));
			data.setTStatus(rs.getInt(6));
			data.setTSpec(rs.getString(7));
			data.setTUnit(rs.getString(8));
			data.setTUse(rs.getString(9));
			data.setTConfiguration(rs.getString(10));
			data.setTCreatData(rs.getTimestamp(11));
			arre.add(data);
		}
		db.closeRs();
		return arre;
	}
	
	//ģ����ѯ
	public ArrayList<Equipment> querySection(String Search) throws SQLException {
		ArrayList<Equipment> arre = new ArrayList<>();
		String a="select * from Equipment where CONCAT"
				+ "(TID,TName,TType,TCount,TClass,TStatus,TSpec,TUnit,TUse,TConfiguration,TCreatData) "
				+ " like '%"+ Search+"%'";
		ResultSet rs = db.query(a);
		System.out.println(a);
		while (rs.next()) { 
			Equipment data = new Equipment();// ÿһ�����ݷŵ�һ��ʵ�����д���
			data.setTID(rs.getString(1));
			data.setTName(rs.getString(2));
			data.setTType(rs.getInt(3));
			data.setTCount(rs.getInt(4));
			data.setTClass(rs.getString(5));
			data.setTStatus(rs.getInt(6));
			data.setTSpec(rs.getString(7));
			data.setTUnit(rs.getString(8));
			data.setTUse(rs.getString(9));
			data.setTConfiguration(rs.getString(10));
			data.setTCreatData(rs.getTimestamp(11));
			arre.add(data);
		}
		db.closeRs();
		System.out.println(arre);
		return arre;
	}

}
