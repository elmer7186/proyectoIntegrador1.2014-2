/**
 * 
 */
package com.proint1.udea.microcurriculo.ngc;

import java.util.List;

import org.apache.log4j.Logger;

import com.proint1.udea.microcurriculo.dao.NucleoAcademicoDAO;

/**
 * @author YHR
 *
 */
public class NucleoAcademicoNgc implements NucleoAcademicoInt {

	/* (non-Javadoc)
	 * @see com.proint1.udea.microcurriculo.ngc.NucleoAcademicoInt#getNucleosAcademico()
	 */
	
	private static Logger logger=Logger.getLogger(NucleoAcademicoNgc.class);
	NucleoAcademicoDAO nucleoAcademicoDAO = new NucleoAcademicoDAO();
	
	
	public NucleoAcademicoDAO getNucleoAcademicoDAO() {
		return nucleoAcademicoDAO;
	}

	public void setNucleoAcademicoDAO(NucleoAcademicoDAO nucleoAcademicoDAO) {
		this.nucleoAcademicoDAO = nucleoAcademicoDAO;
	}

	@Override
	public List getNucleosAcademico() {
		logger.info("Consultando la lista de nucleos academicos...");
		return nucleoAcademicoDAO.getNucleosAcademicos();
	}

}
