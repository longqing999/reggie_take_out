package com.zsl.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zsl.reggie.entity.Dish;
import com.zsl.reggie.mapper.DishMapper;
import com.zsl.reggie.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author zhaoshilong
 * @create 2022/8/7 17:10
 */
@Service
@Slf4j
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {
}
