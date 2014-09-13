// default package
// Generated 18/05/2014 10:37:10 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * TbActTipoActividad generated by hbm2java
 */
public class TbActTipoActividad implements java.io.Serializable {

	private long nbTacIdn;
	private String vrTacNombre;
	private String vrTacDescripcion;
	private Set tbActReporteactividads = new HashSet(0);

	public TbActTipoActividad() {
	}

	public TbActTipoActividad(long nbTacIdn, String vrTacNombre,
			String vrTacDescripcion) {
		this.nbTacIdn = nbTacIdn;
		this.vrTacNombre = vrTacNombre;
		this.vrTacDescripcion = vrTacDescripcion;
	}

	public TbActTipoActividad(long nbTacIdn, String vrTacNombre,
			String vrTacDescripcion, Set tbActReporteactividads) {
		this.nbTacIdn = nbTacIdn;
		this.vrTacNombre = vrTacNombre;
		this.vrTacDescripcion = vrTacDescripcion;
		this.tbActReporteactividads = tbActReporteactividads;
	}

	public long getNbTacIdn() {
		return this.nbTacIdn;
	}

	public void setNbTacIdn(long nbTacIdn) {
		this.nbTacIdn = nbTacIdn;
	}

	public String getVrTacNombre() {
		return this.vrTacNombre;
	}

	public void setVrTacNombre(String vrTacNombre) {
		this.vrTacNombre = vrTacNombre;
	}

	public String getVrTacDescripcion() {
		return this.vrTacDescripcion;
	}

	public void setVrTacDescripcion(String vrTacDescripcion) {
		this.vrTacDescripcion = vrTacDescripcion;
	}

	public Set getTbActReporteactividads() {
		return this.tbActReporteactividads;
	}

	public void setTbActReporteactividads(Set tbActReporteactividads) {
		this.tbActReporteactividads = tbActReporteactividads;
	}

}