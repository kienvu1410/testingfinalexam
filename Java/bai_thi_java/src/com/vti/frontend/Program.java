package com.vti.frontend;
import com.vti.untils.ScannerUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.entity.Role;
import com.vti.entity.User;
import com.vti.frontend.Function;

public class Program {
	public static void main(String[] args)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Function.getListManager();
	}
	private static void menuLogin() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Function function = new Function();
		System.out.println("MỜI BẠN LOGIN");
		User user = function.login();
		System.out.println("Login successfull!");
		System.out.println("Chào mừng " + user.getFullName() + "!");
		if (user.getRole() == Role.Manager) {
			menuAdmin(user);
		} else {
			menuUser(user);
		}
	}

	private static void menuUser(User user) {
		// TODO
	}

	private static void menuAdmin(User user)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Function function = new Function();
		System.out.println("Moi ban nhap chuc nang muon su dung:\n" + "1: In ra danh sách các User\n"
				+ "2: Tìm user theo ID\n" + "3: Xóa user theo id\n" + "4: Login\n" + "5: Thoat khoi chuong trinh\n ");

		while (true) {
			System.out.print("Moi ban nhap chuc nang: ");
			int choose = ScannerUtils.inputFunction(1, 5, "Ban chi duoc chon tu 1 --> 5. Mời nhập lại!");

}
	}
}
