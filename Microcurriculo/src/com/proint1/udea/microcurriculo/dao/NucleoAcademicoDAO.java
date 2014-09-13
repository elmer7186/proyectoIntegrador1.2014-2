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
public class NucleoAcademicoDAO extends HibernateDaoSupport {

private static Logger logger=Logger.getLogger(NucleoAcademicoDAO.class);
	
	public List getNucleosAcademicos(){
		logger.info("Consultando la lista de nucleos academicos...");
		Session session = this.getSession();
		String query = "SELECT * FROM TB_MIC_NUCLEOACADEMICO";
		List list = session.createQuery(query).list();
		session.close();
		return list;
	}
}
