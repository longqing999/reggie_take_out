package com.zsl.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsl.reggie.entity.Category;

/**
 * @Author zhaoshilong
 * @create 2022/8/7 14:08
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
