package com.kgc.mapper;

import com.kgc.pojo.Btype;
import com.kgc.pojo.BtypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BtypeMapper {
    int countByExample(BtypeExample example);

    int deleteByExample(BtypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Btype record);

    int insertSelective(Btype record);

    List<Btype> selectByExample(BtypeExample example);

    Btype selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Btype record, @Param("example") BtypeExample example);

    int updateByExample(@Param("record") Btype record, @Param("example") BtypeExample example);

    int updateByPrimaryKeySelective(Btype record);

    int updateByPrimaryKey(Btype record);
}