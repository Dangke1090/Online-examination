package cn.com.Entity;

public class Platoon {
	private Integer platoonid;
	private String Platoonname;
	private Integer commanderid;
	public Integer getPlatoonid() {
		return platoonid;
	}
	public void setPlatoonid(Integer platoonid) {
		this.platoonid = platoonid;
	}
	public String getPlatoonname() {
		return Platoonname;
	}
	public void setPlatoonname(String platoonname) {
		Platoonname = platoonname;
	}
	public Integer getCommanderid() {
		return commanderid;
	}
	public void setCommanderid(Integer commanderid) {
		this.commanderid = commanderid;
	}
	public Platoon() {
		super();
	}
	public Platoon(String platoonname, Integer commanderid) {
		super();
		Platoonname = platoonname;
		this.commanderid = commanderid;
	}
	@Override
	public String toString() {
		return "Platoon [platoonid=" + platoonid + ", Platoonname=" + Platoonname + ", commanderid=" + commanderid
				+ "]";
	}
	
}
