/**
 * 
 */
package com.proint1.udea.microcurriculo.ngc;

import java.util.List;

import org.apache.log4j.Logger;

import com.proint1.udea.microcurriculo.dao.EvaluacionDAO;

/**
 * @author YHR
 *
 */
public class EvaluacionNgc implements EvaluacionInt {

	/* (non-Javadoc)
	 * @see com.proint1.udea.microcurriculo.ngc.EvaluacionInt#getEvaluaciones()
	 */
	
	private static Logger logger=Logger.getLogger(EvaluacionNgc.class);
	EvaluacionDAO evaluacionDAO = new EvaluacionDAO();
	
	public EvaluacionDAO getEvaluacionDAO() {
		return evaluacionDAO;
	}

	public void setEvaluacionDAO(EvaluacionDAO evaluacionDAO) {
		this.evaluacionDAO = evaluacionDAO;
	}

	@Override
	public List getEvaluaciones() {
		logger.info("Consultando la lista de evaluaciones...");
		return evaluacionDAO.getEvaluaciones();
	}

}
