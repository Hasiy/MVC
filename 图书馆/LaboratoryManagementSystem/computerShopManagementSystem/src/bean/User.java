package bean;

import java.sql.Date;

public class User {
	
	private String UID;//用户id
	private String UPwd;//密码
	private String UName;//用户姓名
	private int UPriority;//权限(管理员1，普通用户2)
	private int USex;//性别（男为1、女为2）
	private String UIDcard;//身份证号
	private String UPosition;//职位
	private String UMajor;//专业系别
	
	
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
		return "User [用户id=" + UID + ", 密码=" + UPwd + ", 用户姓名=" + UName + ", 权限(管理员1，普通用户2) =" + UPriority + ", 性别（男为1、女为2）="
				+ USex + ", 身份证号=" + UIDcard + ", 职位=" + UPosition + ", 专业系别=" + UMajor + "]";
	}
	
}
