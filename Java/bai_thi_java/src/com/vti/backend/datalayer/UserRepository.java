package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Manager;
import com.vti.entity.Role;
import com.vti.entity.User;
import com.vti.untils.JDBCUtils;

public class UserRepository  implements IUserRepository{
private JDBCUtils jdbcUtils;
private Connection connection;
public UserRepository()  {
	try {
		jdbcUtils = new JDBCUtils();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public List<Manager> getListManager() throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
	List<Manager> managers = new ArrayList<>();
	try {
		// Step 2: get connect
		connection = jdbcUtils.connect();

		// Step 3: Create a statement object
		Statement statement = connection.createStatement();
		String listManager = " SELECT  M.ID, M.FullName, M.Email, P.IdManager, P.ProjectId\r\n"
				+ "FROM manager M JOIN project P ON P.IdManager = M.Id\r\n"
				+ "GROUP BY ProjectId ";
		ResultSet resultSet = statement.executeQuery(listManager);


		// Step 5: Handling result set
		while (resultSet.next()) {
			int id = resultSet.getInt("ID");
			String fullName = resultSet.getString("FullName");
			String email = resultSet.getString("Email");
			String password = resultSet.getString("Password");
			Role role = Role.valueOf(resultSet.getString("Role"));
            int expInYear= resultSet.getInt("ExpInYear");
			Manager manager = new Manager(id, fullName, email, password, role, expInYear);
managers.add(manager);
			
		}
		return managers;}
	finally {
		connection.close();
	}
	}
	public User login(String email, String password) throws Exception{
		try {

			// step 2: get connect
			connection = jdbcUtils.connect();

			// Step 3: Create a statement object

			String sql = "SELECT * FROM usermanager.user " + "WHERE Email = ? AND Password = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// set parameter
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);

			// Step 4: Execute Query

			ResultSet resultSet = preparedStatement.executeQuery();

			// Step 5: Handling result
			if (resultSet.next()) {
				int userId = resultSet.getInt("UserID");
				String fullName = resultSet.getString("FullName");
				Role role = Role.valueOf(resultSet.getString("Role").toUpperCase());

				User user = new User(userId, fullName, email, password, role);
				return user;
			} else {
				throw new Exception("Tai khoan hoac mat khau sai!");
			}

		} finally {
			connection.close();
		}
		}
		public User login(String email, String password) throws Exception {

			try {

				// step 2: get connect
				connection = jdbcUtils.connect();

				// Step 3: Create a statement object

				String sql = "SELECT * FROM usermanager.user " + "WHERE Email = ? AND Password = ? ";
				PreparedStatement preparedStatement = connection.prepareStatement(sql);

				// set parameter
				preparedStatement.setString(1, email);
				preparedStatement.setString(2, password);

				// Step 4: Execute Query

				ResultSet resultSet = preparedStatement.executeQuery();

				// Step 5: Handling result
				if (resultSet.next()) {
					int userId = resultSet.getInt("UserID");
					String fullName = resultSet.getString("FullName");
					Role role = Role.valueOf(resultSet.getString("Role").toUpperCase());

					User user = new User(userId, fullName, email, password, role);
					return user;
				} else {
					throw new Exception("Tai khoan hoac mat khau sai!");
				}

			} finally {
				connection.close();
			}




}
}