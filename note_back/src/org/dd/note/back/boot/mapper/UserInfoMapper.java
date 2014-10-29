package org.dd.note.back.boot.mapper;

import java.util.List;

import org.dd.note.back.boot.pojo.UserInfo;
/**
 * 用户表操作mapper类
 * @author liuxy
 * @v2014年10月14日下午2:37:06
 * @version 1.0
 */
public interface UserInfoMapper {
	/**
	 * 增加用户
	 * @param user
	 */
	public void addUser(UserInfo user);
	/**
	 * 查询所有用户
	 * @return
	 */
	public List<UserInfo> getAllUser();
	/**
	 * 根据code查询用户
	 * @param id
	 * @return
	 */
	public UserInfo getUserByCode(String code);
	/**
	 * 删除用户
	 * @param id
	 */
	public void deleteByCode(String code);

	public void update(UserInfo user);

}
