/**
 * 
 */
package com.proint1.udea.microcurriculo.ngc;

import java.util.List;

import org.apache.log4j.Logger;

import com.proint1.udea.microcurriculo.TbMicEstadomic;
import com.proint1.udea.microcurriculo.dao.EstadoDAO;

/**
 * @author YHR
 *
 */
public class EstadoNgc implements EstadoInt {

	/* (non-Javadoc)
	 * @see com.proint1.udea.microcurriculo.ngc.EstadoInt#getEstados()
	 */
	private static Logger logger=Logger.getLogger(EstadoNgc.class);
	EstadoDAO estadoDAO = new EstadoDAO();
	
	
	public EstadoDAO getEstadoDAO() {
		return estadoDAO;
	}


	public void setEstadoDAO(EstadoDAO estadoDAO) {
		this.estadoDAO = estadoDAO;
	}

	@Override
	public void insertarEstado(TbMicEstadomic tbMicEstadomic){
		logger.info("Insertando el estado del micro curriculo...");
		estadoDAO.insertarEstado(tbMicEstadomic);
	}
	
	@Override
	public List getEstados() {
		logger.info("Consultando la lista de estados...");
		return estadoDAO.getEstados();
	}
	
	@Override
	public TbMicEstadomic getEstado(String id){
		logger.info("Consultando el estado...");
		return estadoDAO.getEstado(id);
	}
	
	@Override
	public List getEstadosRechazados(){
		logger.info("Consultando la lista de estados rechazados...");
		return estadoDAO.getEstadosRechazados();
	}
	
	@Override
	public void duplicarEstado(TbMicEstadomic tbMicEstadomic){
		logger.info("Duplicando el estado...");
		estadoDAO.duplicarEstado(tbMicEstadomic);
		
	}
}
