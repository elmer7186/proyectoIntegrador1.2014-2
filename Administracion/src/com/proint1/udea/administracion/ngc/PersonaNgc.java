package com.proint1.udea.administracion.ngc;

import java.util.List;

import org.apache.log4j.Logger;

import com.proint1.udea.administracion.Persona;
import com.proint1.udea.administracion.ctl.ConsultarPersonaCtl;
import com.proint1.udea.administracion.dao.PersonaDAO;

public class PersonaNgc implements PersonaInt{
	
	PersonaDAO personaDAO;
	private static Logger logger=Logger.getLogger(PersonaNgc.class);
	
	public PersonaDAO getPersonaDAO() {
		return personaDAO;
	}

	public void setPersonaDAO(PersonaDAO personaDAO) {
		this.personaDAO = personaDAO;
	}

	@Override
	public List getPersonas() {
		logger.info("consultando personas");
		return personaDAO.getPersonas();
	}

	@Override
	public void almacenarPersona(Persona persona) {
		logger.info("almacenando persona  ");
		personaDAO.almacenarPersona(persona);
	}

}
