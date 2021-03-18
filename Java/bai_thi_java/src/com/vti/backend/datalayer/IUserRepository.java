package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Manager;
import com.vti.entity.User;


public interface IUserRepository {
	List<Manager> getListManager() throws SQLException, ClassNotFoundException, FileNotFoundException, IOException ;
	User login(String email, String password) throws Exception;
}

