package com.training.apps;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Doctor;
import com.training.domains.Patient;

public class FirstExample {
	public static void main(String args[]){
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");){

			
			//Patient patientBean = ctx.getBean(Patient.class);
			/*  First Example
			System.out.println("Bean returned by ioc container :=" +  patientBean.toString());
			System.out.println("HashCode of patientBean1 " + patientBean.hashCode());
			Patient patientBean2 = ctx.getBean(Patient.class);
			System.out.println("HashCode of patientBean2 " + patientBean2.hashCode());*/
			
			
			Patient patientBean = ctx.getBean("patBean3", Patient.class);
			
			
			Doctor doctor = ctx.getBean("docBean1", Doctor.class);
			System.out.println("Doctor:=" + doctor);
			System.out.println("Patient:= " + patientBean);
			
			Doctor doctor2 = ctx.getBean("docBean2", Doctor.class);
			System.out.println("Doctor2:=" + doctor2);
			Doctor doctor3 = ctx.getBean("docBean3", Doctor.class);
			System.out.println("Doctor3:=" + doctor3);
			
			System.out.println(doctor3.getPatient());
			
			Doctor doctor4 = ctx.getBean("docBean4", Doctor.class);
			System.out.println(doctor4.getSupportStaff());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
