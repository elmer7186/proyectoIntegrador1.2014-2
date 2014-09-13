package com.proint1.udea.microcurriculo.ctl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.log4j.Logger;
import org.zkoss.zhtml.Button;
import org.zkoss.zhtml.Messagebox;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Label;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.ListitemRenderer;
import org.zkoss.zul.Textbox;

import com.proint1.udea.administracion.TbAdmSemestrexcurso;
import com.proint1.udea.microcurriculo.TbMicActa;
import com.proint1.udea.microcurriculo.TbMicEstadomic;
import com.proint1.udea.microcurriculo.TbMicEvaluacion;
import com.proint1.udea.microcurriculo.TbMicMicrocurriculo;
import com.proint1.udea.microcurriculo.TbMicNucleoacademico;
import com.proint1.udea.microcurriculo.TbMicUnidades;
import com.proint1.udea.microcurriculo.ngc.ActaInt;
import com.proint1.udea.microcurriculo.ngc.EstadoInt;
import com.proint1.udea.microcurriculo.ngc.MicroCurriculoInt;

public class CrearMicroCurriculoCtl extends GenericForwardComposer implements ListitemRenderer {

	private static Logger logger=Logger.getLogger(CrearMicroCurriculoCtl.class);
	
	Label lblnbMicIdn;
	Label lbltbMicActa;
	Textbox txtvrAdtusuario;
	Textbox txtdtAdtfecha;
	Textbox txtvrMicNombre;
	Textbox txtvrMicValidable;
	Textbox txtnbMicHorasteoricasemanales;
	Textbox txtnbMicHorasterosem;
	Textbox txtnbMicNumerocreditos;
	Textbox txtnbHorasclasexsemestre;
	Textbox txtvrMicCampodeformacion;
	Textbox txtvrMicHabilitable;
	Textbox txtvrMicClasificable;
	Textbox txtvrMicRequisitos;
	Textbox txtvrMicCorrequisito;
	Textbox txtnbMicProgram;
	Textbox txtvrMicProposito;
	Textbox txtvrMicJustificacion;
	Textbox txtvrMicObjetivogeneral;
	Textbox txtvrMicObjetivosespecificos;
	Textbox txtvrMicContenidoresumido;
	Label lblnbMicEstado;
	Textbox txtvrMicBibliografia;
	
	Textbox txttbMicUnidades;
	Textbox txttbMicEvaluacion;
	Textbox txttbMicNucleoacademico;
	Textbox txttbAdmSemestrexcurso;
	
	MicroCurriculoInt microCurriculoInt;
	EstadoInt estadoInt;
	ActaInt actaInt;
	
	public MicroCurriculoInt getMicroCurriculoInt(){
		return microCurriculoInt;
	}
	
	public void setMicroCurriculoInt(MicroCurriculoInt microCurriculoInt){
		this.microCurriculoInt = microCurriculoInt;
	}
	
	public EstadoInt getEstadoInt() {
		return estadoInt;
	}

	public void setEstadoInt(EstadoInt estadoInt) {
		this.estadoInt = estadoInt;
	}

	public ActaInt getActaInt() {
		return actaInt;
	}

	public void setActaInt(ActaInt actaInt) {
		this.actaInt = actaInt;
	}

	public void doAfterCompose(Component comp)throws Exception {
		super.doAfterCompose(comp);
		logger.info("cargando ventana ingresar micro curriculo");
	}
	
	public void onCreate() {
		definirModelo();
	}
	
	Listbox listActas;
	private void definirModelo() {
		lblnbMicIdn.setValue(String.valueOf(microCurriculoInt.asignarIdMicroCurriculo()));
		List<TbMicActa> listaActas = actaInt.getActas();
		ListModel listModel = new ListModelList(listaActas);
		listActas.setModel(listModel);
		listActas.setItemRenderer(this);
	}
	
	@Override
	public void render(Listitem arg0, Object arg1, int arg2) throws Exception {
		TbMicActa tbMicActa = (TbMicActa)arg1;
		Listcell lcIdn = new Listcell(String.valueOf(tbMicActa.getNbActIdn()));
		Listcell lcUsuario = new Listcell(tbMicActa.getVrAdtusuario());
		Listcell lcFecha = new Listcell(String.valueOf(tbMicActa.getDtAdtfecha()));
		Listcell lcContenido = new Listcell(tbMicActa.getVrActContenido());
		Listcell lcAsistentes = new Listcell(tbMicActa.getVrActAsistentes());
		Listcell lcOrdenDia = new Listcell(tbMicActa.getVrActOrdendeldia());
		Listcell lcDesarrollo = new Listcell(tbMicActa.getVrActDesarrollo());
		Listcell lcFirmas = new Listcell(tbMicActa.getVrActFirmas());
		arg0.appendChild(lcIdn);
		arg0.appendChild(lcUsuario);
		arg0.appendChild(lcFecha);
		arg0.appendChild(lcContenido);
		arg0.appendChild(lcAsistentes);
		arg0.appendChild(lcOrdenDia);
		arg0.appendChild(lcDesarrollo);
		arg0.appendChild(lcFirmas);
	}
	
