package cn.com.noomn.dao.mapper;

import cn.com.noomn.dao.StepDetaile;
import cn.com.noomn.dao.StepDetaileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StepDetaileMapper {
    int countByExample(StepDetaileExample example);

    int deleteByExample(StepDetaileExample example);

    int deleteByPrimaryKey(String stepDetaileId);

    int insert(StepDetaile record);

    int insertSelective(StepDetaile record);

    List<StepDetaile> selectByExample(StepDetaileExample example);

    StepDetaile selectByPrimaryKey(String stepDetaileId);

    int updateByExampleSelective(@Param("record") StepDetaile record, @Param("example") StepDetaileExample example);

    int updateByExample(@Param("record") StepDetaile record, @Param("example") StepDetaileExample example);

    int updateByPrimaryKeySelective(StepDetaile record);

    int updateByPrimaryKey(StepDetaile record);
}