package cn.com.Entity;

public class Demo {
	private Integer pid;
	private String pimage;
	private String username;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPimage() {
		return pimage;
	}
	public void setPimage(String pimage) {
		this.pimage = pimage;
	}
	public Demo(String pimage,String username) {
		super();
		this.pimage = pimage;
		this.username=username;
	}
	public Demo() {
		super();
	}
}
