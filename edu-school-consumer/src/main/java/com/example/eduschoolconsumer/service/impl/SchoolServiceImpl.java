package com.example.eduschoolconsumer.service.impl;/*
 * @author p78o2
 * @date 2020/3/10
 */

import com.example.educonnamddata.commond.PageInfo;
import com.example.educonnamddata.eduSchool.EduSchool;
import com.example.eduschoolconsumer.service.SchoolService;
import org.springframework.stereotype.Component;
//熔断器，生产者没有反应了，就会返回这个部分的内容
@Component
public class SchoolServiceImpl implements SchoolService {
    @Override
    public PageInfo<EduSchool> getSchoolList(String name, int page, int pageSize) {
        return null;
    }

    @Override
    public Integer ioeSchool(EduSchool school) {
        return null;
    }

    @Override
    public Integer deleteSchool(EduSchool school) {
        return null;
    }
}
