package com.lding.jk.mapper;

import com.lding.jk.pojo.po.DictType;
import java.util.List;

public interface DictTypeMapper {
    int deleteByPrimaryKey(Short id);

    int insert(DictType record);

    DictType selectByPrimaryKey(Short id);

    List<DictType> selectAll();

    int updateByPrimaryKey(DictType record);
}