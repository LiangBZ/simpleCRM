package cn.com.noomn.vo.mapper;

import java.util.List;

public interface UserVoMapper {
	/**
	 * 查找所有的用户
	 * @return	用户列表
	 * @throws Exception
	 */
	public List<UserVoMapper> selectAllUserVo() throws Exception;
}
