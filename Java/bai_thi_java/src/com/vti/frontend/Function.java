package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentation.UserController;
import com.vti.entity.Manager;
import com.vti.entity.User;
import com.vti.untils.ScannerUtils;

public class Function {
	
	
	private static UserController userController;
	

	public Function() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userController = new UserController();
}

	public static void getListManager() throws ClassNotFoundException, SQLException {
		List<Manager> managers = userController.getListManager();
		System.out.printf("%-15s %-25s %-25s %-25s\n", "ID", "Email", "Fullname", "Password");
		for (Manager manager : managers) {
			System.out.printf("%-15s %-25s %-25s %-25s\n", manager.getId(), manager.getEmail(), manager.getFullName(),
					"*********");
		}
	}

		public User login() throws ClassNotFoundException, SQLException {
			while (true) {
				System.out.print("Mời bạn nhập vào Email của account: ");
				String email = ScannerUtils.inputEmail("Email chưa đúng định dạng.");

				System.out.print("Mời bạn nhập password: ");
				String password = ScannerUtils
						.inputPassword("Password phai dai tu 6--> 12 ki tu va co it nhat 1 chu viet hoa!");
				try {
					return userController.login(email, password);

				} catch (Exception e) {
					System.err.println(e.getMessage() + "\n");
				}
			}

}
}
