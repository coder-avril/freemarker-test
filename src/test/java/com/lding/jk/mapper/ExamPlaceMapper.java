package com.lding.jk.mapper;

import com.lding.jk.pojo.po.ExamPlace;
import java.util.List;

public interface ExamPlaceMapper {
    int deleteByPrimaryKey(Short id);

    int insert(ExamPlace record);

    ExamPlace selectByPrimaryKey(Short id);

    List<ExamPlace> selectAll();

    int updateByPrimaryKey(ExamPlace record);
}