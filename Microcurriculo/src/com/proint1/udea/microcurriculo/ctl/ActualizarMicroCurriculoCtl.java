package com.proint1.udea.microcurriculo.ctl;

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

public class ActualizarMicroCurriculoCtl extends GenericForwardComposer implements ListitemRenderer {

	private static Logger logger=Logger.getLogger(ActualizarMicroCurriculoCtl.class);
	
	Label lblnbEstIdn;
	Label lblnbMicEstado;
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
		logger.info("cargando ventana actualizar micro curriculo");
	}
	
	public void onCreate() {
		 definirModelo();
	}

	private void definirModelo() {
		List<TbMicEstadomic> listaEstado = estadoInt.getEstados();
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
	}

	public void onClick$btnActualizar(Event event){
		try{
			TbMicEstadomic tbMicEstadomic = new TbMicEstadomic();
			//List<TbMicEstadomic> listaEstados = (List<TbMicEstadomic>) lbxEstadoMicroCurriculo.getListModel();
			tbMicEstadomic = estadoInt.getEstado(lblnbEstIdn.getValue());
			tbMicEstadomic.setVrEstNombreest(lblnbMicEstado.getValue());
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
			tbMicEstadomic.setDtAdtfecha(simpleDateFormat.parse(txtdtAdtfecha.getValue()));
			
			microCurriculoInt.aprobarMicrocurriculo(tbMicEstadomic);
			Messagebox.show("Se actualizo el micro curriculo", "Informacion", Messagebox.OK, Messagebox.INFORMATION);
			self.detach();
		}catch(Exception e){
			Messagebox.show("No se pudo guardar el estado del micro curriculo: aun no se ha seleccionado o llenado alguno de los campos.", "Advertencia", Messagebox.OK, Messagebox.EXCLAMATION);
			logger.error("Se ha producido un error: " + e);
		}
	}
}
