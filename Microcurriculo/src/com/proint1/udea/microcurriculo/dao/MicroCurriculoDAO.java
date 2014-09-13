/**
 * Logica del micro curriculo
 */
package com.proint1.udea.microcurriculo.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.proint1.udea.administracion.TbAdmSemestrexcurso;
import com.proint1.udea.microcurriculo.TbMicActa;
import com.proint1.udea.microcurriculo.TbMicEstadomic;
import com.proint1.udea.microcurriculo.TbMicMicrocurriculo;
import com.proint1.udea.microcurriculo.TbMicNucleoacademico;

/**
 * @author Yonatan Henao R.
 * @version 1.0.0
 *
 */
public class MicroCurriculoDAO extends HibernateDaoSupport {

	private static Logger logger = Logger.getLogger(MicroCurriculoDAO.class);
	
	public void insertarMicroCurriculo(TbMicMicrocurriculo tbMicMicrocurriculo){
		logger.info("Insertando el micro curriculo...");
		this.getHibernateTemplate().save(tbMicMicrocurriculo);
	}
	
	public void aprobarMicrocurriculo(TbMicEstadomic tbMicEstadomic) {
		logger.info("Aprobando el micro curriculo...");
		this.getHibernateTemplate().update(tbMicEstadomic);
	}

	public void devolverMicrocurriculo(TbMicEstadomic tbMicEstadomic) {
		logger.info("Devolviendo el micro curriculo...");
		this.getHibernateTemplate().update(tbMicEstadomic);
	}

	public void duplicarMicroCurriculo(TbMicMicrocurriculo tbMicMicrocurriculo){
		logger.info("Duplicando el micro curriculo...");
		this.getHibernateTemplate().update(tbMicMicrocurriculo);
	}
	
	public void aprobarMicroCurriculo(TbMicActa tbMicActa) {
		//TODO Borrar!!!

	}

	public void aprobarMicroCurriculo(String fecha) {
		//TODO Borrar!!!

	}

	public void generarReporteMicroCurriculo(TbAdmSemestrexcurso tbAdmSemestrexcurso) {
		//TODO Borrar!!!

	}

	public void generarReporteMicroCurriculo(TbMicNucleoacademico tbMicNucleoacademico) {
		//TODO Borrar!!!

	}

	public void generarReporteMicroCurriculo(TbMicMicrocurriculo tbMicMicrocurriculo) {
		//TODO Borrar!!!

	}

	public void consultarPorPlanEstudios(int codigoPlanEstudios) {
		//TODO Borrar!!!

	}

	public void generarDescarga() {
		//TODO Borrar!!!

	}
	
	public List getMicroCurriculos(){
		logger.info("Consultando los micro curriculos...");
		Session session = this.getSession();
		String query = "SELECT p FROM TbMicMicrocurriculo p";
		List listaMicroCurriculos = session.createQuery(query).list();
		session.close();
		return listaMicroCurriculos;
	}
	
	public TbMicMicrocurriculo getMicroCurriculo(String id){
		logger.info("Consultando un micro curriculo...");
		Session session = this.getSession();
		String query = "SELECT mic FROM TbMicMicrocurriculo mic " +
				"WHERE mic.nbMicIdn LIKE " + id;
		TbMicMicrocurriculo tbMicMicrocurriculo = (TbMicMicrocurriculo) session.createQuery(query).uniqueResult();
		session.close();
		return tbMicMicrocurriculo;
	}
	
	public List getMicroCurriculosRechazados(){
		logger.info("Consultando los micro curriculos rechazados...");
		Session session = this.getSession();
		String query = "SELECT mic FROM TbMicMicrocurriculo mic " +
				"WHERE (SELECT est.nbEstIdn FROM TbMicEstadomic est " +
				"WHERE(mic.nbMicIdn LIKE est.nbEstIdn) " +
				"AND (est.vrEstNombreest <> 'Aprobado')" +
				"AND (est.vrEstNombreest <> 'Devuelto')) " +
				"LIKE mic.nbMicIdn";
		List listaMicroCurriculos = session.createQuery(query).list();
		session.close();
		return listaMicroCurriculos;
	}
	
	public Long asignarIdMicroCurriculo(){
		logger.info("Contando los micro curriculos...");
		Session session = this.getSession();
		String query = "SELECT COUNT (*) FROM TbMicMicrocurriculo mic";
		Long numeroMicroCurriculos = ((Long) (session.createQuery(query).uniqueResult())) + 1;
		session.close();
		return numeroMicroCurriculos;
	}

}
