package cn.com.Entity;



public class Job  {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6250448301858087391L;
	private Integer id;
	private String jobname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	public Job() {
		super();
	}
	public Job(Integer id, String jobname) {
		super();
		this.id = id;
		this.jobname = jobname;
	}
	@Override
	public String toString() {
		return "Job [id=" + id + ", jobname=" + jobname + "]";
	}

}
