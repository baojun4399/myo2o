package com.imooc.myo2o.dao;

import com.imooc.myo2o.entity.Shop;

public interface ShopDao {
	/**
	 * 新增店铺
	 */
	int insertShop(Shop shop);

	/**
	 * 修改店铺信息
	 */
	int updateShop(Shop shop);
}
