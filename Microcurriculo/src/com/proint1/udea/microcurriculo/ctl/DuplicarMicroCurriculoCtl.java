package com.proint1.udea.microcurriculo.ctl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.log4j.Logger;
import org.zkoss.zhtml.Messagebox;
import org.zkoss.zk.ui.Component;
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
import com.proint1.udea.microcurriculo.ngc.EstadoInt;
import com.proint1.udea.microcurriculo.ngc.MicroCurriculoInt;

public class DuplicarMicroCurriculoCtl extends GenericForwardComposer implements ListitemRenderer {

	private static Logger logger=Logger.getLogger(DuplicarMicroCurriculoCtl.class);
	
	Label lblMicIdn;
	
	Label lblnbMicIdn;
	Textbox txttbMicActa;
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
	//Label lbltbMicEstadomic;
	Textbox txttbAdmSemestrexcurso;
	Textbox txtvrEstObservaciones;
	
	Listbox lbxMicroCurriculo;
	
	MicroCurriculoInt microCurriculoInt;
	EstadoInt estadoInt;
	
	public MicroCurriculoInt getMicroCurriculoInt() {
		return microCurriculoInt;
	}

	public void setMicroCurriculoInt(MicroCurriculoInt microCurriculoInt) {
		this.microCurriculoInt = microCurriculoInt;
	}

	public EstadoInt getEstadoInt() {
		return estadoInt;
	}

	public void setEstadoInt(EstadoInt estadoInt) {
		this.estadoInt = estadoInt;
	}
	
	public void doAfterCompose(Component comp)throws Exception {
		super.doAfterCompose(comp);
		logger.info("cargando ventana duplicar micro curriculo");
	}
	
	public void onCreate() {
		 definirModelo();
	}

	private void definirModelo() {
		List<TbMicEstadomic> listaEstado = estadoInt.getEstadosRechazados();
		ListModel model = new ListModelList(listaEstado);
		lbxMicroCurriculo.setModel(model);
		lbxMicroCurriculo.setItemRenderer((ListitemRenderer) this);
	}
	
	@Override
	public void render(Listitem arg0, Object arg1, int arg2) throws Exception {
		TbMicEstadomic tbMicEstadomic = (TbMicEstadomic)arg1;
		Listcell lcIdn = new Listcell(String.valueOf(tbMicEstadomic.getNbEstIdn()));
		Listcell lcUsuario = new Listcell(tbMicEstadomic.getVrAdtusuario());
		Listcell lcFecha = new Listcell(String.valueOf(tbMicEstadomic.getDtAdtfecha()));
		Listcell lcEstado = new Listcell(String.valueOf(tbMicEstadomic.getVrEstNombreest()));
		Listcell lcObservaciones = new Listcell(String.valueOf(tbMicEstadomic.getVrEstObservaciones()));
		arg0.appendChild(lcIdn);
		arg0.appendChild(lcUsuario);
		arg0.appendChild(lcFecha);
		arg0.appendChild(lcEstado);
		arg0.appendChild(lcObservaciones);
	}

	public void onClick$btnDuplicar(Event event){
		try{
			TbMicMicrocurriculo tbMicMicrocurriculo = new TbMicMicrocurriculo();
			TbMicEstadomic tbMicEstadomic = new TbMicEstadomic();
			
			BigDecimal bigDecimal = new BigDecimal(String.valueOf(lblnbMicIdn.getValue()));
			tbMicEstadomic.setNbEstIdn(bigDecimal);
			tbMicEstadomic.setVrAdtusuario(txtvrAdtusuario.getValue());
			tbMicEstadomic.setVrEstObservaciones(txtvrEstObservaciones.getValue());
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
			tbMicEstadomic.setDtAdtfecha(simpleDateFormat.parse(txtdtAdtfecha.getValue()));
			
			tbMicMicrocurriculo.setNbMicIdn(bigDecimal);
				
			TbMicActa tbMicActa = new TbMicActa();
			// TODO: Consultar el acta antes de ingresarla con un list box.
			tbMicActa.setNbActIdn(Long.parseLong(txttbMicActa.getValue()));
			
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
			
			//TODO Borrar campos en la base de datos el estado; ya tiene una tabla para los estados
			//tbMicMicrocurriculo.setNbMicEstado(Byte.parseByte(txtnbMicEstado.getValue()));
			//tbMicMicrocurriculo.setNbMicEstado(Byte.parseByte(lblnbMicEstado.getValue()));
			
			tbMicEstadomic.setVrEstNombreest(lblnbMicEstado.getValue());
			
			tbMicMicrocurriculo.setVrMicBibliografia(txtvrMicBibliografia.getValue());
			
			// TODO Arreglar el desorden del nuevo mapeo
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
			
			estadoInt.duplicarEstado(tbMicEstadomic);
			microCurriculoInt.duplicarMicroCurriculo(tbMicMicrocurriculo);
			Messagebox.show("Se duplico el micro estado", "Informacion", Messagebox.OK, Messagebox.INFORMATION);
			self.detach();
		}catch(Exception e){
			Messagebox.show("No se pudo duplicar el estado: verifique la validez de los campos.", "Advertencia", Messagebox.OK, Messagebox.EXCLAMATION);
			logger.error("Se ha producido un error: " + e);
		}
	}
	
