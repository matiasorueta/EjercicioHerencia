package modelo;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Vehiculo> lstVehiculo;

	public List<Vehiculo> getLstVehiculo() {
		return lstVehiculo;
	}

	public Sistema() {
	
		this.lstVehiculo = new ArrayList<Vehiculo>();
	}

	public Vehiculo traerVehiculo(String marca,String modelo) {
		
		Vehiculo vehiculoAux=null;
		int i =0;
		
		while (vehiculoAux==null && lstVehiculo.size()>i) {
			if(lstVehiculo.get(i).equals(marca, modelo)) {
				vehiculoAux=lstVehiculo.get(i);
			}i++;
		};
	return vehiculoAux;}

	public boolean agregarAuto(String marca, String modelo, int anio, int cantRuedas, double eficienciaMotor,
			int cantPuertas) throws Exception{ 
		 if( traerVehiculo(marca,modelo) !=null ) {
			throw new Exception("La marca y el modelo es repetido, por lo tanto no es valido");
		}

		int id = 1;
		if (lstVehiculo.size()>0) {
			id=lstVehiculo.get(lstVehiculo.size()-1).getIdVehiculo() +1;
		}
		
	return (lstVehiculo.add(new Auto(id,marca,modelo,anio,cantRuedas,eficienciaMotor,cantPuertas)));}

	
	public boolean agregarMoto (String marca,String modelo,int anio,int cantRuedas,
double eficienciaMotor,boolean incluyeCaja, boolean disenioAerodinamico) throws Exception {
		if (traerVehiculo(marca,modelo)!=null) {
		throw new Exception ("La marca y el modelo es repetido, por lo tanto no es valido");
		}
		int id = 1;
		if (lstVehiculo.size()>0) {
			id=lstVehiculo.get(lstVehiculo.size()-1).getIdVehiculo()+1;
		}
		return (lstVehiculo.add(new Moto(id,marca,modelo,anio,cantRuedas,eficienciaMotor,incluyeCaja,disenioAerodinamico)));
	}
	
	
	public List<Vehiculo> traerVehiculosDeDtransporte (){
		ArrayList<Vehiculo> lstVehiculoAux = new ArrayList<Vehiculo>();
		for (int i =0;i<lstVehiculo.size();i++) {
			if(lstVehiculo.get(i)instanceof Auto) {
				lstVehiculoAux.add(lstVehiculo.get(i));
			}
			else if ( lstVehiculo.get(i)instanceof Moto) {
				Moto moto = (Moto) lstVehiculo.get(i);
				if(moto.isIncluyeCaja()) {
					lstVehiculoAux.add(lstVehiculo.get(i));
				}
			}
		}
		
		
	return lstVehiculoAux;}
	
	public List<Vehiculo> traerVehiculosPorConsumo (int km, double topeDeConsumo){
		ArrayList<Vehiculo> lstVehiculoAux = new ArrayList<Vehiculo>();
		for (int i =0;i<lstVehiculo.size();i++) {
			if (lstVehiculo.get(i).calcularConsumo(km)<topeDeConsumo) {
				lstVehiculoAux.add(lstVehiculo.get(i));
			}
		}
	
	return lstVehiculoAux;
	}

	@Override
	public String toString() {
		return "Sistema [lstVehiculo=" + lstVehiculo + "]";
	}}
	
	

