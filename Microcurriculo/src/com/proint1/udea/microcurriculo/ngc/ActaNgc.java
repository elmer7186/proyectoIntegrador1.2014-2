package com.proint1.udea.microcurriculo.ngc;

import java.util.List;

import org.apache.log4j.Logger;

import com.proint1.udea.microcurriculo.dao.ActaDAO;

public class ActaNgc implements ActaInt {

	private static Logger logger=Logger.getLogger(ActaNgc.class);
	ActaDAO actaDAO = new ActaDAO();
	
	public ActaDAO getActaDAO() {
		return actaDAO;
	}

	public void setActaDAO(ActaDAO actaDAO) {
		this.actaDAO = actaDAO;
	}

	@Override
	public List getActas() {
		logger.info("Consultando la lista de actas...");
		return actaDAO.getActas();
	}

}
