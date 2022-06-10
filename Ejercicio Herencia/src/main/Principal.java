package main;

import primaria.Primaria;
import superclase.SuperClase;
import secundaria.Secundaria;
import grupoprimaria.GrupoPrimaria;
import gruposecundaria.GrupoSecundaria;
import alumnoprimaria.AlumnoPrimaria;
import alumnosecundaria.AlumnoSecundaria;

public class Principal {

	public static void main(String[] args) {
		SuperClase escuela = new SuperClase();
		SuperClase escuela1 = new SuperClase(1,"Ingenieria en computacion");
		System.out.println("-------------------Super Clase -----------------------------");
		System.out.println(escuela.toString());
		System.out.println(escuela1.toString());
		
		System.out.println("-----------------------clase Primaria----------------------------");
		Primaria escuela2 = new Primaria();
		Primaria escuela3 = new Primaria(1, "Ingenieria electrica", "Futbol", 5, "Javier Barros");
		System.out.println(escuela2.toString());
		System.out.println("--------------------------------------------------");
		System.out.println(escuela3.toString());
		
		System.out.println("----------------------------clase secuendaria----------------------");
		Secundaria escuela4 = new Secundaria();
		Secundaria escuela5 = new Secundaria(2, "Ingeniería civil", "taquimecanografía", 5, "Alfonso  Cierra");
		System.out.println(escuela4.toString());
		System.out.println("--------------------------------------------------");
		System.out.println(escuela5.toString());
		
		
		System.out.println("----------------------------clase grupo primaria----------------------");
		GrupoPrimaria escuela6 = new GrupoPrimaria();
		GrupoPrimaria escuela7 = new GrupoPrimaria(3, "Ingenieria mecatronica" , "Basquetbol", 3, "Santiago Aguilar", "Vespertino", 5, "C");
		System.out.println(escuela6.toString());
		System.out.println("--------------------------------------------------");
		System.out.println(escuela7.toString());
		
		System.out.println("----------------------------clase grupo Secundaria----------------------");
		GrupoSecundaria escuela8 = new GrupoSecundaria();
		GrupoSecundaria escuela9 = new GrupoSecundaria(4, "Ingenieria en telecomunicaciones", "Ofimatica", 2, "Roberto Mendoza", "Matutino", 3, "E");
		System.out.println(escuela8.toString());
		System.out.println("--------------------------------------------------");
		System.out.println(escuela9.toString());
		
		
		System.out.println("----------------------------Clase Grupo Primaria----------------------");
		AlumnoPrimaria escuela10 = new AlumnoPrimaria();
		AlumnoPrimaria escuela11 = new AlumnoPrimaria(4, "Ingenieria industrial" ,"handball", 27, "Daniel Ayala", "Nocturno", 2, "A", 314228509, 552, "Rogelio Diaz");
		System.out.println(escuela10.toString());
		System.out.println("--------------------------------------------------");
		System.out.println(escuela11.toString());
		
		System.out.println("----------------------------Clase Grupo Primaria----------------------");
		AlumnoSecundaria escuela12 = new AlumnoSecundaria();
		AlumnoSecundaria escuela13 = new AlumnoSecundaria(5, "Ingenieria Biomedica", "Secretariado", 1, "Mike Ross", "Matutino", 3, "B", 8794561, 12, "Juan Gutierrez");
		System.out.println(escuela12.toString());
		System.out.println("--------------------------------------------------");
		System.out.println(escuela13.toString());
		
	}

}
