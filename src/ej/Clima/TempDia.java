package ej.Clima;

public class TempDia {
//Atributos:Utilizamos el objetos fecha creado para empleados

	private int fechaMedicionDia;
	private int fechaMedicionMes;
	private int fechaMedicionAño;
	private float tempMaxima;
	private float tempMinima;

	// -----------------------------------------
	// Constructores
	// -----------------------------------------

	public TempDia() {
		this.fechaMedicionDia = 0;
		this.fechaMedicionMes = 0;
		this.fechaMedicionAño = 0;
		this.tempMaxima = 0f;
		this.tempMinima = 0f;
	}

	public TempDia(int dia, int mes, int año, float maxima, float minima) {
		this.fechaMedicionDia = dia;
		this.fechaMedicionMes = mes;
		this.fechaMedicionAño = año;
		this.tempMaxima = maxima;
		this.tempMinima = minima;
	}

	// Métodos

	// ToString
	public String toString() {
		float media = media(tempMaxima, tempMinima);
		String mensaje = "El dia " + this.fechaMedicionDia + "/" + this.fechaMedicionMes + "/" + this.fechaMedicionAño
				+ " La temperatura máxima fue de " + this.tempMaxima + " grados, la minima fue de " + this.tempMinima
				+ " dando una media de " + media + " grados. /n";
		return mensaje;
	}

	// calcular media: para temperatura y humedad, ambas
	public static float media(float valorMaximo, float valorMinimo) {
		float media = (valorMaximo + valorMinimo) / 2;
		return media;
	}

	// -------------------------------------------
	// getters y setters
	// -------------------------------------------

	// Temp máxima

	public float getTempMaxima() {
		return tempMaxima;
	}

	public void setTempMaxima(float tempMaxima) {
		this.tempMaxima = tempMaxima;
	}

	// Temp mínima

	public float getTempMinima() {
		return tempMinima;
	}

	public void setTempMinima(float tempMinima) {
		this.tempMinima = tempMinima;
	}
//Getters y setters de la fecha

	public int getFechaMedicionDia() {
		return fechaMedicionDia;
	}

	public void setFechaMedicionDia(int fechaMedicionDia) {
		this.fechaMedicionDia = fechaMedicionDia;
	}

	public int getFechaMedicionMes() {
		return fechaMedicionMes;
	}

	public void setFechaMedicionMes(int fechaMedicionMes) {
		this.fechaMedicionMes = fechaMedicionMes;
	}

	public int getFechaMedicionAño() {
		return fechaMedicionAño;
	}

	public void setFechaMedicionAño(int fechaMedicionAño) {
		this.fechaMedicionAño = fechaMedicionAño;
	}

}
