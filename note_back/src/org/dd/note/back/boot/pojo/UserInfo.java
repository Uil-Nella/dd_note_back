package org.dd.note.back.boot.pojo;
/**
 * note用户实体类
 * @author liuxy
 * @v2014年10月14日下午2:08:43
 * @version 1.0
 */
public class UserInfo {
	private Integer id;
	/**
	 * 用户主键
	 */
	private String pk_userinfo;
	/**
	 * 用户编码
	 */
	private String code;
	/**
	 * 用户名称
	 */
	private String name;
	/**
	 * 用户密码
	 */
	private String password;
	/**
	 * 用户邮箱
	 */
	private String email;
	/**
	 * 用户等级
	 */
	private String level;
	/**
	 * 用户笔记容量
	 */
	private String voluname;
	/**
	 * 删除标志位i
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
