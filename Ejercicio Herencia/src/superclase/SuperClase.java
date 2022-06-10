package superclase;

public class SuperClase {
	private int idEsc;
	private String nameEsc;
	
	public SuperClase(){
		this.idEsc = 0;
		this.nameEsc = "No hay tipo de escuela";
	}
	
	public SuperClase(int idEsc, String nameEsc) {
		this.idEsc = idEsc;
		this.nameEsc = nameEsc;
	}
	
	public int getIdEsc() {
		return idEsc;
	}
	
	public String getNameEsc() {
		return nameEsc;
	}
	
	public void setIdEsc(int idEsc) {
		this.idEsc = idEsc;
	}
	
	public void setNameEsc(String nameEsc) {
		this.nameEsc = nameEsc;
	}
	
	public String toString() {
		return "ID Escuela: "+ getIdEsc()+"\tEscuela: "+getNameEsc();
	}
}
