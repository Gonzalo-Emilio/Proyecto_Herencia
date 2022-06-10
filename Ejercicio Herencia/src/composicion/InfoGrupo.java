package composicion;

public class InfoGrupo {
	private int grado;
	private String grupo;
	
	public InfoGrupo(){
		this.grado = 0;
		this.grupo = "Sin asignacion de grado";
	}
	
	public InfoGrupo(int grado, String grupo){
		this.grado = grado;
		this.grupo = grupo;
	}
	
	public int getGrado(){
		return grado;
	}
	
	public String getGrupo() {
		return grupo;
	}
	
	public void setGrado(int grado) {
		this.grado = grado;
	}
	
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
}
