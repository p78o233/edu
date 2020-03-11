package com.example.eduschoolapi.eduSchool;/*
 * @author p78o2
 * @date 2020/3/10
 */

import com.example.educonnamddata.commond.PageInfo;
import com.example.educonnamddata.eduSchool.EduSchool;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//学校信息管理api
public interface SchoolManageApi {
//    获取学校信息列表
    @RequestMapping(value = "/getSchoolList",method = RequestMethod.GET)
    PageInfo<EduSchool> getSchoolList(@RequestParam String name,@RequestParam int page,@RequestParam int pageSize);

    @RequestMapping(value = "/ioeSchool",method = RequestMethod.POST)
    Integer ioeSchool(@RequestBody EduSchool school);

    @RequestMapping(value = "/deleteSchool",method = RequestMethod.POST)
    Integer deleteSchool(@RequestBody EduSchool school);
}
