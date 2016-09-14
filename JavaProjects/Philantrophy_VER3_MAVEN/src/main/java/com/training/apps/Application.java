package com.training.apps;


import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.daos.DonationDAO;
import com.training.daos.DonorDAO;
import com.training.daos.ProjectDAO;
import com.training.entities.Donation;
import com.training.entities.Donor;
import com.training.entities.Project;
import com.training.utils.GlobalLogger;

public class Application {
	public static void main(String[] args){
		
		System.out.println("RUNNING THE RIGHT MAIN!");


		ClassPathXmlApplicationContext contxt = new ClassPathXmlApplicationContext("bean.xml");
		
		Project newProject = contxt.getBean(Project.class);
		Donor donor1 = contxt.getBean("donor1",Donor.class);
		Donor donor2 = contxt.getBean("donor2",Donor.class);
		Donor donor3 = contxt.getBean("donor3",Donor.class);
		Donation donation1 = contxt.getBean("donation1", Donation.class);
		Donation donation2 = contxt.getBean("donation2", Donation.class);
		Donation donation3 = contxt.getBean("donation3", Donation.class);
		
		
		ProjectDAO projectDBHandler = (ProjectDAO)contxt.getBean(ProjectDAO.class);
		DonationDAO donationDBHandler = (DonationDAO)contxt.getBean(DonationDAO.class);
		DonorDAO donorDBHandler = (DonorDAO)contxt.getBean(DonorDAO.class);
		
		
		//projectDBHandler.add(newProject);
		//donationDBHandler.add(donation1);
		//donationDBHandler.add(donation2);
		//donationDBHandler.add(donation3);
		donorDBHandler.add(donor1);
		donorDBHandler.add(donor2);
		donorDBHandler.add(donor3);
		/*
		Project dbProject = projectDBHandler.find(newProject.getProjectId());
		Donor dbDonor1 =donorDBHandler.find(donor1.getHandPhone());
		Donor dbDonor2 =donorDBHandler.find(donor2.getHandPhone());
		Donor dbDonor3 =donorDBHandler.find(donor3.getHandPhone());
		Donation dbDonation1 = donationDBHandler.find(donation1.getDonationId());
		Donation dbDonation2 = donationDBHandler.find(donation2.getDonationId());
		Donation dbDonation3 = donationDBHandler.find(donation3.getDonationId());
		
		System.out.println(dbDonor1);
		System.out.println(dbDonor2);
		System.out.println(dbDonor3);
		System.out.println(dbDonation1);
		System.out.println(dbDonation2);
		System.out.println(dbDonation3);
		System.out.println(dbProject);*/
		contxt.close();
		
	}
}
