package com.imooc.myo2o.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.myo2o.dao.AreaDao;
import com.imooc.myo2o.entity.Area;
import com.imooc.myo2o.service.AreaService;
@Service(value="areaService")
public class AreaServiceImpl implements AreaService{
	@Autowired
	private AreaDao areaDao;
	@Override
	public List<Area> queryArea() {
       return areaDao.queryArea();
	}

	@Override
	public int insertArea(Area area) {
		return areaDao.insertArea(area);
	}

	@Override
	public int updateArea(Area area) {
		return areaDao.updateArea(area);
	}

	@Override
	public int deleteArea(long areaId) {
		return 0;
	}

	@Override
	public int batchDeleteArea(List<Long> areaIdList) {
		return 0;
	}

}
