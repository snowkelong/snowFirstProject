package com.snow.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.snow.common.utils.PageUtils;
import com.snow.gulimail.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author snowkelong
 * @email 353657137@qq.com
 * @date 2020-05-19 17:44:55
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

