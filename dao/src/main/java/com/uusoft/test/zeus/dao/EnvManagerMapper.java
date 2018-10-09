package com.uusoft.test.zeus.dao;

import com.uusoft.test.zeus.domain.model.EnvManager;

public interface EnvManagerMapper {
    int deleteByPrimaryKey(Integer envid);

    int insert(EnvManager record);

    int insertSelective(EnvManager record);

    EnvManager selectByPrimaryKey(Integer envid);

    int updateByPrimaryKeySelective(EnvManager record);

    int updateByPrimaryKey(EnvManager record);
}