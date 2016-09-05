package com.training.daos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import com.training.entity.Customer;
import com.training.ifaces.MyDao;


public class CustomerDao implements MyDao<Customer>{
	@Autowired
	BeanPropertyRowMapper<Customer> mapper;
	 
	@Autowired
	private JdbcTemplate template;
	@Override
	public int add(Customer object) {
		String sql="insert into customer values(?,?,?,?)";
		int rowsInserted =template.update(sql, object.getCustomerNumber(), object.getCustomerName(), object.getEmail_id(), object.getPhonenumber());	
		return rowsInserted;
	}
	
	public Customer find(Long key){
		String sql ="select * from customer where customernumber = ?";
		Customer cust = template.queryForObject(sql, mapper, key);
		return cust;
	}
	
	@Override
	public List<Customer> findAll() {
		String sql="select * from customer";
		return template.query(sql, mapper);
	}

}
