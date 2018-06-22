package bean;

import java.sql.Date;

public class User {
	
	private String UID;//�û�id
	private String UPwd;//����
	private String UName;//�û�����
	private int UPriority;//Ȩ��(����Ա1����ͨ�û�2)
	private int USex;//�Ա���Ϊ1��ŮΪ2��
	private String UIDcard;//���֤��
	private String UPosition;//ְλ
	private String UMajor;//רҵϵ��
	
	
	public User() {
		super();
	}

	public User(String uID, String uPwd, String uName, int uPriority, int uSex, String uIDcard, String uPosition,
			String uMajor) {
		super();
		UID = uID;
		UPwd = uPwd;
		UName = uName;
		UPriority = uPriority;
		USex = uSex;
		UIDcard = uIDcard;
		UPosition = uPosition;
		UMajor = uMajor;
	}

	public String getUID() {
		return UID;
	}

	public void setUID(String uID) {
		UID = uID;
	}

	public String getUPwd() {
		return UPwd;
	}

	public void setUPwd(String uPwd) {
		UPwd = uPwd;
	}

	public String getUName() {
		return UName;
	}

	public void setUName(String uName) {
		UName = uName;
	}

	public int getUPriority() {
		return UPriority;
	}

	public void setUPriority(int uPriority) {
		UPriority = uPriority;
	}

	public int getUSex() {
		return USex;
	}

	public void setUSex(int uSex) {
		USex = uSex;
	}

	public String getUIDcard() {
		return UIDcard;
	}

	public void setUIDcard(String uIDcard) {
		UIDcard = uIDcard;
	}

	public String getUPosition() {
		return UPosition;
	}

	public void setUPosition(String uPosition) {
		UPosition = uPosition;
	}

	public String getUMajor() {
		return UMajor;
	}

	public void setUMajor(String uMajor) {
		UMajor = uMajor;
	}

	@Override
	public String toString() {
		return "User [�û�id=" + UID + ", ����=" + UPwd + ", �û�����=" + UName + ", Ȩ��(����Ա1����ͨ�û�2) =" + UPriority + ", �Ա���Ϊ1��ŮΪ2��="
				+ USex + ", ���֤��=" + UIDcard + ", ְλ=" + UPosition + ", רҵϵ��=" + UMajor + "]";
	}
	
}
