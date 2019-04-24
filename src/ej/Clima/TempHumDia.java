package ej.Clima;

public class TempHumDia extends TempDia {
	// atributos
	private float huMaxima;

	private float huMinima;

	// ----------------------
	// constructor
	// ----------------------
	public TempHumDia(int dia, int mes, int año, float tempMaxima, float tempMinima, float huMaxima, float huMinima) {
		super(dia, mes, año, tempMaxima, tempMinima);
		this.huMaxima = huMaxima;
		this.huMinima = huMinima;
	}

	public String toString() {
		float media = media(this.huMaxima, this.huMinima);
		String mensaje = super.toString() + " La humedad máxima fue de " + this.huMaxima + " la minima fue de "
				+ this.huMinima + " Y la media de la humedad fue de " + media;
		return mensaje;
	}
	// Resto de los métodos-Getters y Setters

	// Humedad Máxima

	public float getHuMaxima() {
		return huMaxima;
	}

	public void setHuMaxima(float huMaxima) {
		this.huMaxima = huMaxima;
	}
	// Humedad minima

	public float getHuMinima() {
		return huMinima;
	}

	public void setHuMinima(float huMinima) {
		this.huMinima = huMinima;
	}

}
