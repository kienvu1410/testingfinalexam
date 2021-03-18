package com.vti.backend.bussinesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Manager;
import com.vti.entity.User;

public interface IUserService {
	List<Manager> getListManager() throws SQLException, ClassNotFoundException;
	User login(String email, String password) throws Exception;
}
