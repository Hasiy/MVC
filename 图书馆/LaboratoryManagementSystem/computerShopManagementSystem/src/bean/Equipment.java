package bean;

import java.sql.Date;
import java.sql.Timestamp;

public class Equipment {
	
	private String TID; //物品编号（物品专有编号，参照实验室物品编号规则）
	private String TName; //物品名称（设备、物品名称）
	private int TType; //物品类型（设备为1、消耗品为2）
	private int TCount; //物品数量
	private String TClass; //物品归属教室（没有归属为0，表示在库房）
	private int TStatus; //物品状态（可使用为1、损坏为2）
	private String TSpec; //物品规格（毫升等等）
	private String TUnit; //单位（台、件等等）
	private String TUse; //用途说明（设备或物品使用说明）
	private String TConfiguration;//器材配置
	private Timestamp TCreatData; //创建时间
	
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
