package com.uusoft.test.zeus.dao;

import com.uusoft.test.zeus.entity.model.InterfaceParams;

public interface InterfaceParamsMapper {
    int deleteByPrimaryKey(Integer paramid);

    int insert(InterfaceParams record);

    int insertSelective(InterfaceParams record);

    InterfaceParams selectByPrimaryKey(Integer paramid);

    int updateByPrimaryKeySelective(InterfaceParams record);

    int updateByPrimaryKey(InterfaceParams record);
}