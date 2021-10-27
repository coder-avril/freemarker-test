package com.lding.jk.mapper;

import com.lding.jk.pojo.po.ExamPlaceCourse;
import java.util.List;

public interface ExamPlaceCourseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamPlaceCourse record);

    ExamPlaceCourse selectByPrimaryKey(Integer id);

    List<ExamPlaceCourse> selectAll();

    int updateByPrimaryKey(ExamPlaceCourse record);
}