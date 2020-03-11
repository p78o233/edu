package com.example.eduschoolconsumer.service;/*
 * @author p78o2
 * @date 2020/3/10
 */

import com.example.eduschoolapi.eduSchool.SchoolManageApi;
import com.example.eduschoolconsumer.service.impl.SchoolServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="edu-school-provider", fallback = SchoolServiceImpl.class)
public interface SchoolService extends SchoolManageApi {
}
