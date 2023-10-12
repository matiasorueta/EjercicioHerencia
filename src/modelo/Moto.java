package modelo;

public class Moto extends Vehiculo {
	
private boolean incluyeCaja;
private boolean disenioAerodinamico;

public Moto( int idVehiculo,String marca,String modelo,int anio,int cantRuedas,
double eficienciaMotor,boolean incluyeCaja, boolean disenioAerodinamico) throws Exception {
	super(idVehiculo,marca,modelo,anio,cantRuedas,eficienciaMotor);
	this.incluyeCaja = incluyeCaja;
	this.disenioAerodinamico = disenioAerodinamico;
}

public boolean isIncluyeCaja() {
	return incluyeCaja;
}

public void setIncluyeCaja(boolean incluyeCaja) {
	this.incluyeCaja = incluyeCaja;
}

public boolean isDisenioAerodinamico() {
	return disenioAerodinamico;
}

public void setDisenioAerodinamico(boolean disenioAerodinamico) {
	this.disenioAerodinamico = disenioAerodinamico;
}

public double calcularConsumo (int km) {
	//km x efmotor
	double aux = super.getEficienciaMotor();
	if (isIncluyeCaja()==true) {
		aux = super.getEficienciaMotor()-0.03;
	}
	else if (isDisenioAerodinamico()==true) {
		aux = super.getEficienciaMotor()+0.05;
	}
	return aux * km;
}; 


}
