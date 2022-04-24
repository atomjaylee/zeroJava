package com.kuang.dao;

import com.kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> getTeachers();

    // 获取指定老师下的所有学生信息和教师信息
    Teacher getTeacher(@Param("tid") int id);
}
