package ej.Clima;

//IMPLEMENTACIÓN PARCIAL DE CLASE EstacionClimática
import java.util.Scanner; 

public class EstacionClimatica 
{ 
 // instance variables - replace the example below with your own 
 private String nombre; 
 private  int año; 
 private TempHumDia mediciones[];  // Tabla de mediciones 
 private int nummediciones;      // Número de mediciones almacenadas 

 /** 
  * Constructor for objects of class EstacionClimatica 
  */ 
 public EstacionClimatica() 
 { 
      this.nombre = ""; 
      this.año = 2000;  
      mediciones = new TempHumDia[366];  // Por si el año es bisiesto.  
      nummediciones = 0; 
 } 
 
 public EstacionClimatica( String nombre, int año) 
 { 
      this(); // Llamo al constructor por defecto 
      this.nombre = nombre; 
      this.año = año; 
      
 } 

 
 
 
 public boolean addDia ( TempHumDia media){ 
    
	 
	 
	 return true; 
 } 
 
 public boolean delDia ( TempHumDia media){ 
     return true;  // COMPLETAR 
 } 
 
 public void listarDias(){ 
     // COMPLETAR 
  
 } 
 
 // Método auxiliar que me indica si una fecha es correcta 
static boolean fechaOK ( int dia, int mes, int año){ 
	 boolean fechaOk=true;
	if (dia<0 || mes>12 || mes<0 || año<0|| dia>31) {
		fechaOk=false;
	}
	else {
   if (mes<8) {
	   if (mes%2==0 && mes!=2) {
		   if (dia==31) {
			   fechaOk=false;  
		   }
	   }
	   if (mes==2)
		   if (dia>28) {
			   fechaOk=false;
		   }
   }
   else {
	   if (mes%2!=0) {
		   if (dia==31) {
			   fechaOk=false;  
		   }   
	   }
   }
	}
    return fechaOk;
 } 
 
 
 static TempHumDia leerMedida () { 

      Scanner leer = new Scanner(System.in); 
      int dia,mes,año, tempmax, tempmin, hummax, hummin; 
      TempHumDia  medicion = null; 
      
     boolean error = true; 
     do { 
     System.out.println("Día:"); dia = leer.nextInt(); 
     System.out.println("Mes:");  mes = leer.nextInt(); 
     System.out.println("Año:");  año = leer.nextInt(); 

     if (fechaOK( dia,mes,año) ) { 
          System.out.println ( " Tº Máxima:"); tempmax = leer.nextInt(); 
          System.out.println ( " Tº Mínima:"); tempmin = leer.nextInt(); 
          System.out.println ( " Hº Máxima:"); hummax = leer.nextInt(); 
          System.out.println ( " Hº Mínima:"); hummin = leer.nextInt(); 
          medicion = new TempHumDia ( dia,mes,año, tempmax, tempmin, hummax, hummin); 
          error = false; 
         } 
     else 
     { 
         System.out.println(" Fecha érronea"); 
     } 
 
 } while (error); 
 
 
 return medicion; 
} 
//Getters y setters
 
 public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getAño() {
	return año;
}

public void setAño(int año) {
	this.año = año;
}

public TempHumDia[] getMediciones() {
	return mediciones;
}

public void setMediciones(TempHumDia[] mediciones) {
	this.mediciones = mediciones;
}

public int getNummediciones() {
	return nummediciones;
}

public void setNummediciones(int nummediciones) {
	this.nummediciones = nummediciones;
}
 

}