	public void onClick$btnCrear(Event event) throws WrongValueException, ParseException {

		TbMicMicrocurriculo tbMicMicrocurriculo = new TbMicMicrocurriculo();
		TbMicEstadomic tbMicEstadomic = new TbMicEstadomic();
		
		try {
			BigDecimal bigDecimal = new BigDecimal(String.valueOf(lblnbMicIdn.getValue()));
			tbMicEstadomic.setNbEstIdn(bigDecimal);
			tbMicEstadomic.setVrAdtusuario(txtvrAdtusuario.getValue());
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
			tbMicEstadomic.setDtAdtfecha(simpleDateFormat.parse(txtdtAdtfecha.getValue()));
			tbMicEstadomic.setVrEstObservaciones("Ninguna");
			
			tbMicMicrocurriculo.setNbMicIdn(bigDecimal);
				
			TbMicActa tbMicActa = new TbMicActa();
			tbMicActa.setNbActIdn(Long.parseLong(lbltbMicActa.getValue()));
			
			tbMicMicrocurriculo.setVrAdtusuario(txtvrAdtusuario.getValue());
			tbMicMicrocurriculo.setDtAdtfecha(simpleDateFormat.parse(txtdtAdtfecha.getValue()));
			tbMicMicrocurriculo.setVrMicNombre(txtvrMicNombre.getValue());
			tbMicMicrocurriculo.setVrMicValidable(txtvrMicValidable.getValue());
			tbMicMicrocurriculo.setNbMicHorasteoricasemanales(Byte.parseByte(txtnbMicHorasteoricasemanales.getValue()));
			tbMicMicrocurriculo.setNbMicHorasterosem(Short.parseShort(txtnbMicHorasterosem.getValue()));
			tbMicMicrocurriculo.setNbMicNumerocreditos(Byte.parseByte(txtnbMicNumerocreditos.getValue()));
			tbMicMicrocurriculo.setNbHorasclasexsemestre(Short.parseShort(txtnbHorasclasexsemestre.getValue()));
			tbMicMicrocurriculo.setVrMicCampodeformacion(txtvrMicCampodeformacion.getValue());
			
			tbMicMicrocurriculo.setVrMicHabilitable(txtvrMicHabilitable.getValue());
			tbMicMicrocurriculo.setVrMicClasificable(txtvrMicClasificable.getValue());
			tbMicMicrocurriculo.setVrMicRequisitos(txtvrMicRequisitos.getValue());
			tbMicMicrocurriculo.setVrMicCorrequisito(txtvrMicCorrequisito.getValue());
			tbMicMicrocurriculo.setNbMicProgram(Byte.parseByte(txtnbMicProgram.getValue()));
			tbMicMicrocurriculo.setVrMicProposito(txtvrMicProposito.getValue());
			tbMicMicrocurriculo.setVrMicJustificacion(txtvrMicJustificacion.getValue());
			tbMicMicrocurriculo.setVrMicObjetivogeneral(txtvrMicObjetivogeneral.getValue());
			tbMicMicrocurriculo.setVrMicObjetivosespecificos(txtvrMicObjetivosespecificos.getValue());
			tbMicMicrocurriculo.setVrMicContenidoresumido(txtvrMicContenidoresumido.getValue());
			
			tbMicEstadomic.setVrEstNombreest(lblnbMicEstado.getValue());
			
			tbMicMicrocurriculo.setVrMicBibliografia(txtvrMicBibliografia.getValue());
			
			TbMicUnidades tbMicUnidades = new TbMicUnidades();
			tbMicUnidades.setNbUniIdn(Long.parseLong(txttbMicUnidades.getValue()));
			
			TbMicEvaluacion tbMicEvaluacion = new TbMicEvaluacion();
			tbMicEvaluacion.setNbEvIdn(Long.parseLong(txttbMicEvaluacion.getValue()));
			
			TbMicNucleoacademico tbMicNucleoacademico = new TbMicNucleoacademico();
			tbMicNucleoacademico.setNbNacIdn(Long.parseLong(txttbMicNucleoacademico.getValue()));
			
			TbAdmSemestrexcurso tbAdmSemestrexcurso = new TbAdmSemestrexcurso();
			tbAdmSemestrexcurso.setNbScuIdn(Long.parseLong(txttbAdmSemestrexcurso.getValue()));
			
			tbMicMicrocurriculo.setTbMicUnidades(tbMicUnidades);
			tbMicMicrocurriculo.setTbMicEvaluacion(tbMicEvaluacion);
			tbMicMicrocurriculo.setTbMicNucleoacademico(tbMicNucleoacademico);
			tbMicMicrocurriculo.setTbMicEstadomic(tbMicEstadomic);
			tbMicMicrocurriculo.setTbMicActa(tbMicActa);
			tbMicMicrocurriculo.setTbAdmSemestrexcurso(tbAdmSemestrexcurso);
			
			tbMicEstadomic.setTbMicMicrocurriculo(tbMicMicrocurriculo);
			
			estadoInt.insertarEstado(tbMicEstadomic);
			microCurriculoInt.insertarMicrocurriculo(tbMicMicrocurriculo);
		
			Messagebox.show("Se guardo el micro curriculo", "Informacion", Messagebox.OK, Messagebox.INFORMATION);
			self.detach();
		} catch (Exception e) {
			Messagebox.show("No se pudo guardar el micro curriculo: verifique la validez de los campos.", "Advertencia", Messagebox.OK, Messagebox.EXCLAMATION);
			logger.error("Se ha producido un error: " + e);
		}
	}

}
