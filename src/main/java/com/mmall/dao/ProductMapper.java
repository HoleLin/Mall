package com.mmall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mmall.pojo.Product;

public interface ProductMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Product record);

	int insertSelective(Product record);

	List<Product> selectByNameAndProductId(@Param(value = "productName") String productName,
	                                       @Param(value = "productId") Integer productId);

	Product selectByPrimaryKey(Integer id);

	List<Product> selectList();

	int updateByPrimaryKey(Product record);

	int updateByPrimaryKeySelective(Product record);

	List<Product> selectByNameAndCategoryIds(@Param(value = "productName") String productName,
	                                         @Param(value = "categoryIdList") List<Integer> categoryIdList);
}



