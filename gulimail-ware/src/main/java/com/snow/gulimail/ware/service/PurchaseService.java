package com.snow.gulimail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.snow.common.utils.PageUtils;
import com.snow.gulimail.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author snowkelong
 * @email 353657137@qq.com
 * @date 2020-05-19 18:09:45
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

