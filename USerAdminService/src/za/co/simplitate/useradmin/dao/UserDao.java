package za.co.simplitate.useradmin.dao;

import za.co.simplitate.useradmin.dto.User;
import za.co.simplitate.useradmin.util.IDGenerator;

public class UserDao {
	
	public int create(User user) {
		int id = IDGenerator.generateId();
		return id;
	}

}
