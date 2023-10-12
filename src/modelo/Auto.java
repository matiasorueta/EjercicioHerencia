package modelo;

public class Auto extends Vehiculo {
private int cantPuertas;

public int getCantPuertas() {
	return cantPuertas;
}

public void setCantPuertas(int cantPuertas) {
	this.cantPuertas = cantPuertas;
}

public Auto(int idVehiculo, String marca, String modelo, int anio, int cantRuedas, double eficienciaMotor,
		int cantPuertas) throws Exception {
	super(idVehiculo, marca, modelo, anio, cantRuedas, eficienciaMotor);
	this.cantPuertas = cantPuertas;
}



}
