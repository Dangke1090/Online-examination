package cn.com.Entity;

public class Professional {
	
	private String professionalname;
	private Integer id;
	public String getProfessionalname() {
		return professionalname;
	}
	public void setProfessionalname(String professionalname) {
		this.professionalname = professionalname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Professional [professionalname=" + professionalname + ", id=" + id + "]";
	}
	public Professional(String professionalname, Integer id) {
		super();
		this.professionalname = professionalname;
		this.id = id;
	}
	public Professional() {
		super();
	}
	
}
