package cn.com.Entity;

public class Type {
	private static final long serialVersionUID = -6250448301858087391L;
	private Integer id;
	private String typename;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public Type(Integer id, String typename) {
		super();
		this.id = id;
		this.typename = typename;
	}
	public Type() {
		super();
	}
	@Override
	public String toString() {
		return "Type [id=" + id + ", typename=" + typename + "]";
	}
	
}
