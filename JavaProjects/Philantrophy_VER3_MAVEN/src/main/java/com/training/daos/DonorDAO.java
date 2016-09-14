package com.training.daos;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.training.entities.Donation;
import com.training.entities.Donor;
import com.training.iFaces.DAO;

@Service
public class DonorDAO implements DAO<Donor> {
	
	@Autowired
	HibernateTemplate template;
	public Object add(Donor object) {
		Object key = template.save(object);
		return key;
	}

	public Donor find(Serializable key) {
		// TODO Auto-generated method stub
		Donor obtainedDonor = template.get(Donor.class, key);
		return obtainedDonor;
	}

	public List<Donor> getAll() {
		Query q = template.getSessionFactory().getCurrentSession().createQuery("from donor");
		return (List<Donor>) q.list(); 
	}

}
