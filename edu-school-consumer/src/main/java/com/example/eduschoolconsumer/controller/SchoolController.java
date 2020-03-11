package com.example.eduschoolconsumer.controller;/*
 * @author p78o2
 * @date 2020/3/10
 */

import com.example.educonnamddata.commond.R;
import com.example.eduschoolconsumer.service.SchoolService;
import com.netflix.discovery.converters.Auto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Api(value = "学校管理接口类")
@RestController
@RequestMapping(value = "/school")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @ApiOperation(value = "分页获取学校列表")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "name",dataType = "String",value = "学校名称，模糊查询"),
            @ApiImplicitParam(paramType = "query",name = "page",dataType = "int",value = "页码"),
            @ApiImplicitParam(paramType = "query",name = "pageSize",dataType = "int",value = "每页多少个数据")
    })
    @GetMapping(value = "/getSchoolPage")
    @ResponseBody
    public R getSchoolPage(HttpServletRequest request){
        String name = request.getParameter("name");
        int page = Integer.valueOf(request.getParameter("page"));
        int pageSize = Integer.valueOf(request.getParameter("pageSize"));
        return new R(true,200,schoolService.getSchoolList(name,page,pageSize),"查询成功");
    }
}
