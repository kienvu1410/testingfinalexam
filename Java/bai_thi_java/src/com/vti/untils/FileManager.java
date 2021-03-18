package com.vti.untils;

import java.io.File;

public class FileManager {

		// TODO Auto-generated method stub
		public static boolean checkExist(String filePath) {
			File file = new File(filePath);
			if (file.exists()) {
				System.out.println("File is exist!");
			} else {
				System.out.println("File is not exist!");
			}
			return true;

		}

		public static void createNewFile1(String pathFile) throws Exception {

			File file = new File(pathFile);
			if (file.exists()) {
				throw new Exception("Error! File Exist");

			} else if (file.createNewFile()) {
				System.out.println("Congratulations! Create Successfully");
			}
		}


		public static void deleteFile(String pathFile) throws Exception {

			File file = new File(pathFile);

			if (file.exists()) {
				file.delete();
				System.out.println("Congratulations! Delete Successfully");

			} else {
				throw new Exception("Error! File Not Exist");
			}
		}

		public static void isFolder(String path) {
			File file = new File(path);
			System.out.println(file.isDirectory() ? "Path is Folder " : "Path is File");
		}


		public static void getAllFileName(String path) throws Exception {
			File file = new File(path);
			if (file.isDirectory()) {
				for (String fileName : file.list()) {
					System.out.println(fileName);
				}
			} else {
				throw new Exception("Error! Path is not folder");
			}

		}


		public static void copyFile(String sourceFile, String distinationPath, String newName) throws Exception {
			File file = new File(sourceFile);
			if (!file.exists()) {
				throw new Exception("Error! Source File Not Exist");
			} else if (file.exists()) {
				throw new Exception("Error! newPath has File same name");
			}
		}

	
	}


