package cn.com.Entity;

public class Situation {
	private static final long serialVersionUID = -6250448301858087391L;
	private Integer id;
	private String situationname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getSituationname() {
		return situationname;
	}
	public void setSituationname(String situationname) {
		this.situationname = situationname;
	}
	public Situation() {
		super();
	}
	public Situation(Integer id, String situationname) {
		super();
		this.id = id;
		this.situationname = situationname;
	}
	
	public String toString() {
		return "Situation [id=" + id + ", situationname=" + situationname + "]";
	}

	
	
}
