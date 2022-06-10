package grupoprimaria;

import composicion.InfoGrupo;
import primaria.Primaria;

public class GrupoPrimaria extends Primaria{
	private String turno;
	private InfoGrupo infoGrupo;
	
	public GrupoPrimaria() {
		super();
		this.turno ="No hay asignacion de grupo";
		this.infoGrupo = new InfoGrupo();
	}
	
	public GrupoPrimaria(String turno) {
		super();
		this.turno = turno;
		this.infoGrupo = new InfoGrupo();
	}
	
	public GrupoPrimaria(String turno, int grado, String grupo) {
		super();
		this.turno = turno;
		this.infoGrupo = new InfoGrupo(grado, grupo);
	}
	
	
	public GrupoPrimaria(int idEsc, String nameEsc ,String deporte, int salon, String nameProf, String turno, int grado, String grupo) {
		super(idEsc, nameEsc, deporte, salon, nameProf);
		this.turno = turno;
		this.infoGrupo = new InfoGrupo(grado, grupo);
	}
	
	
	public String getTurno() {
		return turno;
	}
	
	public InfoGrupo getInfoGrupo() {
		return infoGrupo;
	}
	
	public void setTurno (String turno) {
		this.turno = turno;
	}
	
	public void setInfoGrupo(InfoGrupo infoGrupo) {
		this.infoGrupo = infoGrupo;
	}
	
	@Override
	public String toString() {
		return "ID Escuela: "+ getIdEsc()+"\tEscuela: "+ getNameEsc()+" \nDeporte: "+ getDeporte()+" \nSalon: "+ getInfo_basica().getSalon()
				+" \nNombre Profesor: "+ getInfo_basica().getNameProf()+"\nTurno: "+ getTurno()+"\nGrado: "+ getInfoGrupo().getGrado()+"\tGrupo: "+
				getInfoGrupo().getGrupo();
	}
	
}
