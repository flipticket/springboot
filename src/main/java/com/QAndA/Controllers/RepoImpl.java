package com.QAndA.Controllers;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class RepoImpl implements IRepo {

	@Override
	@Transactional
	public String getData(SessionFactory ses) {
		
		return (String) ses.getCurrentSession().createSQLQuery("select password from flipticket.login_credetinals  limit 1").uniqueResult();
		 
	}
	
	

}
