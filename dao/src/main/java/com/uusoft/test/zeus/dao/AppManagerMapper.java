package com.uusoft.test.zeus.dao;

import com.uusoft.test.zeus.entity.model.AppManager;

public interface AppManagerMapper {
    int deleteByPrimaryKey(Integer appid);

    int insert(AppManager record);

    int insertSelective(AppManager record);

    AppManager selectByPrimaryKey(Integer appid);

    int updateByPrimaryKeySelective(AppManager record);

    int updateByPrimaryKey(AppManager record);
}