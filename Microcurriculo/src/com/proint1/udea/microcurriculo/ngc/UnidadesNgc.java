/**
 * 
 */
package com.proint1.udea.microcurriculo.ngc;

import java.util.List;

import org.apache.log4j.Logger;

import com.proint1.udea.microcurriculo.dao.UnidadesDAO;

/**
 * @author YHR
 *
 */
public class UnidadesNgc implements UnidadesInt {

	/* (non-Javadoc)
	 * @see com.proint1.udea.microcurriculo.ngc.UnidadesInt#getUnidades()
	 */
	
	private static Logger logger=Logger.getLogger(UnidadesNgc.class);
	UnidadesDAO unidadesDAO = new UnidadesDAO();
	
	public UnidadesDAO getUnidadesDAO() {
		return unidadesDAO;
	}

	public void setUnidadesDAO(UnidadesDAO unidadesDAO) {
		this.unidadesDAO = unidadesDAO;
	}

	@Override
	public List getUnidades() {
		logger.info("Consultando la lista de las unidades...");
		return unidadesDAO.getUnidades();
	}

}
