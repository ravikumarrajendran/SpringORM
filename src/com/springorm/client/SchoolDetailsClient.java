package com.springorm.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.springorm.dao.SchoolDetailsDao;
import com.springorm.entity.SchoolDetails;

public class SchoolDetailsClient 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new FileSystemXmlApplicationContext("bin/Spring.Dao.xml");
		SchoolDetailsDao schooldetailsDao = context.getBean("schooldetailsDaoBean",SchoolDetailsDao.class);
		
		SchoolDetails schooldetails = new SchoolDetails();
		
		schooldetails.setSchool_code(65654);
		schooldetails.setDistrict("karur");
		schooldetails.setArea("gandhigramam");
		schooldetails.setSchool_Name("cheranschool");
		schooldetails.setAddress("karur");
		schooldetails.setFax(98989797l);
		schooldetails.setTelephone(98989898l);
		schooldetails.setEmail_Id("ravisoft@gmail.com");
		
		schooldetailsDao.createSchoolDetails(schooldetails);
		
		List<SchoolDetails> schoolList=schooldetailsDao.getSchoolDetails("karur");
		
		if(schoolList.size()>0){
			
			for(SchoolDetails schooldetail:schoolList){
				System.out.println(schooldetail.getSchool_code());
				System.out.println(schooldetail.getAddress());
				System.out.println(schooldetail.getDistrict());
				System.out.println(schooldetail.getEmail_Id());
				System.out.println(schooldetail.getSchool_Name());
				System.out.println(schooldetail.getTelephone());
				
				
				
				
				
				
			}
			
			
		}
		
		
		
	}
}
