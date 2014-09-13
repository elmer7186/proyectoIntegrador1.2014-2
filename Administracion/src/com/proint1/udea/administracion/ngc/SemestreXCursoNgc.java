/**
 * 
 */
package com.proint1.udea.administracion.ngc;

import java.util.List;

import org.apache.log4j.Logger;

import com.proint1.udea.administracion.dao.SemestreXCursoDAO;

/**
 * @author YHR
 *
 */
public class SemestreXCursoNgc implements SemestreXCursoInt {

	/* (non-Javadoc)
	 * @see com.proint1.udea.administracion.ngc.SemestreXCursoInt#getSemestresXCursos()
	 */
	
	private static Logger logger=Logger.getLogger(SemestreXCursoNgc.class);
	SemestreXCursoDAO semestreXCursoDAO = new SemestreXCursoDAO();
	
	public SemestreXCursoDAO getSemestreXCursoDAO() {
		return semestreXCursoDAO;
	}

	public void setSemestreXCursoDAO(SemestreXCursoDAO semestreXCursoDAO) {
		this.semestreXCursoDAO = semestreXCursoDAO;
	}

	@Override
	public List getSemestresXCursos() {
		logger.info("Consultando la lista de los semestres por cursos...");
		return semestreXCursoDAO.getSemestresXCursos();
	}

}
