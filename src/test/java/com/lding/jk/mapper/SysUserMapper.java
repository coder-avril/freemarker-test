package com.lding.jk.mapper;

import com.lding.jk.pojo.po.SysUser;
import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SysUser record);

    SysUser selectByPrimaryKey(Short id);

    List<SysUser> selectAll();

    int updateByPrimaryKey(SysUser record);
}