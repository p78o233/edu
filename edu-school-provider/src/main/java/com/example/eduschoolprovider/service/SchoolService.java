package com.example.eduschoolprovider.service;/*
 * @author p78o2
 * @date 2020/3/10
 */

import com.example.educonnamddata.commond.PageInfo;
import com.example.educonnamddata.eduSchool.EduSchool;

public interface SchoolService {
//    获取学校列表
    public PageInfo<EduSchool> getSchoolList(String name,int page,int pageSize);
//    新增或修改学校
    public Integer ioeSchool(EduSchool school);
//    删除学校
    public Integer deleteSchool(EduSchool school);
}
