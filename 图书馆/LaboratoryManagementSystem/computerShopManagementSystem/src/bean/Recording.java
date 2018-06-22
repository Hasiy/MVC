package bean;

import java.sql.Timestamp;

public class Recording {
	private String Uid; //�û�id
	private String Uname; //�û�����
	private String TID; //��Ʒ���
	private String TName; //��Ʒ���ƣ��豸����Ʒ���ƣ�
	private Timestamp TUpdateData; //����ʱ��
	private String Notes; //������¼
	
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
