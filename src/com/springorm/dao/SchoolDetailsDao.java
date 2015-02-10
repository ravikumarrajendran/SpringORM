package com.springorm.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.springorm.entity.SchoolDetails;

public class SchoolDetailsDao extends HibernateDaoSupport  {
	
	public void createSchoolDetails(SchoolDetails schooldetails){
		getHibernateTemplate().save(schooldetails);
	}
	
	public List getSchoolDetails(String chil){
		DetachedCriteria detached = DetachedCriteria.forClass(SchoolDetails.class);
		//detached.add(criterion)
		detached.add(Restrictions.eq("address", chil));
		return getHibernateTemplate().findByCriteria(detached);
		
	}
	 

}
