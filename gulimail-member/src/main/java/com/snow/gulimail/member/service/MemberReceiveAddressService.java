package com.snow.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.snow.common.utils.PageUtils;
import com.snow.gulimail.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author snowkelong
 * @email 353657137@qq.com
 * @date 2020-05-19 17:44:56
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

