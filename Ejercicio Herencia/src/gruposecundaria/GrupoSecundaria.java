package gruposecundaria;

import composicion.InfoGrupo;
import secundaria.Secundaria;
public class GrupoSecundaria extends Secundaria{
	private String turnoTaller;
	private InfoGrupo infoGrupo;
	
	public GrupoSecundaria() {
		super();
		this.turnoTaller = "No esta asignado un turno";
		this.infoGrupo = new InfoGrupo();
	}
	
	
	public GrupoSecundaria(String turnoTaller) {
		super();
		this.turnoTaller = turnoTaller;
		this.infoGrupo = new InfoGrupo();
	}
	
	public GrupoSecundaria(String turnoTaller, int grado, String grupo) {
		super();
		this.turnoTaller = turnoTaller;
		this.infoGrupo = new InfoGrupo(grado, grupo);
	}
	
	public GrupoSecundaria(int idEsc, String nameEsc, String taller, int salon, String nameProf,String turnoTaller, int grado, String grupo) {
		super(idEsc, nameEsc, taller, salon, nameProf);
		this.turnoTaller = turnoTaller;
		this.infoGrupo = new InfoGrupo(grado, grupo);
	}
	
	public String getTurnoTaller() {
		return turnoTaller;
	}
	
	public InfoGrupo getInfoGrupo() {
		return infoGrupo;
	}
	
	public void setTurnoTaller(String turnoTaller) {
		this.turnoTaller = turnoTaller;
	}
	
	public void setInfoGrupo(InfoGrupo infoGrupo) {
		this.infoGrupo = infoGrupo;
	}
	
	@Override 
	public String toString() {	
		return "ID Escuela: "+ getIdEsc()+"\tEscuela: "+ getNameEsc()+" \nTaller: "+ getTaller()+" \nSalon: "+ getInfoBasica().getSalon()
				+" \nNombre Profesor: "+ getInfoBasica().getNameProf()+"\nTurno del taller: "+getTurnoTaller()+"\nGrado: "+ getInfoGrupo().getGrado()+"\tGrupo: "
				+ getInfoGrupo().getGrupo();
	}
}
