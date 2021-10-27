package com.lding.jk.mapper;

import com.lding.jk.pojo.po.PlateRegion;
import java.util.List;

public interface PlateRegionMapper {
    int deleteByPrimaryKey(Short id);

    int insert(PlateRegion record);

    PlateRegion selectByPrimaryKey(Short id);

    List<PlateRegion> selectAll();

    int updateByPrimaryKey(PlateRegion record);
}