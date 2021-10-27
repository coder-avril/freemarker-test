package com.lding.jk.mapper;

import com.lding.jk.pojo.po.SysUserRole;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserRoleMapper {
    int deleteByPrimaryKey(@Param("userId") Short userId, @Param("roleId") Byte roleId);

    int insert(SysUserRole record);

    List<SysUserRole> selectAll();
}