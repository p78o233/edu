package com.example.eduschoolprovider.mapper;/*
 * @author p78o2
 * @date 2020/3/10
 */

import com.example.educonnamddata.eduSchool.EduSchool;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SchoolMapper {
//    获取学校总数
    public Integer getSchoolCount(@Param("name")String name);
//    获取分页数据
    public List<EduSchool> getSchoolPage(@Param("name")String name,@Param("start")int start,@Param("pageSize")int pageSize);

}
