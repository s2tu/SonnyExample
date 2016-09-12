package com.training.apps;




import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.entity.Participant;
import com.training.entity.Training;
import com.training.utils.HiberUtils;

public class Application {
	
	public static void main(String args[]){
	//	Participant part1 = new Participant(1,"test");
	//	Participant part2 = new Participant(2,"test2");
		
	//	Set<Participant> list = new HashSet<Participant>();
	//	list.add(part1);
	//	list.add(part2);
		
	//	Training training1 = new Training(1, "Agam", list);
		SessionFactory factory = HiberUtils.getSessionFactory();
		Session session = factory.openSession();
		
		
		Transaction tx = session.beginTransaction();
		Training test =(Training) session.get(Training.class, 1);
		for(Participant p : test.getParticipants()){
			System.out.println(p);
		}
	
	//	session.delete(test);	
	//	session.save(training1);
		tx.commit();
	}
	

}
