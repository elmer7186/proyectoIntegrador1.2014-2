// default package
// Generated 18/05/2014 10:37:10 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * TbPrdAutor generated by hbm2java
 */
public class TbPrdAutor implements java.io.Serializable {

	private long nbAutIdn;
	private TbAdmPaises tbAdmPaises;
	private TbAdmPersona tbAdmPersona;
	private Set tbPrdAutoresxproduccions = new HashSet(0);

	public TbPrdAutor() {
	}

	public TbPrdAutor(long nbAutIdn, TbAdmPaises tbAdmPaises,
			TbAdmPersona tbAdmPersona) {
		this.nbAutIdn = nbAutIdn;
		this.tbAdmPaises = tbAdmPaises;
		this.tbAdmPersona = tbAdmPersona;
	}

	public TbPrdAutor(long nbAutIdn, TbAdmPaises tbAdmPaises,
			TbAdmPersona tbAdmPersona, Set tbPrdAutoresxproduccions) {
		this.nbAutIdn = nbAutIdn;
		this.tbAdmPaises = tbAdmPaises;
		this.tbAdmPersona = tbAdmPersona;
		this.tbPrdAutoresxproduccions = tbPrdAutoresxproduccions;
	}

	public long getNbAutIdn() {
		return this.nbAutIdn;
	}

	public void setNbAutIdn(long nbAutIdn) {
		this.nbAutIdn = nbAutIdn;
	}

	public TbAdmPaises getTbAdmPaises() {
		return this.tbAdmPaises;
	}

	public void setTbAdmPaises(TbAdmPaises tbAdmPaises) {
		this.tbAdmPaises = tbAdmPaises;
	}

	public TbAdmPersona getTbAdmPersona() {
		return this.tbAdmPersona;
	}

	public void setTbAdmPersona(TbAdmPersona tbAdmPersona) {
		this.tbAdmPersona = tbAdmPersona;
	}

	public Set getTbPrdAutoresxproduccions() {
		return this.tbPrdAutoresxproduccions;
	}

	public void setTbPrdAutoresxproduccions(Set tbPrdAutoresxproduccions) {
		this.tbPrdAutoresxproduccions = tbPrdAutoresxproduccions;
	}

}
