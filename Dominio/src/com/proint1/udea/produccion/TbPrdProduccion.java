package com.proint1.udea.produccion;

// default package
// Generated 18/05/2014 06:35:43 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TbPrdProduccion generated by hbm2java
 */
public class TbPrdProduccion implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long nbIdn;
	private TbPrdTipoproduccion tbPrdTipoproduccion;
	private String vrNombreproduccion;
	private Date dtFechapublicacion;
	private char blEstado;
	private Date dtAdtfecha;
	private String vrAdtusuario;
	private Set tbPrdAutoresxproduccions = new HashSet(0);
	private Set tbPrdDetalleproducioneses = new HashSet(0);

	public TbPrdProduccion() {
	}

	public TbPrdProduccion(long nbIdn, TbPrdTipoproduccion tbPrdTipoproduccion,
			String vrNombreproduccion, Date dtFechapublicacion, char blEstado,
			Date dtAdtfecha, String vrAdtusuario) {
		this.nbIdn = nbIdn;
		this.tbPrdTipoproduccion = tbPrdTipoproduccion;
		this.vrNombreproduccion = vrNombreproduccion;
		this.dtFechapublicacion = dtFechapublicacion;
		this.blEstado = blEstado;
		this.dtAdtfecha = dtAdtfecha;
		this.vrAdtusuario = vrAdtusuario;
	}

	public TbPrdProduccion(long nbIdn, TbPrdTipoproduccion tbPrdTipoproduccion,
			String vrNombreproduccion, Date dtFechapublicacion, char blEstado,
			Date dtAdtfecha, String vrAdtusuario, Set tbPrdAutoresxproduccions,
			Set tbPrdDetalleproducioneses) {
		this.nbIdn = nbIdn;
		this.tbPrdTipoproduccion = tbPrdTipoproduccion;
		this.vrNombreproduccion = vrNombreproduccion;
		this.dtFechapublicacion = dtFechapublicacion;
		this.blEstado = blEstado;
		this.dtAdtfecha = dtAdtfecha;
		this.vrAdtusuario = vrAdtusuario;
		this.tbPrdAutoresxproduccions = tbPrdAutoresxproduccions;
		this.tbPrdDetalleproducioneses = tbPrdDetalleproducioneses;
	}

	public long getNbIdn() {
		return this.nbIdn;
	}

	public void setNbIdn(long nbIdn) {
		this.nbIdn = nbIdn;
	}

	public TbPrdTipoproduccion getTbPrdTipoproduccion() {
		return this.tbPrdTipoproduccion;
	}

	public void setTbPrdTipoproduccion(TbPrdTipoproduccion tbPrdTipoproduccion) {
		this.tbPrdTipoproduccion = tbPrdTipoproduccion;
	}

	public String getVrNombreproduccion() {
		return this.vrNombreproduccion;
	}

	public void setVrNombreproduccion(String vrNombreproduccion) {
		this.vrNombreproduccion = vrNombreproduccion;
	}

	public Date getDtFechapublicacion() {
		return this.dtFechapublicacion;
	}

	public void setDtFechapublicacion(Date dtFechapublicacion) {
		this.dtFechapublicacion = dtFechapublicacion;
	}

	public char getBlEstado() {
		return this.blEstado;
	}

	public void setBlEstado(char blEstado) {
		this.blEstado = blEstado;
	}

	public Date getDtAdtfecha() {
		return this.dtAdtfecha;
	}

	public void setDtAdtfecha(Date dtAdtfecha) {
		this.dtAdtfecha = dtAdtfecha;
	}

	public String getVrAdtusuario() {
		return this.vrAdtusuario;
	}

	public void setVrAdtusuario(String vrAdtusuario) {
		this.vrAdtusuario = vrAdtusuario;
	}

	public Set getTbPrdAutoresxproduccions() {
		return this.tbPrdAutoresxproduccions;
	}

	public void setTbPrdAutoresxproduccions(Set tbPrdAutoresxproduccions) {
		this.tbPrdAutoresxproduccions = tbPrdAutoresxproduccions;
	}

	public Set getTbPrdDetalleproducioneses() {
		return this.tbPrdDetalleproducioneses;
	}

	public void setTbPrdDetalleproducioneses(Set tbPrdDetalleproducioneses) {
		this.tbPrdDetalleproducioneses = tbPrdDetalleproducioneses;
	}

}
