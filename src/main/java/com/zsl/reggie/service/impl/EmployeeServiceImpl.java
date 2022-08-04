package com.zsl.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zsl.reggie.entity.Employee;
import com.zsl.reggie.mapper.EmployeeMapper;
import com.zsl.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @Author zhaoshilong
 * @create 2022/8/3 16:23
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService {
}
