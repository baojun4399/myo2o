package com.imooc.myo2o.service.impl;

import java.io.File;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imooc.myo2o.Exception.ShopException;
import com.imooc.myo2o.dao.ShopDao;
import com.imooc.myo2o.dto.ShopExecution;
import com.imooc.myo2o.entity.Shop;
import com.imooc.myo2o.enums.ShopStateEnum;
import com.imooc.myo2o.service.ShopService;
import com.imooc.myo2o.util.ImageUtil;
import com.imooc.myo2o.util.PathUtil;

@Service(value = "shopService")
public class ShopServiceImpl implements ShopService {
	@Autowired
	private ShopDao shopDao;

	@Override
	@Transactional
	public ShopExecution addShop(Shop shop, File imag) {
		// 判断店铺信息是否为空
		if (shop == null) {
			new ShopExecution(ShopStateEnum.NULL_SHOP);
		}
		try {
			shop.setEnableStatus(ShopStateEnum.CHECK.getState());
			shop.setCreateTime(new Date());
			shop.setLastEditTime(new Date());
			// 插入店铺信息
			int effectedNum = shopDao.insertShop(shop);
			// 判断是否插入成功
			if (effectedNum <= 0) {
				throw new ShopException("添加店铺信息失败");
			} else {
				// 存储图片并将图片地址赋值给对象
				try {
					addShopImg(shop, imag);
				} catch (Exception e) {
					throw new RuntimeException("addShopImg error!" + e.getMessage());
				}
				// 更新店铺的图片地址
				effectedNum = shopDao.updateShop(shop);
				if (effectedNum <= 0) {
					throw new ShopException("更新图片地址失败");
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("addShop error!" + e.getMessage());
		}

		return new ShopExecution(ShopStateEnum.CHECK,shop);
	}

	private void addShopImg(Shop shop, File imag) {
		//获取图片的相对存储目录地址
		String realPath=PathUtil.getShopImagePath(shop.getShopId());
		String dest=ImageUtil.generateThumbnail(imag, realPath);
		shop.setShopImg(dest);
		
	}

	@Override
	public int updateShop(Shop shop) {
		return shopDao.updateShop(shop);
	}

}
