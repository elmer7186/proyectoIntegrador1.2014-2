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

import com.proint1.udea.microcurriculo.TbMicEstadomic;
import com.proint1.udea.microcurriculo.ngc.EstadoInt;
import com.proint1.udea.microcurriculo.ngc.MicroCurriculoInt;

public class AprobarMicroCurriculoCtl extends GenericForwardComposer implements ListitemRenderer {

	private static Logger logger=Logger.getLogger(AprobarMicroCurriculoCtl.class);
	
	Label lblnbEstIdn;
	Textbox txtdtAdtfecha;
	Listbox lbxEstadoMicroCurriculo;
	
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
		logger.info("cargando ventana aprobar micro curriculo");
	}
	
	public void onCreate() {
		 definirModelo();
	}

	private void definirModelo() {
		List<TbMicEstadomic> listaEstado = estadoInt.getEstadosRechazados();
		ListModel model = new ListModelList(listaEstado);
		lbxEstadoMicroCurriculo.setModel(model);
		lbxEstadoMicroCurriculo.setItemRenderer((ListitemRenderer) this);
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
		
		/*Listcell lcNombre = new Listcell(tbMicMicrocurriculo.getVrMicNombre());
		Listcell lcValidable = new Listcell(tbMicMicrocurriculo.getVrMicValidable());
		Listcell lcHorasTeoricasSemanales = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbMicHorasteoricasemanales()));
		Listcell lcHorasTeroSem = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbMicHorasterosem()));
		Listcell lcNumeroCreditos = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbMicNumerocreditos()));
		Listcell lcHorasClaseXSemestre = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbHorasclasexsemestre()));
		Listcell lcCampoDeFormacion = new Listcell(tbMicMicrocurriculo.getVrMicCampodeformacion());
		
		Listcell lcHabilitable = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbMicIdn()));
		Listcell lcClasificable = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbMicIdn()));
		Listcell lcRequisitos = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbMicIdn()));
		Listcell lcCorrequisito = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbMicIdn()));
		Listcell lcProgram = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbMicIdn()));
		Listcell lcProposito = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbMicIdn()));
		Listcell lcJustificacion = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbMicIdn()));
		Listcell lcObjetivoGeneral = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbMicIdn()));
		Listcell lcObjetivosEspecificos = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbMicIdn()));
		Listcell lcContenidoResumido = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbMicIdn()));
		Listcell lcUnidad = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbMicIdn()));
		Listcell lcBibliografia = new Listcell(String.valueOf(tbMicMicrocurriculo.getNbMicIdn()));*/
		
		
		/*arg0.appendChild(lcNombre);
		arg0.appendChild(lcValidable);
		arg0.appendChild(lcHorasTeoricasSemanales);
		arg0.appendChild(lcHorasTeroSem);
		arg0.appendChild(lcNumeroCreditos);
		arg0.appendChild(lcHorasClaseXSemestre);
		arg0.appendChild(lcCampoDeFormacion);
		arg0.appendChild(lcScuIdn);
		arg0.appendChild(lcActIdn);
		arg0.appendChild(lcNacIdn);
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
		arg0.appendChild(lcUnidad);
		arg0.appendChild(lcBibliografia);*/
	}

	public void onClick$btnAprobar(Event event) throws Exception {
		try{
			TbMicEstadomic tbMicEstadomic = new TbMicEstadomic();
			//List<TbMicEstadomic> listaEstados = (List<TbMicEstadomic>) lbxEstadoMicroCurriculo.getListModel();
			tbMicEstadomic = estadoInt.getEstado(lblnbEstIdn.getValue());
			tbMicEstadomic.setVrEstNombreest("Aprobado");
			tbMicEstadomic.setVrEstObservaciones("Ninguna");
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
			tbMicEstadomic.setDtAdtfecha(simpleDateFormat.parse(txtdtAdtfecha.getValue()));
			
			 
			//tbMicEstadomic = (TbMicEstadomic) lbxMicroCurriculo.getListModel().getElementAt(Integer.parseInt(lblnbEstIdn.getValue()));
			//Listitem listitem 
			//tbMicEstadomic = (TbMicEstadomic) lbxMicroCurriculo.getItemAtIndex(Integer.parseInt(lblnbEstIdn.getValue())).getFirstChild();
			//= (TbMicEstadomic) listitem.getFirstChild();
					
			/*BigDecimal bigDecimal = new BigDecimal(String.valueOf(lblnbEstIdn.getValue()));
			tbMicEstadomic.setNbEstIdn(bigDecimal);
			tbMicEstadomic.setVrAdtusuario(lblvrAdtUsuario.getValue());
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
			tbMicEstadomic.setDtAdtfecha(simpleDateFormat.parse(lblAdtFecha.getValue()));
			tbMicEstadomic.setVrEstNombreest(lblvrEstNobreest.getValue());*/
			
			//tbMicEstadomic=estadoInt.getEstado();
			microCurriculoInt.aprobarMicrocurriculo(tbMicEstadomic);
			
			Messagebox.show("Se aprobó el micro curriculo", "Informacion", Messagebox.OK, Messagebox.INFORMATION);
			self.detach();
		}catch(Exception e){
			Messagebox.show("No se pudo guardar el estado del micro curriculo: aun no se ha seleccionado una fila o no se ha ingresado bien la fecha.", "Advertencia", Messagebox.OK, Messagebox.EXCLAMATION);
			logger.error("Se ha producido un error: " + e);
		}
	}
}
