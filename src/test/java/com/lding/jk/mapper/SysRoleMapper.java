package com.lding.jk.mapper;

import com.lding.jk.pojo.po.SysRole;
import java.util.List;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(SysRole record);

    SysRole selectByPrimaryKey(Byte id);

    List<SysRole> selectAll();

    int updateByPrimaryKey(SysRole record);
}