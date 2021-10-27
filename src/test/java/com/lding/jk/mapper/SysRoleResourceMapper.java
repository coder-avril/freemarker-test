package com.lding.jk.mapper;

import com.lding.jk.pojo.po.SysRoleResource;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleResourceMapper {
    int deleteByPrimaryKey(@Param("resourceId") Byte resourceId, @Param("roleId") Byte roleId);

    int insert(SysRoleResource record);

    List<SysRoleResource> selectAll();
}