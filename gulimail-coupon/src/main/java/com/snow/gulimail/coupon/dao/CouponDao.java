package com.snow.gulimail.coupon.dao;

import com.snow.gulimail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author snowkelong
 * @email 353657137@qq.com
 * @date 2020-05-19 16:59:52
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
