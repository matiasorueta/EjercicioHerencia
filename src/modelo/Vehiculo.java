package modelo;

import java.time.LocalDate;

public class Vehiculo {
	protected int idVehiculo;
	protected String marca;
	protected String modelo;
	protected int anio;
	protected int cantRuedas;
	protected double eficienciaMotor;
	
	public Vehiculo(int idVehiculo, String marca, String modelo, int anio, int cantRuedas, double eficienciaMotor) throws Exception {
		super();
		this.idVehiculo = idVehiculo;
		//this.marca = marca;
		setMarca(marca);
		//this.modelo = modelo;
		setModelo(modelo);
		//this.anio = anio;
		setAnio(anio);
		//this.cantRuedas = cantRuedas;
		setCantRuedas(cantRuedas);
		this.eficienciaMotor = eficienciaMotor;
	}
	
	public int getIdVehiculo() {
		return idVehiculo;
	}
	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) throws Exception{
		if (marca=="") 
			throw new Exception ("La marca es nula");
		else {
		this.marca = marca;}
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) throws Exception {
		if (modelo=="") {
			throw new Exception("El modelo no puede ser nulo");}
		else {
		this.modelo = modelo;}
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) throws Exception {
		if(anio<1886) {
			throw new Exception("El primer auto fue en 1886");
		}else {
		this.anio = anio;}
	}
	public int getCantRuedas() {
		return cantRuedas;
	}
	public void setCantRuedas(int cantRuedas) throws Exception {
		if (cantRuedas<2) {
			throw new Exception("Un vehiculo tiene que tener mas de 1 rueda");
		}else {
		this.cantRuedas = cantRuedas;}
	}
	public double getEficienciaMotor() {
		return eficienciaMotor;
	}
	public void setEficienciaMotor(double eficienciaMotor) throws Exception {
		if (eficienciaMotor<0.1 || eficienciaMotor>0.9 ) {
			throw new Exception("La eficiencia del motor tiene que ser entre 0.1 y 0.9");
		}else {
		this.eficienciaMotor = eficienciaMotor;}
	}
	
	//METODOS
	public int calcularAntiguedad () {
		return (LocalDate.now().getYear()-anio);}
	
	public double calcularConsumo (int km) {
		//km x efmotor
		
		return (km * eficienciaMotor);
	}
	
	public boolean equals(String marca, String modelo) {
		return((marca.equals(this.marca))&&(modelo.equals(this.modelo))) ;
	}; 
	

	@Override
	public String toString() {
		return "Vehiculo [idVehiculo=" + idVehiculo + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio
				+ ", cantRuedas=" + cantRuedas + ", eficienciaMotor=" + eficienciaMotor + "]";
	}
	}
	

