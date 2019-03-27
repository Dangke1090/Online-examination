package cn.com.Entity;

public class Commander {
	private Integer commanderid;
	private Integer Battalionid;
	private String commandername;

	public Integer getCommanderid() {
		return commanderid;
	}
	public void setCommanderid(Integer commanderid) {
		this.commanderid = commanderid;
	}
	public Integer getBattalionid() {
		return Battalionid;
	}
	public void setBattalionid(Integer battalionid) {
		Battalionid = battalionid;
	}
	public String getCommandername() {
		return commandername;
	}
	public void setCommandername(String commandername) {
		this.commandername = commandername;
	}
	public Commander() {
		super();
	}
	public Commander(Integer battalionid, String commandername) {
		super();
		Battalionid = battalionid;
		this.commandername = commandername;
	}
	@Override
	public String toString() {
		return "Commander [commanderid=" + commanderid + ", Battalionid=" + Battalionid + ", commandername="
				+ commandername + "]";
	}

	
}
