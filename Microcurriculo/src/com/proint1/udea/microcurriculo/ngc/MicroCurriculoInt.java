/**
 * Interfaz del micro curriculo.
 */
package com.proint1.udea.microcurriculo.ngc;

import java.util.List;

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
public interface MicroCurriculoInt {

	/**
	 * Este procedimiento permite insertar un micro curriculo con todos sus datos.
	 * @param microcurriculo Contiene los datos del micro curriculo a insertar.
	 */
	public void insertarMicrocurriculo(TbMicMicrocurriculo tbMicMicrocurriculo);
	
	/**
	 * Este procedimiento permite aprobar un micro curriculo.
	 * @param estado Contiene los datos del estado del micro curriculo a aprobar.
	 */
	public void aprobarMicrocurriculo(TbMicEstadomic tbMicEstadomic);
	
	/**
	 * Este procedimiento permite actualizar el estado del micro curriculo a devuelto.
	 * @param microcurriculo Contiene los datos parciales del micro curriculo a cambiar 
	 * el estado.
	 */
	public void devolverMicrocurriculo(TbMicEstadomic tbMicEstadomic);
	
	/**
	 * 
	 * @param tbMicMicrocurriculo
	 */
	public void duplicarMicroCurriculo(TbMicMicrocurriculo tbMicMicrocurriculo);
	
	/**
	 * Este procedimiento permite aprobar un micro curriculo por medio de su acta.
	 * @param acta Es el acta al cual el micro curriculo se va a aprobar.
	 */
	public void aprobarMicroCurriculo(TbMicActa tbMicActa);
	
	/**
	 * Este procedimiento permite aprobar un micro curriculo por medio de su fecha.
	 * @param fecha Es la fecha con la cual el micro curriculo se va a aprobar
	 */
	public void aprobarMicroCurriculo(String fecha);
	
	/**
	 * Este procedimiento permite generar un reporte de un micro curriculo por medio del semestre 
	 * en curso.
	 * @param semestrexCurso Es el semestre en curso actual al cual se le buscara al micro curriculo 
	 * para realizar la generacion del reporte.
	 */
	public void generarReporteMicroCurriculo(TbAdmSemestrexcurso tbAdmSemestrexcurso);
	
	/**
	 * Este procedimiento permite generar un reporte de un micro curriculo por medio del nucleo academico.
	 * @param nucleoAcademico Es el numero del nucleo al cual el micro curriculo se va a generar.
	 */
	public void generarReporteMicroCurriculo(TbMicNucleoacademico tbMicNucleoacademico);
	
	/**
	 * Este procedimiento permite generar un reporte de un micro curriculo.
	 * @param microcurriculo Es el micro curriculo al cual se va a generar el reporte.
	 */
	public void generarReporteMicroCurriculo(TbMicMicrocurriculo tbMicMicrocurriculo);
	
	/**
	 * Este procedimiento permite realizar una consulta mediante el plan de estudios.
	 * @param codigoPlanEstudios Es el codigo del plan de estudios al cual se le hara 
	 * la consulta.
	 */
	public void consultarPorPlanEstudios(int codigoPlanEstudios);
	
	/**
	 * Este procedimiento permite generar una descarga de la consulta.
	 */
	public void generarDescarga();
	
	/**
	 * Esta funcion permite obtener un micro curriculo por medio de su 
	 * identificador unico.
	 * @param id Es el identificador o codigo del micro curriculo a consultar.
	 * @return Un objeto con las propiedades de el micro curriculo.
	 */
	public TbMicMicrocurriculo getMicroCurriculo(String id);
	
	/**
	 * Esta funcion retorna una lista de todos los microcurriculos existentes.
	 * @return La lista de todos los micro curriculos.
	 */
	public List getMicroCurriculos();
	
	/**
	 * Esta funcion permite retornar una lista de todos los micro curriculos
	 * rechazados
	 * @return La lista de los micro curriculos rechazados
	 */
	public List getMicroCurriculosRechazados();
	
	/**
	 * Esta funcion permite asignar un nuevo identificador al momento de crear
	 * un micro curriculo.
	 * @return Un numero para asignarlo al micro curriculo.
	 */
	public Long asignarIdMicroCurriculo();
}
