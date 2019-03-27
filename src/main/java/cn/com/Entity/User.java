package cn.com.Entity;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class User  {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6250448301858087391L;
	private Integer Id;
	private Integer sex; 
	private String name;
	private String username;
	private Integer birthday;
	private  Integer birthyear;
	private  Integer birthmonth;
	private String password;
	private String address;
	private String idcard;
	private String education;
	private  Integer joinyear;
	private  Integer joinmonth;
	private  Integer joinday;
	private  Integer partyear;
	private  Integer partmonth;
	private  Integer partday;
	private String selprofessional;
	private String seljob;
	private String idnum;
	private String selbattalion;
	private String selcommander;
	private String selplatoon;
	private String selstate;
	private String seltype;
	private String studybackground;
	private String rewardpunishment;
	private String office;
	private Integer sort;
	private String image;
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public String getRewardpunishment() {
		return rewardpunishment;
	}
	public void setRewardpunishment(String rewardpunishment) {
		this.rewardpunishment = rewardpunishment;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getStudybackground() {
		return studybackground;
	}
	public void setStudybackground(String studybackground) {
		this.studybackground = studybackground;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	
	public String getSeltype() {
		return seltype;
	}
	public void setSeltype(String seltype) {
		this.seltype = seltype;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getBirthday() {
		return birthday;
	}
	public void setBirthday(Integer birthday) {
		this.birthday = birthday;
	}
	public Integer getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(Integer birthyear) {
		this.birthyear = birthyear;
	}
	public Integer getBirthmonth() {
		return birthmonth;
	}
	public void setBirthmonth(Integer birthmonth) {
		this.birthmonth = birthmonth;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public Integer getJoinyear() {
		return joinyear;
	}
	public void setJoinyear(Integer joinyear) {
		this.joinyear = joinyear;
	}
	public Integer getJoinmonth() {
		return joinmonth;
	}
	public void setJoinmonth(Integer joinmonth) {
		this.joinmonth = joinmonth;
	}
	public Integer getJoinday() {
		return joinday;
	}
	public void setJoinday(Integer joinday) {
		this.joinday = joinday;
	}
	public Integer getPartyear() {
		return partyear;
	}
	public void setPartyear(Integer partyear) {
		this.partyear = partyear;
	}
	public Integer getPartmonth() {
		return partmonth;
	}
	public void setPartmonth(Integer partmonth) {
		this.partmonth = partmonth;
	}
	public Integer getPartday() {
		return partday;
	}
	public void setPartday(Integer partday) {
		this.partday = partday;
	}
	public String getSelprofessional() {
		return selprofessional;
	}
	public void setSelprofessional(String selprofessional) {
		this.selprofessional = selprofessional;
	}
	public String getSeljob() {
		return seljob;
	}
	public void setSeljob(String seljob) {
		this.seljob = seljob;
	}
	public String getIdnum() {
		return idnum;
	}
	public void setIdnum(String idnum) {
		this.idnum = idnum;
	}
	public String getSelbattalion() {
		return selbattalion;
	}
	public void setSelbattalion(String selbattalion) {
		this.selbattalion = selbattalion;
	}
	public String getSelcommander() {
		return selcommander;
	}
	public void setSelcommander(String selcommander) {
		this.selcommander = selcommander;
	}
	public String getSelplatoon() {
		return selplatoon;
	}
	public void setSelplatoon(String selplatoon) {
		this.selplatoon = selplatoon;
	}

	public String getSelstate() {
		return selstate;
	}
	public void setSelstate(String selstate) {
		this.selstate = selstate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public User(Integer sex, String name, String username, Integer birthday, Integer birthyear, Integer birthmonth,
			String password, String address, String idcard, String education, Integer joinyear, Integer joinmonth,
			Integer joinday, Integer partyear, Integer partmonth, Integer partday, String selprofessional, String seljob,
			String idnum, String selbattalion, String selcommander, String selplatoon, 
			String selstate,String seltype,String studybackground,String rewardpunishment ,
			String office,Integer sort,String image) {
		super();
		this.sex = sex;
		this.name = name;
		this.username = username;
		this.birthday = birthday;
		this.birthyear = birthyear;
		this.birthmonth = birthmonth;
		this.password = password;
		this.address = address;
		this.idcard = idcard;
		this.education = education;
		this.joinyear = joinyear;
		this.joinmonth = joinmonth;
		this.joinday = joinday;
		this.partyear = partyear;
		this.partmonth = partmonth;
		this.partday = partday;
		this.selprofessional = selprofessional;
		this.seljob = seljob;
		this.idnum = idnum;
		this.selbattalion = selbattalion;
		this.selcommander = selcommander;
		this.selplatoon = selplatoon;
		this.seltype=seltype;
		this.studybackground=studybackground;
		this.rewardpunishment=rewardpunishment;
		this.office=office;
		this.sort=sort;
		this.image=image;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", sex=" + sex + ", name=" + name + ", username=" + username + ", birthday="
				+ birthday + ", birthyear=" + birthyear + ", birthmonth=" + birthmonth + ", password=" + password
				+ ", address=" + address + ", idcard=" + idcard + ", education=" + education + ", joinyear=" + joinyear
				+ ", joinmonth=" + joinmonth + ", joinday=" + joinday + ", partyear=" + partyear + ", partmonth="
				+ partmonth + ", partday=" + partday + ", selprofessional=" + selprofessional + ", seljob=" + seljob
				+ ", idnum=" + idnum + ", selbattalion=" + selbattalion + ", selcommander=" + selcommander
				+ ", selplatoon=" + selplatoon + ", selstate=" + selstate + ", seltype=" + seltype
				+ ", studybackground=" + studybackground + ", rewardpunishment=" + rewardpunishment + ", office="
				+ office + ", sort=" + sort + ", image=" + image + "]";
	}

}
