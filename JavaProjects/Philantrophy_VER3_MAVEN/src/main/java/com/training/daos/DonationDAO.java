package com.training.daos;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.training.entities.Donation;
import com.training.iFaces.DAO;


@Service
public class DonationDAO implements DAO<Donation> {

	@Autowired
	HibernateTemplate template;
	public Object add(Donation object) {
		Object key = template.save(object);
		return key;
	}

	public Donation find(Serializable key) {
		Donation donate = template.get(Donation.class, key);
		return donate;
	}



	public List<Donation> getAll() {
		Query q = template.getSessionFactory().getCurrentSession().createQuery("from donation");
		return (List<Donation>) q.list(); 

	}

}
