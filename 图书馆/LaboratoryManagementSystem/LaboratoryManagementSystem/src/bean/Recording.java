package bean;

import java.sql.Timestamp;

public class Recording {
	private String Uid; //用户id
	private String Uname; //用户姓名
	private String TID; //物品编号
	private String TName; //物品名称（设备、物品名称）
	private Timestamp TUpdateData; //操作时间
	private String Notes; //操作记录
	
	public Recording() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Recording(String uid, String uname, String tID, String tName, Timestamp tUpdateData, String notes) {
		super();
		Uid = uid;
		Uname = uname;
		TID = tID;
		TName = tName;
		TUpdateData = tUpdateData;
		Notes = notes;
	}

	public String getUid() {
		return Uid;
	}

	public void setUid(String uid) {
		Uid = uid;
	}

	public String getUname() {
		return Uname;
	}

	public void setUname(String uname) {
		Uname = uname;
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

	public Timestamp getTUpdateData() {
		return TUpdateData;
	}

	public void setTUpdateData(Timestamp tUpdateData) {
		TUpdateData = tUpdateData;
	}

	public String getNotes() {
		return Notes;
	}

	public void setNotes(String notes) {
		Notes = notes;
	}

	@Override
	public String toString() {
		return "Recording [Uid=" + Uid + ", Uname=" + Uname + ", TID=" + TID + ", TName=" + TName + ", TUpdateData="
				+ TUpdateData + ", Notes=" + Notes + "]";
	}


} 
