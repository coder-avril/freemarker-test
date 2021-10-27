package com.lding.jk.mapper;

import com.lding.jk.pojo.po.SysResource;
import java.util.List;

public interface SysResourceMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(SysResource record);

    SysResource selectByPrimaryKey(Byte id);

    List<SysResource> selectAll();

    int updateByPrimaryKey(SysResource record);
}