package com.zsl.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zsl.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author zhaoshilong
 * @create 2022/8/3 16:21
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
