package com.lding.jk.mapper;

import com.lding.jk.pojo.po.DictItem;
import java.util.List;

public interface DictItemMapper {
    int deleteByPrimaryKey(Short id);

    int insert(DictItem record);

    DictItem selectByPrimaryKey(Short id);

    List<DictItem> selectAll();

    int updateByPrimaryKey(DictItem record);
}