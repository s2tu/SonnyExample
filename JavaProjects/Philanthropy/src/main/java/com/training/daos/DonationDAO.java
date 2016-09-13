package com.training.daos;

import java.io.Serializable;

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

}
