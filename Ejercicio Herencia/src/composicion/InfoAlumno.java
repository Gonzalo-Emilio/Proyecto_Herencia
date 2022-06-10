package composicion;

public class InfoAlumno {
	private int idAlumno;
	private String nameAlumno;
	
	public InfoAlumno(){
		this.idAlumno = 0;
		this.nameAlumno= "Sin asignacion";
	}
	
	public InfoAlumno(int idAlumno, String nameAlumno){
		this.idAlumno = idAlumno;
		this.nameAlumno = nameAlumno;
	}
	
	public int getIdAlumno(){
		return idAlumno;
	}
	
	public String getNameAlumno() {
		return nameAlumno;
	}
	
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	
	public void setNameAlumno(String nameAlumno) {
		this.nameAlumno = nameAlumno;
	}
}
