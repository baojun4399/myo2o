package com.imooc.myo2o.service;

import java.util.List;

import com.imooc.myo2o.entity.Area;

public interface AreaService {

	/**
		 * 列出地域列表
		 * 
		 * @param areaCondition
		 * @return
		 */
		List<Area> queryArea();
	
		/**
		 * 
		 * @param area
		 * @return
		 */
		int insertArea(Area area);
	
		/**
		 * 
		 * @param area
		 * @return
		 */
		int updateArea(Area area);
	
		/**
		 * 
		 * @param areaId
		 * @return
		 */
		int deleteArea(long areaId);
	
		/**
		 * 
		 * @param areaIdList
		 * @return
		 */
		int batchDeleteArea(List<Long> areaIdList);

}
