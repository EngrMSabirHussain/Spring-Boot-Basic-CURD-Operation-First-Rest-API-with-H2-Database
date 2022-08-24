package com.example.demo.services;



import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Dao.UserRepository;
import com.example.demo.entities.User;


@Service
public class UserServicesImpl implements UserServices{

	//List<User> list;
	@Autowired
	UserRepository dao;
	
	
	// used for demo purpose for testing before JPA connection
	
	//	public UserServicesImpl() {
	//		list= new ArrayList<>();
	//		list.add(new User(1,"Sabir","Hussain","male",20));
	//	}
	
	
	

	// used for add new user in database
	@Override
	public User addUser(User user) {
		return dao.save(user);

	}
	
	
	
	//used for update current user details by its id and pass data in body in JSON format
	@Override
	public User updateUser(User user) {
		return dao.save(user);
	}
		
	
		
	
	// used for get user by it's id
	public Optional<User> findbById(int i) {
		return dao.findById(i);	
	}
	
	
	
	//used to get all user's from database
	@Override
	public List<User> getAllUser() {	
		return dao.findAll();
	}

	
	//used for delete user by it id from database
	@Override
	public String delUser(int i) {
		dao.deleteById(i);
		return "Delete Successfully";
	}

	
	

	//used to delete all record from current database
	@Override
	public String delAllUsers() {
		dao.deleteAll();
		return "Successfully Delete All Record From Database";
	}

	
	

	

	

	
	
	

	



	




	
}
