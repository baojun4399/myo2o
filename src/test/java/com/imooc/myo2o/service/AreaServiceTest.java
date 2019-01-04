package com.imooc.myo2o.service;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.myo2o.BaseTest;
import com.imooc.myo2o.entity.Area;

public class AreaServiceTest extends BaseTest {
	@Autowired
	private AreaService areaService;
/*	@Test
	public void testBQueryArea() throws Exception {
		List<Area> areaList = areaService.queryArea();
		for(int i=0;i<areaList.size();i++) {
			System.out.println(areaList.get(i).toString());
		}
	}
	@Test
	public void testAInsertArea() throws Exception {
		Area area = new Area();
		area.setAreaName("西苑");
		area.setPriority(7);
		area.setCreateTime(new Date());
		area.setLastEditTime(new Date());
		int effectedNum = areaService.insertArea(area);
		assertEquals(1, effectedNum);
	}*/
	/*@Test
	public void testUpdateArea() throws Exception {
		Area area = new Area();
		area.setAreaId(1);
		area.setAreaName("南北");
		area.setLastEditTime(new Date());
		int effectedNum = areaService.updateArea(area);
		assertEquals(1, effectedNum);
	}

	@Test
	public void testDDeleteArea() throws Exception {
		long areaId = -1;
		List<Area> areaList = areaService.queryArea();
		for (Area myArea : areaList) {
			if ("区域1".equals(myArea.getAreaName())) {
				areaId = myArea.getAreaId();
			}
		}
		List<Long> areaIdList = new ArrayList<Long>();
		areaIdList.add(areaId);
		int effectedNum = areaService.batchDeleteArea(areaIdList);
		assertEquals(1, effectedNum);
	}*/
}
