package com.example.eduschoolprovider.service.impl;/*
 * @author p78o2
 * @date 2020/3/10
 */

import com.example.educonnamddata.commond.PageInfo;
import com.example.educonnamddata.eduSchool.EduSchool;
import com.example.eduschoolprovider.mapper.SchoolMapper;
import com.example.eduschoolprovider.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    private SchoolMapper mapper;
    @Override
    public PageInfo<EduSchool> getSchoolList(String name, int page, int pageSize) {
        int start = (page-1)*pageSize;
        int count = mapper.getSchoolCount(name);
        List<EduSchool> list = mapper.getSchoolPage(name,start,pageSize);
        PageInfo<EduSchool> pageInfo = new PageInfo<>();
        pageInfo.setCount(count);
        pageInfo.setList(list);
        return pageInfo;
    }

    @Override
    public Integer ioeSchool(EduSchool school) {
        if(school.getId() == null){
//            新增

        }else{
//            修改
        }
        return null;
    }

    @Override
    public Integer deleteSchool(EduSchool school) {
        return null;
    }
}
