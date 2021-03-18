package com.vti.backend.presentation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.bussinesslayer.IUserService;
import com.vti.backend.bussinesslayer.UserService;
import com.vti.entity.Manager;
import com.vti.entity.User;

public class UserController {
	private IUserService userService;
	public UserController () throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
	userService = new UserService();
	}
	public List<Manager> getListManager() throws SQLException, ClassNotFoundException {

		return userService.getListManager();
	}
	public User login(String email, String password) throws Exception {
		return userService.login(email, password);
	}
}
