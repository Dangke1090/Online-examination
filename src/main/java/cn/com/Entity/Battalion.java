package cn.com.Entity;

public class Battalion {
	private Integer battalionid;
	private String battalionname;

	public Integer getBattalionid() {
		return battalionid;
	}
	public void setBattalionid(Integer battalionid) {
		this.battalionid = battalionid;
	}
	public String getBattalionname() {
		return battalionname;
	}
	public void setBattalionname(String battalionname) {
		this.battalionname = battalionname;
	}

	public Battalion() {
		super();
	}

	public Battalion( String battalionname) {
		super();
		this.battalionname = battalionname;
	}
	public String toString() {
		return "Battalion [battalionid=" + battalionid + ", battalionname=" + battalionname + "]";
	}
	
	
}
