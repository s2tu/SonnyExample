package com.training.daos;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.training.entities.Donor;
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
	
	public List<Project> getAll() {
		if(template == null){
			System.out.println("error:  template is null");
		}
		List<Project> obtainedObjects = (List<Project>)template.find("from Project");
		if(obtainedObjects == null){
			System.out.println("error:  List is null");
		}
		return obtainedObjects; 
	}	

}
