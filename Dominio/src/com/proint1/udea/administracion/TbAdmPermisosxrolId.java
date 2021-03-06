package com.proint1.udea.administracion;

// default package
// Generated 18/05/2014 06:35:43 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

/**
 * TbAdmPermisosxrolId generated by hbm2java
 */
public class TbAdmPermisosxrolId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long nbPxrIdn;
	private long nbRecIdn;
	private BigDecimal nbRolIdn;
	private Character nbPxrActivo;
	private Character nbPxrAgregar;
	private Character bnPxrEliminar;
	private Character bnPxrActualizar;

	public TbAdmPermisosxrolId() {
	}

	public TbAdmPermisosxrolId(long nbPxrIdn, long nbRecIdn, BigDecimal nbRolIdn) {
		this.nbPxrIdn = nbPxrIdn;
		this.nbRecIdn = nbRecIdn;
		this.nbRolIdn = nbRolIdn;
	}

	public TbAdmPermisosxrolId(long nbPxrIdn, long nbRecIdn,
			BigDecimal nbRolIdn, Character nbPxrActivo, Character nbPxrAgregar,
			Character bnPxrEliminar, Character bnPxrActualizar) {
		this.nbPxrIdn = nbPxrIdn;
		this.nbRecIdn = nbRecIdn;
		this.nbRolIdn = nbRolIdn;
		this.nbPxrActivo = nbPxrActivo;
		this.nbPxrAgregar = nbPxrAgregar;
		this.bnPxrEliminar = bnPxrEliminar;
		this.bnPxrActualizar = bnPxrActualizar;
	}

	public long getNbPxrIdn() {
		return this.nbPxrIdn;
	}

	public void setNbPxrIdn(long nbPxrIdn) {
		this.nbPxrIdn = nbPxrIdn;
	}

	public long getNbRecIdn() {
		return this.nbRecIdn;
	}

	public void setNbRecIdn(long nbRecIdn) {
		this.nbRecIdn = nbRecIdn;
	}

	public BigDecimal getNbRolIdn() {
		return this.nbRolIdn;
	}

	public void setNbRolIdn(BigDecimal nbRolIdn) {
		this.nbRolIdn = nbRolIdn;
	}

	public Character getNbPxrActivo() {
		return this.nbPxrActivo;
	}

	public void setNbPxrActivo(Character nbPxrActivo) {
		this.nbPxrActivo = nbPxrActivo;
	}

	public Character getNbPxrAgregar() {
		return this.nbPxrAgregar;
	}

	public void setNbPxrAgregar(Character nbPxrAgregar) {
		this.nbPxrAgregar = nbPxrAgregar;
	}

	public Character getBnPxrEliminar() {
		return this.bnPxrEliminar;
	}

	public void setBnPxrEliminar(Character bnPxrEliminar) {
		this.bnPxrEliminar = bnPxrEliminar;
	}

	public Character getBnPxrActualizar() {
		return this.bnPxrActualizar;
	}

	public void setBnPxrActualizar(Character bnPxrActualizar) {
		this.bnPxrActualizar = bnPxrActualizar;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbAdmPermisosxrolId))
			return false;
		TbAdmPermisosxrolId castOther = (TbAdmPermisosxrolId) other;

		return (this.getNbPxrIdn() == castOther.getNbPxrIdn())
				&& (this.getNbRecIdn() == castOther.getNbRecIdn())
				&& ((this.getNbRolIdn() == castOther.getNbRolIdn()) || (this
						.getNbRolIdn() != null
						&& castOther.getNbRolIdn() != null && this
						.getNbRolIdn().equals(castOther.getNbRolIdn())))
				&& ((this.getNbPxrActivo() == castOther.getNbPxrActivo()) || (this
						.getNbPxrActivo() != null
						&& castOther.getNbPxrActivo() != null && this
						.getNbPxrActivo().equals(castOther.getNbPxrActivo())))
				&& ((this.getNbPxrAgregar() == castOther.getNbPxrAgregar()) || (this
						.getNbPxrAgregar() != null
						&& castOther.getNbPxrAgregar() != null && this
						.getNbPxrAgregar().equals(castOther.getNbPxrAgregar())))
				&& ((this.getBnPxrEliminar() == castOther.getBnPxrEliminar()) || (this
						.getBnPxrEliminar() != null
						&& castOther.getBnPxrEliminar() != null && this
						.getBnPxrEliminar()
						.equals(castOther.getBnPxrEliminar())))
				&& ((this.getBnPxrActualizar() == castOther
						.getBnPxrActualizar()) || (this.getBnPxrActualizar() != null
						&& castOther.getBnPxrActualizar() != null && this
						.getBnPxrActualizar().equals(
								castOther.getBnPxrActualizar())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getNbPxrIdn();
		result = 37 * result + (int) this.getNbRecIdn();
		result = 37 * result
				+ (getNbRolIdn() == null ? 0 : this.getNbRolIdn().hashCode());
		result = 37
				* result
				+ (getNbPxrActivo() == null ? 0 : this.getNbPxrActivo()
						.hashCode());
		result = 37
				* result
				+ (getNbPxrAgregar() == null ? 0 : this.getNbPxrAgregar()
						.hashCode());
		result = 37
				* result
				+ (getBnPxrEliminar() == null ? 0 : this.getBnPxrEliminar()
						.hashCode());
		result = 37
				* result
				+ (getBnPxrActualizar() == null ? 0 : this.getBnPxrActualizar()
						.hashCode());
		return result;
	}

}
