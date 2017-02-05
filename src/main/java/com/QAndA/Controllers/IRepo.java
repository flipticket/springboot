package com.QAndA.Controllers;

import org.hibernate.SessionFactory;

public interface IRepo {
	
	public String getData(SessionFactory ses);

}
