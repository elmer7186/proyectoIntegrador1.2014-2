package com.proint1.udea.microcurriculo.ctl;

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

import com.proint1.udea.microcurriculo.TbMicEstadomic;
import com.proint1.udea.microcurriculo.TbMicMicrocurriculo;
import com.proint1.udea.microcurriculo.ngc.EstadoInt;
import com.proint1.udea.microcurriculo.ngc.MicroCurriculoInt;

public class DevolverMicroCurriculoCtl extends GenericForwardComposer implements ListitemRenderer {

	private static Logger logger=Logger.getLogger(DevolverMicroCurriculoCtl.class);
	
	Label lblnbMicIdn;
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
		logger.info("cargando ventana devolver micro curriculo");
	}
	
	public void onCreate() {
		 definirModelo();
	}

	private void definirModelo() {
		List<TbMicMicrocurriculo> listaMicroCurriculo = microCurriculoInt.getMicroCurriculosRechazados();
		ListModel model = new ListModelList(listaMicroCurriculo);
		lbxMicroCurriculo.setModel(model);
		lbxMicroCurriculo.setItemRenderer((ListitemRenderer) this);
	}
	
	@Override
	public void render(Listitem arg0, Object arg1, int arg2) throws Exception {
		TbMicMicrocurriculo tbMicMicrocurriculo = (TbMicMicrocurriculo)arg1;
		Listcell lcIdn = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbMicIdn()));
		Listcell lcUsuario = new Listcell(tbMicMicrocurriculo.getVrAdtusuario());
		Listcell lcFecha = new Listcell(String.valueOf(tbMicMicrocurriculo.getDtAdtfecha()));
		//Listcell lcEstado = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbMicEstado()));
		
		Listcell lcNombre = new Listcell(tbMicMicrocurriculo.getVrMicNombre());
		Listcell lcValidable = new Listcell(tbMicMicrocurriculo.getVrMicValidable());
		Listcell lcHorasTeoricasSemanales = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbMicHorasteoricasemanales()));
		Listcell lcHorasTeroSem = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbMicHorasterosem()));
		Listcell lcNumeroCreditos = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbMicNumerocreditos()));
		Listcell lcHorasClaseXSemestre = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbHorasclasexsemestre()));
		Listcell lcCampoDeFormacion = new Listcell(tbMicMicrocurriculo.getVrMicCampodeformacion());
		
		Listcell lcHabilitable = new Listcell(tbMicMicrocurriculo.getVrMicHabilitable());
		Listcell lcClasificable = new Listcell(tbMicMicrocurriculo.getVrMicClasificable());
		Listcell lcRequisitos = new Listcell(tbMicMicrocurriculo.getVrMicRequisitos());
		Listcell lcCorrequisito = new Listcell(tbMicMicrocurriculo.getVrMicCorrequisito());
		Listcell lcProgram = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbMicProgram()));
		Listcell lcProposito = new Listcell(tbMicMicrocurriculo.getVrMicProposito());
		Listcell lcJustificacion = new Listcell(tbMicMicrocurriculo.getVrMicJustificacion());
		Listcell lcObjetivoGeneral = new Listcell(tbMicMicrocurriculo.getVrMicObjetivogeneral());
		Listcell lcObjetivosEspecificos = new Listcell(tbMicMicrocurriculo.getVrMicObjetivosespecificos());
		Listcell lcContenidoResumido = new Listcell(tbMicMicrocurriculo.getVrMicContenidoresumido());
		Listcell lcUnidad = new Listcell(String.valueOf(tbMicMicrocurriculo.getTbMicUnidades().getNbUniIdn()));
		Listcell lcBibliografia = new Listcell(tbMicMicrocurriculo.getVrMicBibliografia());
		
		arg0.appendChild(lcIdn);
		arg0.appendChild(lcUsuario);
		arg0.appendChild(lcFecha);
		
		arg0.appendChild(lcNombre);
		arg0.appendChild(lcValidable);
		arg0.appendChild(lcHorasTeoricasSemanales);
		arg0.appendChild(lcHorasTeroSem);
		arg0.appendChild(lcNumeroCreditos);
		arg0.appendChild(lcHorasClaseXSemestre);
		arg0.appendChild(lcCampoDeFormacion);
		/*arg0.appendChild(lcScuIdn);
		arg0.appendChild(lcActIdn);
		arg0.appendChild(lcNacIdn);*/
		arg0.appendChild(lcHabilitable);
		arg0.appendChild(lcClasificable);
		arg0.appendChild(lcRequisitos);
		arg0.appendChild(lcCorrequisito);
		arg0.appendChild(lcProgram);
		arg0.appendChild(lcProposito);
		arg0.appendChild(lcJustificacion);
		arg0.appendChild(lcObjetivoGeneral);
		arg0.appendChild(lcObjetivosEspecificos);
		arg0.appendChild(lcContenidoResumido);
		//arg0.appendChild(lcEstado);
		arg0.appendChild(lcBibliografia);
		arg0.appendChild(lcUnidad);
	}

	public void onClick$btnDevolver(Event event){
		try{
			TbMicEstadomic tbMicEstadomic = new TbMicEstadomic();
			//List<TbMicEstadomic> listaEstados = (List<TbMicEstadomic>) lbxEstadoMicroCurriculo.getListModel();
			tbMicEstadomic = estadoInt.getEstado(lblnbMicIdn.getValue());
			tbMicEstadomic.setVrEstNombreest("Devuelto");
			tbMicEstadomic.setVrEstObservaciones(txtvrEstObservaciones.getValue());
			
			microCurriculoInt.devolverMicrocurriculo(tbMicEstadomic);
			Messagebox.show("Se devolvio el micro curriculo", "Informacion", Messagebox.OK, Messagebox.INFORMATION);
			self.detach();
		}catch(Exception e){
			Messagebox.show("Ocurrio algun problema: No se realizaron los cambios.", "Error", Messagebox.OK, Messagebox.ERROR);
			logger.error("Se ha producido un error: " + e);
		}
	}
}
