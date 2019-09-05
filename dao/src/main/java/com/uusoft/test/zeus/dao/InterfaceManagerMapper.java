package com.uusoft.test.zeus.dao;

import com.uusoft.test.zeus.entity.model.InterfaceManager;

public interface InterfaceManagerMapper {
    int deleteByPrimaryKey(Integer interfaceid);

    int insert(InterfaceManager record);

    int insertSelective(InterfaceManager record);

    InterfaceManager selectByPrimaryKey(Integer interfaceid);

    int updateByPrimaryKeySelective(InterfaceManager record);

    int updateByPrimaryKey(InterfaceManager record);
}