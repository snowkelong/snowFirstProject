package com.snow.gulimail.product.dao;

import com.snow.gulimail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author snowkelong
 * @email 353657137@qq.com
 * @date 2020-05-19 11:36:27
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
