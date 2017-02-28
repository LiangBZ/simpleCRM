package cn.com.noomn.dao.mapper;

import cn.com.noomn.dao.Process;
import cn.com.noomn.dao.ProcessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcessMapper {
    int countByExample(ProcessExample example);

    int deleteByExample(ProcessExample example);

    int deleteByPrimaryKey(String processId);

    int insert(Process record);

    int insertSelective(Process record);

    List<Process> selectByExample(ProcessExample example);

    Process selectByPrimaryKey(String processId);

    int updateByExampleSelective(@Param("record") Process record, @Param("example") ProcessExample example);

    int updateByExample(@Param("record") Process record, @Param("example") ProcessExample example);

    int updateByPrimaryKeySelective(Process record);

    int updateByPrimaryKey(Process record);
}