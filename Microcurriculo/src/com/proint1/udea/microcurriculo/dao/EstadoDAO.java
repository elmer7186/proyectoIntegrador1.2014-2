/**
 * 
 */
package com.proint1.udea.microcurriculo.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.proint1.udea.microcurriculo.TbMicEstadomic;

/**
 * @author YHR
 *
 */
public class EstadoDAO extends HibernateDaoSupport {
	
	private static Logger logger=Logger.getLogger(EstadoDAO.class);
	
	public void insertarEstado(TbMicEstadomic tbMicEstadomic){
		this.getHibernateTemplate().save(tbMicEstadomic);
	}
	
	public List getEstados(){
		logger.info("Consultando la lista de estados...");
		Session session = this.getSession();
		String query = "SELECT p FROM TbMicEstadomic p";
		List list = session.createQuery(query).list();
		session.close();
		return list;
	}
	
	public TbMicEstadomic getEstado(String id){
		logger.info("Consultando un estado...");
		Session session = this.getSession();
		String query = "SELECT est FROM TbMicEstadomic est " +
				"WHERE est.nbEstIdn LIKE " + id;
		TbMicEstadomic tbMicEstadomic = (TbMicEstadomic) session.createQuery(query).uniqueResult();
		return tbMicEstadomic;
	}
	
	public List getEstadosRechazados(){
		logger.info("Consultando los estados rechazados...");
		Session session = this.getSession();
		String query = "SELECT est FROM TbMicEstadomic est WHERE (est.vrEstNombreest <> 'Aprobado')";
		List listaEstados = session.createQuery(query).list();
		session.close();
		return listaEstados;
	}
	
	public void duplicarEstado(TbMicEstadomic tbMicEstadomic){
		logger.info("Duplicando el estado...");
		this.getHibernateTemplate().update(tbMicEstadomic);
	}
}
