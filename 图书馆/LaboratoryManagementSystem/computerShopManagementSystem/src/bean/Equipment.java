package bean;

import java.sql.Date;
import java.sql.Timestamp;

public class Equipment {
	
	private String TID; //��Ʒ��ţ���Ʒר�б�ţ�����ʵ������Ʒ��Ź���
	private String TName; //��Ʒ���ƣ��豸����Ʒ���ƣ�
	private int TType; //��Ʒ���ͣ��豸Ϊ1������ƷΪ2��
	private int TCount; //��Ʒ����
	private String TClass; //��Ʒ�������ң�û�й���Ϊ0����ʾ�ڿⷿ��
	private int TStatus; //��Ʒ״̬����ʹ��Ϊ1����Ϊ2��
	private String TSpec; //��Ʒ��񣨺����ȵȣ�
	private String TUnit; //��λ��̨�����ȵȣ�
	private String TUse; //��;˵�����豸����Ʒʹ��˵����
	private String TConfiguration;//��������
	private Timestamp TCreatData; //����ʱ��
	
	public Equipment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Equipment(String tID, String tName, int tType, int tCount, String tClass, int tStatus, String tSpec,
			String tUnit, String tUse, String tConfiguration, Timestamp tCreatData) {
		super();
		TID = tID;
		TName = tName;
		TType = tType;
		TCount = tCount;
		TClass = tClass;
		TStatus = tStatus;
		TSpec = tSpec;
		TUnit = tUnit;
		TUse = tUse;
		TConfiguration = tConfiguration;
		TCreatData = tCreatData;
	}

	public String getTID() {
		return TID;
	}

	public void setTID(String tID) {
		TID = tID;
	}

	public String getTName() {
		return TName;
	}

	public void setTName(String tName) {
		TName = tName;
	}

	public int getTType() {
		return TType;
	}

	public void setTType(int tType) {
		TType = tType;
	}

	public int getTCount() {
		return TCount;
	}

	public void setTCount(int tCount) {
		TCount = tCount;
	}

	public String getTClass() {
		return TClass;
	}

	public void setTClass(String tClass) {
		TClass = tClass;
	}

	public int getTStatus() {
		return TStatus;
	}

	public void setTStatus(int tStatus) {
		TStatus = tStatus;
	}

	public String getTSpec() {
		return TSpec;
	}

	public void setTSpec(String tSpec) {
		TSpec = tSpec;
	}

	public String getTUnit() {
		return TUnit;
	}

	public void setTUnit(String tUnit) {
		TUnit = tUnit;
	}

	public String getTUse() {
		return TUse;
	}

	public void setTUse(String tUse) {
		TUse = tUse;
	}

	public String getTConfiguration() {
		return TConfiguration;
	}

	public void setTConfiguration(String tConfiguration) {
		TConfiguration = tConfiguration;
	}

	public Timestamp getTCreatData() {
		return TCreatData;
	}

	public void setTCreatData(Timestamp tCreatData) {
		TCreatData = tCreatData;
	}

	@Override
	public String toString() {
		return "Equipment [TID=" + TID + ", TName=" + TName + ", TType=" + TType + ", TCount=" + TCount + ", TClass="
				+ TClass + ", TStatus=" + TStatus + ", TSpec=" + TSpec + ", TUnit=" + TUnit + ", TUse=" + TUse
				+ ", TConfiguration=" + TConfiguration + ", TCreatData=" + TCreatData + "]";
	}
	

	
}
