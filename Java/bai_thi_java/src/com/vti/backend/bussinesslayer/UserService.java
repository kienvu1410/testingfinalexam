package com.vti.backend.bussinesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.Manager;
import com.vti.entity.User;

public class UserService implements IUserService {

	private IUserRepository userRepository;

	public UserService() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userRepository = new UserRepository();
	}
		public List<Manager> getListUsers() throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
	
		
			return userRepository.getListManager();
		}
		@Override
		public List<Manager> getListManager() throws SQLException, ClassNotFoundException {
			// TODO Auto-generated method stub
			return null;
		}
		public User login(String email, String password) throws Exception {
			return userRepository.login(email, password);
}
}
