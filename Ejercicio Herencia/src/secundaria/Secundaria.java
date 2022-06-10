package secundaria;

import composicion.InfoBasica;
import superclase.SuperClase;

public class Secundaria extends SuperClase{
	private InfoBasica infoBasica;
	private String taller;
	
	public Secundaria() {
		super();
		this.taller = "No hay un taller asignado";
		this.infoBasica = new InfoBasica();
	}
	
	public Secundaria(String taller) {
		super();
		this.taller = taller; 
		this.infoBasica = new InfoBasica();
	}
	
	public Secundaria(int idEsc, String nameEsc, String taller) {
		super(idEsc, nameEsc);
		this.taller = taller;
		this.infoBasica = new InfoBasica();
	}
	
	public Secundaria (int idEsc, String nameEsc, String taller, int salon, String nameProf) {
		super(idEsc, nameEsc);
		this.taller = taller;
		this.infoBasica = new InfoBasica(salon, nameProf);
	}
	
	public InfoBasica getInfoBasica() {
		return infoBasica;
	}
	
	public String getTaller() {
		return taller;
	}
	
	public void setInfoBasica (InfoBasica infoBasica) {
		this.infoBasica = infoBasica;
	}
	
	public void setTaller (String taller) {
		this.taller = taller;
	}
	
	@Override
	public String toString() {
		return "ID Escuela: "+ getIdEsc()+"\tEscuela: "+ getNameEsc()+" \nTaller: "+ getTaller()+" \nSalon: "+ getInfoBasica().getSalon()
				+" \nNombre Profesor: "+ getInfoBasica().getNameProf();
	}
	
}
