package com.zsl.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zsl.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author zhaoshilong
 * @create 2022/8/7 17:06
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
