package com.example.eduschoolprovider.provider;/*
 * @author p78o2
 * @date 2020/3/10
 */

import com.example.educonnamddata.commond.PageInfo;
import com.example.educonnamddata.eduSchool.EduSchool;
import com.example.eduschoolapi.eduSchool.SchoolManageApi;
import com.example.eduschoolprovider.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

//必须使用restcontroller注解，不然就会去找模板
@RestController
public class ShoolManageProvider implements SchoolManageApi {
    @Autowired
    private SchoolService schoolService;
    @Override
    public PageInfo<EduSchool> getSchoolList(String name, int page, int pageSize) {
        return schoolService.getSchoolList(name,page,pageSize);
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
