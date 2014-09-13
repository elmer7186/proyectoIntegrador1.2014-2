/**
 * 
 */
package com.proint1.udea.administracion.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author YHR
 *
 */
public class SemestreXCursoDAO extends HibernateDaoSupport {

private static Logger logger=Logger.getLogger(SemestreXCursoDAO.class);
	
	public List getSemestresXCursos(){
		logger.info("Consultando la lista de semestres por cursos...");
		Session session = this.getSession();
		String query = "SELECT * FROM TB_ADM_SEMESTREXCURSO";
		List list = session.createQuery(query).list();
		session.close();
		return list;
	}
}
