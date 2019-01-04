package com.imooc.myo2o.service;

import java.io.File;

import com.imooc.myo2o.dto.ShopExecution;
import com.imooc.myo2o.entity.Shop;

public interface ShopService {
	/**
	 * 新增店铺
	 */
	ShopExecution addShop(Shop shop,File imag);

	/**
	 * 修改店铺信息
	 */
	int updateShop(Shop shop);

}
