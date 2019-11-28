package com.yang.web.mapper;

import com.yang.web.pojo.Requirement;
import com.yang.web.pojo.RequirementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RequirementMapper {
    int countByExample(RequirementExample example);

    int deleteByExample(RequirementExample example);

    int deleteByPrimaryKey(Integer requirementId);

    int insert(Requirement record);

    int insertSelective(Requirement record);

    List<Requirement> selectByExampleWithBLOBs(RequirementExample example);

    List<Requirement> selectByExample(RequirementExample example);

    Requirement selectByPrimaryKey(Integer requirementId);

    int updateByExampleSelective(@Param("record") Requirement record, @Param("example") RequirementExample example);

    int updateByExampleWithBLOBs(@Param("record") Requirement record, @Param("example") RequirementExample example);

    int updateByExample(@Param("record") Requirement record, @Param("example") RequirementExample example);

    int updateByPrimaryKeySelective(Requirement record);

    int updateByPrimaryKeyWithBLOBs(Requirement record);

    int updateByPrimaryKey(Requirement record);
}