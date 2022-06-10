package primaria;

import composicion.InfoBasica;
import superclase.SuperClase;

public class Primaria extends SuperClase {
	private InfoBasica infoBasica;
	private String deporte;
	
	public Primaria() {
		super();
		this.infoBasica = new InfoBasica(1000, "Primaria sin asiganacion de profesor");
		this.deporte = "no hay deporte asignado";
	}
	
	public Primaria(String deporte) {
		super();
		this.infoBasica = new InfoBasica();
		this.deporte = deporte;
	}
	
	public Primaria(String deporte,  int salon, String nameProf) {
		super();
		this.infoBasica = new InfoBasica(salon, nameProf);
		this.deporte = deporte;
	}
	
	public Primaria(int idEsc, String nameEsc ,String deporte, int salon, String nameProf) {
		super(idEsc,nameEsc);
		this.infoBasica = new InfoBasica(salon, nameProf);
		this.deporte = deporte;
	}
	
	public InfoBasica getInfo_basica() {
		return infoBasica;
	}
	
	public void setInfo_basica(InfoBasica info_basica) {
		this.infoBasica = info_basica;
	}
	
	public String getDeporte() {
		return deporte;
	}
	
	public void SetDeporte(String deporte) {
		this.deporte = deporte;
	}
	
	@Override
	public String toString() {
		return "ID Escuela: "+ getIdEsc()+"\tEscuela: "+ getNameEsc()+" \nDeporte: "+ getDeporte()+" \nSalon: "+ getInfo_basica().getSalon()
				+" \nNombre Profesor: "+ getInfo_basica().getNameProf() ;
	}
	
}
