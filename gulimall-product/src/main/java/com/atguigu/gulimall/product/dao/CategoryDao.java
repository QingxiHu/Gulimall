package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author huqingxi
 * @email 470544301h@gmail.com
 * @date 2023-09-21 10:08:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
