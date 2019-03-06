package com.example.mapper;

import com.example.entity.FlDefine;
import com.example.entity.FlDefineExample;
import com.example.entity.FlDefineWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlDefineMapper {
    long countByExample(FlDefineExample example);

    int deleteByExample(FlDefineExample example);

    int deleteByPrimaryKey(Long rId);

    int insert(FlDefineWithBLOBs record);

    int insertSelective(FlDefineWithBLOBs record);

    List<FlDefineWithBLOBs> selectByExampleWithBLOBs(FlDefineExample example);

    List<FlDefine> selectByExample(FlDefineExample example);

    FlDefineWithBLOBs selectByPrimaryKey(Long rId);

    int updateByExampleSelective(@Param("record") FlDefineWithBLOBs record, @Param("example") FlDefineExample example);

    int updateByExampleWithBLOBs(@Param("record") FlDefineWithBLOBs record, @Param("example") FlDefineExample example);

    int updateByExample(@Param("record") FlDefine record, @Param("example") FlDefineExample example);

    int updateByPrimaryKeySelective(FlDefineWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FlDefineWithBLOBs record);

    int updateByPrimaryKey(FlDefine record);
}