package com.snow.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.snow.common.utils.PageUtils;
import com.snow.gulimail.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author snowkelong
 * @email 353657137@qq.com
 * @date 2020-05-19 11:36:27
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

