package com.training.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.owlike.genson.Genson;
import com.training.daos.DonorDAO;
import com.training.daos.ProjectDAO;
import com.training.entities.Donation;
import com.training.entities.Donor;

@RestController
public class ViewDonorController {
	@Autowired
	private ModelAndView mdlView;
	
	@Autowired
	private DonorDAO donorDAO;
	//projectDAO
	@Autowired
	private ProjectDAO projectDAO;
	
	//takes in a project and redirects to the viewDonor page
	@RequestMapping(value="/ViewDonor/{projectID}")
	@ResponseBody
	public  String getDonors(@PathVariable("projectID") long projectID){
		//get the donations for the projectID
		//get the donors info 
		//put them in two different lists
		Set<Donation> setofDonations = projectDAO.find(projectID).getDonationList();
		List<Donation> listofDonations =  new ArrayList<Donation>();
		listofDonations.addAll(setofDonations);
		List<Donor> listofDonors = new ArrayList<Donor>();
		for(Donation donation:listofDonations){
			Donor donatedDonor =  donorDAO.find(donation.getDonorName());
			listofDonors.add(donatedDonor);
		}
		
		Map<String,List> output = new HashMap<String,List>();
		
		output.put("ListofDonations", listofDonations);
		output.put("ListofDonors", listofDonors);
		Genson serializer = new Genson();
		
		
		return serializer.serialize(output);
	}	
}
