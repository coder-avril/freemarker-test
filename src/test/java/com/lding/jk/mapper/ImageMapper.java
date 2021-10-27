package com.lding.jk.mapper;

import com.lding.jk.pojo.po.Image;
import java.util.List;

public interface ImageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Image record);

    Image selectByPrimaryKey(Integer id);

    List<Image> selectAll();

    int updateByPrimaryKey(Image record);
}