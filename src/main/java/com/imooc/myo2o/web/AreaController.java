package com.imooc.myo2o.web;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.imooc.myo2o.entity.Area;
import com.imooc.myo2o.service.AreaService;
@Controller
@RequestMapping("/superadmin")
public class AreaController {
	@Autowired
	private AreaService areaService;
   Logger log=LoggerFactory.getLogger(Area.class);
	@RequestMapping(value = "/listareas")
	@ResponseBody
	private Map<String, Object> listAreas() {
		log.info("===start===");
		long startTime=System.currentTimeMillis();
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<Area> list = new ArrayList<Area>();
		try {
			list = areaService.queryArea();
			modelMap.put("rows", list);
			modelMap.put("total", list.size());

		} catch (Exception e) {
			e.printStackTrace();
			modelMap.put("success", false);
			modelMap.put("errMsg", e.toString());
		}
		log.error("Test Error!");
		long endTime=System.currentTimeMillis();
		log.debug("costTime:[{}ms]",endTime-startTime);
		log.info("===end===");
		return modelMap;
	}
}
