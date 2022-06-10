package alumnosecundaria;

import gruposecundaria.GrupoSecundaria;
import composicion.InfoAlumno;

public class AlumnoSecundaria extends GrupoSecundaria{
	private int cuentaTaller;
	private InfoAlumno infoAlumno;
	
	public AlumnoSecundaria() {
		super();
		this.cuentaTaller = 0 ;
		this.infoAlumno = new InfoAlumno();
	}
	
	public AlumnoSecundaria(int cuentaTaller) {
		super();
		this.cuentaTaller = cuentaTaller;
		this.infoAlumno = new InfoAlumno();
	}
	
	public AlumnoSecundaria(int cuentaTaller, int idAlumno, String nameAlumno) {
		super();
		this.cuentaTaller = cuentaTaller ;
		this.infoAlumno = new InfoAlumno(idAlumno, nameAlumno);
	}
	
	public AlumnoSecundaria(int idEsc, String nameEsc, String taller, int salon, String nameProf,String turnoTaller, int grado, String grupo, int cuentaTaller, int idAlumno, String nameAlumno) {
		super(idEsc, nameEsc, taller, salon, nameProf, turnoTaller, grado, grupo);
		this.cuentaTaller = cuentaTaller ;
		this.infoAlumno = new InfoAlumno(idAlumno, nameAlumno);
	}
	
	public int getCuentaTaller() {
		return cuentaTaller;
	}
	
	public InfoAlumno getInfoAlumno() {
		return infoAlumno;
	}
	
	public void setCuentaTaller(int cuentaTaller) {
		this.cuentaTaller = cuentaTaller;
				
	}
	
	public void setInfoAlumno(InfoAlumno infoAlumno) {
		this.infoAlumno = infoAlumno;
	}
	
	@Override
	public String toString() {
		return "ID Escuela: "+getIdEsc()+"\tEscuela: "+ getNameEsc()+" \nTaller: "+ getTaller()+" \nSalon: "+ getInfoBasica().getSalon()
				+" \nNombre Profesor: "+ getInfoBasica().getNameProf()+"\nTurno del taller: "+ getTurnoTaller()+"\nGrado: "+ getInfoGrupo().getGrado()+"\tGrupo: "+
				getInfoGrupo().getGrupo()+"\nCuenta del taller: "+ getCuentaTaller()+"\tSalon: "+ getInfoAlumno().getIdAlumno()+"\nNombre Alumno: "+
				getInfoAlumno().getNameAlumno();
	}
	
}
