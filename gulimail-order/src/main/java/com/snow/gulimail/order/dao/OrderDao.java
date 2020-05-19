package com.snow.gulimail.order.dao;

import com.snow.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author snowkelong
 * @email 353657137@qq.com
 * @date 2020-05-19 18:01:34
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
