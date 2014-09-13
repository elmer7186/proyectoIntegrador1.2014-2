/**
 * Logica del micro curriculo
 */
package com.proint1.udea.microcurriculo.ngc;

import java.util.List;

import org.apache.log4j.Logger;

import com.proint1.udea.administracion.TbAdmSemestrexcurso;
import com.proint1.udea.microcurriculo.TbMicActa;
import com.proint1.udea.microcurriculo.TbMicEstadomic;
import com.proint1.udea.microcurriculo.TbMicMicrocurriculo;
import com.proint1.udea.microcurriculo.TbMicNucleoacademico;
import com.proint1.udea.microcurriculo.dao.MicroCurriculoDAO;



/**
 * @author Yonatan Henao R.
 * @version 1.0.0
 *
 */

public class MicroCurriculoNgc implements MicroCurriculoInt {
	
	private MicroCurriculoDAO microCurriculoDAO;
	private static Logger logger = Logger.getLogger(MicroCurriculoNgc.class);
	
	public MicroCurriculoDAO getMicroCurriculoDAO(){
		return microCurriculoDAO;
	}
	
	public void setMicroCurriculoDAO(MicroCurriculoDAO microCurriculoDAO){
		this.microCurriculoDAO = microCurriculoDAO;
	}

	@Override
	public void insertarMicrocurriculo(TbMicMicrocurriculo tbMicMicrocurriculo) {
		logger.info("Insertando el micro curriculo...");
		microCurriculoDAO.insertarMicroCurriculo(tbMicMicrocurriculo);

	}

	@Override
	public void aprobarMicrocurriculo(TbMicEstadomic tbMicEstadomic) {
		logger.info("Aprobando el micro curriculo...");
		microCurriculoDAO.aprobarMicrocurriculo(tbMicEstadomic);

	}

	@Override
	public void devolverMicrocurriculo(TbMicEstadomic tbMicEstadomic) {
		logger.info("Devolviendo el micro curriculo...");
		microCurriculoDAO.devolverMicrocurriculo(tbMicEstadomic);

	}

	@Override
	public void duplicarMicroCurriculo(TbMicMicrocurriculo tbMicMicrocurriculo){
		logger.info("Duplicando el micro curriculo...");
		microCurriculoDAO.duplicarMicroCurriculo(tbMicMicrocurriculo);
		
	}
	
	@Override
	public void aprobarMicroCurriculo(TbMicActa tbMicActa) {
		logger.info("Aprobando el micro curriculo por el acta...");
		microCurriculoDAO.aprobarMicroCurriculo(tbMicActa);

	}

	@Override
	public void aprobarMicroCurriculo(String fecha) {
		logger.info("Aprobando el micro curriculo por la fecha...");
		microCurriculoDAO.aprobarMicroCurriculo(fecha);

	}

	@Override
	public void generarReporteMicroCurriculo(TbAdmSemestrexcurso tbAdmSemestrexcurso) {
		logger.info("Generando el reporte por el semestre en curso...");
		microCurriculoDAO.generarReporteMicroCurriculo(tbAdmSemestrexcurso);

	}

	@Override
	public void generarReporteMicroCurriculo(TbMicNucleoacademico tbMicNucleoacademico) {
		logger.info("Generando el reporte por el nucleo academico...");
		microCurriculoDAO.generarReporteMicroCurriculo(tbMicNucleoacademico);

	}

	@Override
	public void generarReporteMicroCurriculo(TbMicMicrocurriculo tbMicMicrocurriculo) {
		logger.info("Generando el reporte por el micro curriculo...");
		microCurriculoDAO.generarReporteMicroCurriculo(tbMicMicrocurriculo);

	}

	@Override
	public void consultarPorPlanEstudios(int codigoPlanEstudios) {
		logger.info("Consultando por el plan de estudios...");
		microCurriculoDAO.consultarPorPlanEstudios(codigoPlanEstudios);

	}

	@Override
	public void generarDescarga() {
		logger.info("Generando la descarga...");
		microCurriculoDAO.generarDescarga();

	}
	
	@Override
	public TbMicMicrocurriculo getMicroCurriculo(String id){
		logger.info("Obteniendo un micro curriculo...");
		return microCurriculoDAO.getMicroCurriculo(id);
	}
	
	@Override
	public List getMicroCurriculos(){
		logger.info("Obteniendo la lista de los micro curriculos...");
		return microCurriculoDAO.getMicroCurriculos();
	}
	
	@Override
	public List getMicroCurriculosRechazados(){
		logger.info("Obteniendo la lista de los micro curriculos y estados...");
		return microCurriculoDAO.getMicroCurriculosRechazados();
		
	}

	@Override
	public Long asignarIdMicroCurriculo(){
		logger.info("Asignando el id del micro curriculo...");
		return microCurriculoDAO.asignarIdMicroCurriculo();
	}
}
