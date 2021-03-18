package com.vti.untils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOStream {
	public static String readFile(String filePath) throws Exception {

		if (!FileManager.checkExist(filePath)) {
			throw new Exception("Sorry! File is not Exist!");
		}

		FileInputStream file = new FileInputStream(filePath);
		byte[] b = new byte[1024];
		int length = file.read(b);
		System.out.println(length);

		while (length > -1) {
			String content = new String(b, 0, length);
			System.out.println(content);
			System.out.println("------------------------------------");
			length = file.read(b);

		}
		file.close();
		String content = "";
		return content;
	}


	public static String writeFile(String pathFile, boolean isContinuing, String content) throws Exception {
		if (!FileManager.checkExist(pathFile)) {
			throw new Exception("Error! File Not Exist");
		}
		FileOutputStream fileOutPut = new FileOutputStream(pathFile, isContinuing);
		fileOutPut.write(content.getBytes());
		fileOutPut.close();
		return content;

	}

}

