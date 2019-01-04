package com.imooc.myo2o.util;

public class PathUtil {
	private static String separator = System.getProperty("file.separator");

	public static String getImgBasePath() {
		
		String os = System.getProperty("os.name");
		String basePath = "";
		if (os.toLowerCase().startsWith("win")) {
			basePath = "F:/home/imag/";
		} else {
			basePath = "/home/user/imag/";

		}
		basePath = basePath.replace("/", separator);
		return basePath;
	}
	
	public static String getShopImagePath(long shopId) {
		String imagePath="home/test/"+shopId+"/";
		return imagePath.replace("/", separator);
		
	}
}
