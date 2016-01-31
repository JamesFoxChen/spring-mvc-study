package com.imooc.mvcdemo.service;

import org.springframework.stereotype.Service;
import com.imooc.mvcdemo.model.Course;

@Service
public interface ICourseService {
	Course getCoursebyId(Integer courseId);
}
