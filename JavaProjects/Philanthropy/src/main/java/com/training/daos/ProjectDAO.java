package com.training.daos;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.training.entities.Project;
import com.training.iFaces.DAO;

@Service
public class ProjectDAO implements DAO<Project> {
	
	//this is autowired by type no need to specify id
	@Autowired
	HibernateTemplate template;
	public Object add(Project object) {
		// TODO Auto-generated method stub
		Object key = template.save(object);
		return key;
	}

	public Project find(Serializable key) {
		// TODO Auto-generated method stub
		Project proj = template.get(Project.class, key);
		return proj;
	}

}