	public void onClick$btnConfirmar(Event event){
		TbMicMicrocurriculo tbMicMicrocurriculo = new TbMicMicrocurriculo();
		tbMicMicrocurriculo = microCurriculoInt.getMicroCurriculo(lblMicIdn.getValue());
		TbMicEstadomic tbMicEstadomic = new TbMicEstadomic();
		tbMicEstadomic = estadoInt.getEstado(lblMicIdn.getValue());
		
		lblnbMicIdn.setValue(tbMicMicrocurriculo.getNbMicIdn().toString());
		txttbMicActa.setValue(String.valueOf(tbMicMicrocurriculo.getTbMicActa().getNbActIdn()));
		txtvrAdtusuario.setValue(tbMicMicrocurriculo.getVrAdtusuario());
		txtdtAdtfecha.setValue(tbMicMicrocurriculo.getDtAdtfecha().toString());
		
		txtvrMicNombre.setValue(tbMicMicrocurriculo.getVrMicNombre());
		
		txtvrMicValidable.setValue(tbMicMicrocurriculo.getVrMicValidable());
		txtnbMicHorasteoricasemanales.setValue(tbMicMicrocurriculo.getNbMicHorasteoricasemanales().toString());
		
		txtnbMicHorasterosem.setValue(tbMicMicrocurriculo.getNbMicHorasterosem().toString());
		
		txtnbMicNumerocreditos.setValue(tbMicMicrocurriculo.getNbMicNumerocreditos().toString());
		txtnbHorasclasexsemestre.setValue(tbMicMicrocurriculo.getNbHorasclasexsemestre().toString());
		
		txtvrMicCampodeformacion.setValue(tbMicMicrocurriculo.getVrMicCampodeformacion());
		
		txtvrMicHabilitable.setValue(tbMicMicrocurriculo.getVrMicHabilitable());
		
		txtvrMicClasificable.setValue(tbMicMicrocurriculo.getVrMicClasificable());
		txtvrMicRequisitos.setValue(tbMicMicrocurriculo.getVrMicRequisitos());
		
		txtvrMicCorrequisito.setValue(tbMicMicrocurriculo.getVrMicCorrequisito());
		txtnbMicProgram.setValue(String.valueOf(tbMicMicrocurriculo.getNbMicProgram()));
		txtvrMicProposito.setValue(tbMicMicrocurriculo.getVrMicProposito());
		
		txtvrMicJustificacion.setValue(tbMicMicrocurriculo.getVrMicJustificacion());
		txtvrMicObjetivogeneral.setValue(tbMicMicrocurriculo.getVrMicObjetivogeneral());
		
		txtvrMicObjetivosespecificos.setValue(tbMicMicrocurriculo.getVrMicObjetivosespecificos());
		txtvrMicContenidoresumido.setValue(tbMicMicrocurriculo.getVrMicContenidoresumido());
		
		lblnbMicEstado.setValue(tbMicEstadomic.getVrEstNombreest());
		txtvrMicBibliografia.setValue(tbMicMicrocurriculo.getVrMicBibliografia());
		
		txttbMicUnidades.setValue(String.valueOf(tbMicMicrocurriculo.getTbMicUnidades().getNbUniIdn()));
		txttbMicEvaluacion.setValue(String.valueOf(tbMicMicrocurriculo.getTbMicEvaluacion().getNbEvIdn()));
		txttbMicNucleoacademico.setValue(String.valueOf(tbMicMicrocurriculo.getTbMicNucleoacademico().getNbNacIdn()));
		//lbltbMicEstadomic.setValue(tbMicMicrocurriculo.getTbMicEstadomic().getNbEstIdn().toString());
		txttbAdmSemestrexcurso.setValue(String.valueOf(tbMicMicrocurriculo.getTbAdmSemestrexcurso().getNbScuIdn()));
	}
	
	/*public void onClick$lbxMicroCurriculo(Event event){
		List<TbMicMicrocurriculo> lista= (List<TbMicMicrocurriculo>) lbxMicroCurriculo.getSelectedItem();
		TbMicMicrocurriculo tbMicEstadomic = new TbMicMicrocurriculo();
		for(TbMicMicrocurriculo estado: lista){
			tbMicEstadomic = estado;
		}
	}*/
}
