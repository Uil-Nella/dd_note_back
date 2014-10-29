package org.dd.note.back.boot.mapper;

import java.util.List;

import org.dd.note.back.boot.pojo.UserInfo;
/**
 * �û������mapper��
 * @author liuxy
 * @v2014��10��14������2:37:06
 * @version 1.0
 */
public interface UserInfoMapper {
	/**
	 * �����û�
	 * @param user
	 */
	public void addUser(UserInfo user);
	/**
	 * ��ѯ�����û�
	 * @return
	 */
	public List<UserInfo> getAllUser();
	/**
	 * ����code��ѯ�û�
	 * @param id
	 * @return
	 */
	public UserInfo getUserByCode(String code);
	/**
	 * ɾ���û�
	 * @param id
	 */
	public void deleteByCode(String code);

	public void update(UserInfo user);

}
