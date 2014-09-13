/**
 * 
 */
package com.proint1.udea.microcurriculo.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author YHR
 *
 */
public class UnidadesDAO extends HibernateDaoSupport {

private static Logger logger=Logger.getLogger(UnidadesDAO.class);
	
	public List getUnidades(){
		logger.info("Consultando la lista de unidades...");
		Session session = this.getSession();
		String query = "SELECT * FROM TB_MIC_UNIDADES";
		List list = session.createQuery(query).list();
		session.close();
		return list;
	}
}
