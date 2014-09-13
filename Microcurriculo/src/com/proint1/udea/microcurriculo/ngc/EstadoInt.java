/**
 * 
 */
package com.proint1.udea.microcurriculo.ngc;

import java.util.List;

import com.proint1.udea.microcurriculo.TbMicEstadomic;

/**
 * @author YHR
 *
 */
public interface EstadoInt {

	/**
	 * Este procedimiento permite ingresar un estado de un micro curriculo.
	 * @param tbMicEstadomic Objeto estado con sus propiedades a ingresar.
	 */
	public void insertarEstado(TbMicEstadomic tbMicEstadomic);
	
	/**
	 * Esta funcion permite retornar una lista de estados disponibles.
	 * @return La lista de todos los estados disponibles.
	 */
	public List getEstados();
	
	/**
	 * Esta funcion permite retornar un solo estado por medio de 
	 * su identificador.
	 * @param id Identificador unico de un estado a obtener
	 * @return Un estado con sus propiedades
	 */
	public TbMicEstadomic getEstado(String id);
	
	/**
	 * Esta funcion permite retornar una lista de estados que esten rechazados.
	 * @return La lista de estados que estan rechazados.
	 */
	public List getEstadosRechazados();
	
	/**
	 * Este procedimiento permite duplicar o alterar un estado que no este aprobado.
	 * @param tbMicEstadomic El estado a alterar o duplicar. 
	 */
	public void duplicarEstado(TbMicEstadomic tbMicEstadomic);
}
