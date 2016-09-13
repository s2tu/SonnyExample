package org.service.daos;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.service.entity.ShoppingCart;
import org.service.iFaces.MyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;


//Further Qualify the Component to be a service
@Service
public class ShoppingCartDaoImpl implements MyDao<ShoppingCart> {

	@Autowired
	HibernateTemplate template;
	
	public Object add(ShoppingCart object) {
		//In a managed environment we do not have to manually open a session
		//spring created the session for us therefore we can just call getCurrentSesison
		Object  key = template.save(object);
		return key;
	}

	public ShoppingCart find(Serializable key) {
		// TODO Auto-generated method stub
		return null;
	}



}
