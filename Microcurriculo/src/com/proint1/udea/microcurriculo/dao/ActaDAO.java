package com.proint1.udea.microcurriculo.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class ActaDAO extends HibernateDaoSupport {

	private static Logger logger=Logger.getLogger(ActaDAO.class);
	
	public List getActas(){
		logger.info("Consultando la lista de actas...");
		Session session = this.getSession();
		String query = "select p from TbMicActa p";
		List list = session.createQuery(query).list();
		session.close();
		return list;
	}
}
