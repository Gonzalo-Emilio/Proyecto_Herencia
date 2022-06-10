package composicion;

public class InfoBasica {
	private int salon;
	private String nameProf;
	
	public InfoBasica(){
		this.salon = 0;
		this.nameProf = "Sin asignacion";
	}
	
	public InfoBasica(int salon, String nameProf){
		this.salon = salon;
		this.nameProf = nameProf;
	}
	
	public int getSalon(){
		return salon;
	}
	
	public String getNameProf() {
		return nameProf;
	}
	
	public void setSalon(int salon) {
		this.salon = salon;
	}
	
	public void setNameProf(String nameProf) {
		this.nameProf = nameProf;
	}
}
