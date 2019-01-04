package com.imooc.myo2o.service;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.myo2o.BaseTest;
import com.imooc.myo2o.Exception.ShopException;
import com.imooc.myo2o.dto.ShopExecution;
import com.imooc.myo2o.entity.Area;
import com.imooc.myo2o.entity.PersonInfo;
import com.imooc.myo2o.entity.Shop;
import com.imooc.myo2o.entity.ShopCategory;
import com.imooc.myo2o.enums.ShopStateEnum;

public class ShopServiceTest extends BaseTest {
	@Autowired
	private ShopService shopService;
/*
	@Test
	public void testInsertShop() throws Exception {
		Area area = new Area();
		PersonInfo owner = new PersonInfo();
		Shop shop = new Shop();
		ShopCategory shopCategory = new ShopCategory();
		owner.setUserId(1L);
		area.setAreaId(1);
		shopCategory.setShopCategoryId(1L);
		shop.setArea(area);
		shop.setOwner(owner);
		shop.setShopCategory(shopCategory);
		shop.setShopName("测试店铺2");
		shop.setShopDesc("Test2");
		shop.setShopAddr("Test2");
		shop.setPhone("Test2");
		shop.setShopImg("Test2");
		shop.setCreateTime(new Date());
		shop.setEnableStatus(ShopStateEnum.CHECK.getState());
		shop.setAdvice("审核中");
		File imge=new File("F:\\home\\test\\xiaoren.jpg");
 		ShopExecution se = shopService.addShop(shop,imge);
		assertEquals(ShopStateEnum.CHECK.getState(), se.getState());
	}*/

	/*@Test
	public void testUpdateShop() throws Exception {
		Shop shop = new Shop();
		shop.setShopId(2L);
		shop.setAdvice("审核通过");
		shop.setPhone("17621336740");
		shop.setShopAddr("Jiangxi");
		Area area = new Area();
		area.setAreaId(3);
		shop.setArea(area);
		area.setLastEditTime(new Date());
		int effectedNum = shopService.updateShop(shop);
		assertEquals(1, effectedNum);
	}

	ShopExecution addShopMessge(Shop shop, File img) {
		// 判断店铺信息是否为空
		if (shop == null) {
			new ShopExecution(ShopStateEnum.NULL_SHOP);
		}
		try {
			shop.setEnableStatus(ShopStateEnum.CHECK.getState());
			shop.setCreateTime(new Date());
			shop.setLastEditTime(new Date());
			// 插入店铺信息
			int effectedNum = shopService.insertShop(shop);
			// 判断是否插入成功
			if (effectedNum <= 0) {
				throw new ShopException("添加店铺信息失败");
			}else {
				//存储图片并将图片地址赋值给对象
				try {
					addShopImg(shop,img);
				} catch (Exception e) {
					throw new RuntimeException("addShopImg error!"+e.getMessage());
				}
				//更新店铺的图片地址
				effectedNum=shopService.updateShop(shop);
				if(effectedNum<=0) {
					throw new ShopException("更新图片地址失败");
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("addShop error!"+e.getMessage());
		} 

		return null;

	}*/
}
