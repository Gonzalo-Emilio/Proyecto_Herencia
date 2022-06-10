package alumnoprimaria;

import grupoprimaria.GrupoPrimaria;
import composicion.InfoAlumno;

public class AlumnoPrimaria extends GrupoPrimaria{
	private int cuenta;
	private InfoAlumno infoAlumno;
	
	public AlumnoPrimaria(){
		super();
		this.cuenta = 0;
		this.infoAlumno = new InfoAlumno();
	}
	
	public AlumnoPrimaria(int cuenta){
		super();
		this.cuenta = cuenta;
		this.infoAlumno = new InfoAlumno();
	}
	
	public AlumnoPrimaria(int cuenta, int idAlumno, String nameAlumno){
		super();
		this.cuenta = cuenta;
		this.infoAlumno = new InfoAlumno(idAlumno, nameAlumno);
	}
	
public AlumnoPrimaria(int idEsc, String nameEsc ,String deporte, int salon, String nameProf, String turno, int grado, String grupo, int cuenta, int idAlumno, String nameAlumno){
		super(idEsc, nameEsc, deporte, salon, nameProf, turno, grado, grupo);
		this.cuenta = cuenta;
		this.infoAlumno = new InfoAlumno(idAlumno, nameAlumno);
	}
	
	public int getCuenta() {
		return cuenta;
	}
	
	public InfoAlumno getInfoAlumno() {
		return infoAlumno;
	}
	
	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}
	
	public void setInfoAlumno(InfoAlumno infoAlumno) {
		this.infoAlumno = infoAlumno;
	}
	
	@Override
	public String toString() {
		return "ID Escuela: "+ getIdEsc()+"\tEscuela: "+ getNameEsc()+" \nDeporte: "+ getDeporte()+" \nSalon: "+ getInfo_basica().getSalon()
				+" \nNombre Profesor: "+ getInfo_basica().getNameProf()+"\nTurno: "+ getTurno()+"\nGrado: "+ getInfoGrupo().getGrado()+"\tGrupo: "+
				getInfoGrupo().getGrupo()+"\nCuenta: "+ getCuenta()+"\tSalon: "+ getInfoAlumno().getIdAlumno()+"\nNombre Alumno: "+
				getInfoAlumno().getNameAlumno();
	}
	
	
	
}
