package edu.clarivate.springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.clarivate.springmvc.dto.User;

@Component
public class UserDao {
	@Autowired
	EntityManager manager;

	public boolean saveUser(User user) {
		EntityTransaction transaction = manager.getTransaction();
		if (user != null) {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return true;
		}
		return false;
	}

	public boolean updateUser(int id, User user) {
		User exsitingUser = manager.find(User.class, id);
		EntityTransaction transaction = manager.getTransaction();
		if (exsitingUser != null) {
			exsitingUser.setUserName(user.getUserName());
			exsitingUser.setUserEmail(user.getUserEmail());
			exsitingUser.setUserPassword(user.getUserPassword());
			exsitingUser.setUserAge(user.getUserAge());
			transaction.begin();
			manager.merge(exsitingUser);
			transaction.commit();
			return true;
		}
		return false;
	}

	public User findUserByEmailAndPassword(String userEmail, String userPassword) {
		String plSql = "SELECT u FROM User u WHERE u.userEmail =?1 AND u.userPassword =?2 ";
		Query query = manager.createQuery(plSql);
		query.setParameter(1, userEmail);
		query.setParameter(2, userPassword);
		List lisOfUser = query.getResultList();
		if (lisOfUser.size() == 1) {
			User user = (User) lisOfUser.get(0);
			return user;
		}
		return null;
	}

	public User findUserById(int id) {
		User user = manager.find(User.class, id);
		if (user != null) {
			return user;
		}
		return null;
	}

	public boolean removeUser(int id) {
		User user = findUserById(id);
		EntityTransaction transaction = manager.getTransaction();
		if (user != null) {
			transaction.begin();
			manager.remove(user);
			transaction.commit();
			return true;
		}
		return false;
	}

	public List<User> findAllUser() {
		String plSql = "SELECT u FROM User u";
		Query query = manager.createQuery(plSql);
		List<User> listofUser = query.getResultList();
		return listofUser;
	}
}
