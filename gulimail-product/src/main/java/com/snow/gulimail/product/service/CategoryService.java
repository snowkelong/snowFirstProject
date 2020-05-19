package com.snow.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.snow.common.utils.PageUtils;
import com.snow.gulimail.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author snowkelong
 * @email 353657137@qq.com
 * @date 2020-05-19 11:36:27
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

