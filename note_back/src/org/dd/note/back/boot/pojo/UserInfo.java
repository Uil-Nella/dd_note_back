package org.dd.note.back.boot.pojo;
/**
 * note�û�ʵ����
 * @author liuxy
 * @v2014��10��14������2:08:43
 * @version 1.0
 */
public class UserInfo {
	private Integer id;
	/**
	 * �û�����
	 */
	private String pk_userinfo;
	/**
	 * �û�����
	 */
	private String code;
	/**
	 * �û�����
	 */
	private String name;
	/**
	 * �û�����
	 */
	private String password;
	/**
	 * �û�����
	 */
	private String email;
	/**
	 * �û��ȼ�
	 */
	private String level;
	/**
	 * �û��ʼ�����
	 */
	private String voluname;
	/**
	 * ɾ����־λi
	 */
	private String dr;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getVoluname() {
		return voluname;
	}
	public void setVoluname(String voluname) {
		this.voluname = voluname;
	}
	public String getDr() {
		return dr;
	}
	public void setDr(String dr) {
		this.dr = dr;
	}
	public String getPk_userinfo() {
		return pk_userinfo;
	}
	public void setPk_userinfo(String pk_userinfo) {
		this.pk_userinfo = pk_userinfo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
