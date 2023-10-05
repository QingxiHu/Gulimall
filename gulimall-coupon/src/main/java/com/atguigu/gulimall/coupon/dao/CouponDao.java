package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author huqingxi
 * @email 470544301h@gmail.com
 * @date 2023-10-04 16:25:35
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
