package com.First.api.Dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.First.api.entities.User;

@Repository
@Transactional
public class UserDao {

	@Autowired
	private EntityManager entityManager;
	
	public User findUserAccount(String userName) {
	try {
		String sql ="Select e from" + User.class.getName()+"e"//
				+ "Where e.mail=:mail";
		
		Query query = entityManager.createQuery(sql , User.class);
		Object mail = null;
		query.setParameter("mail", mail);
		
		return(User) query.getSingleResult();
		
	}	catch (NoResultException e) {

	return null;
	}
	}
	
	}
