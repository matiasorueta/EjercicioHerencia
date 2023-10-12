package test;

import modelo.Sistema;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Moto zanella= new Moto(1, "zanella", "400", 2015, 2, 0.4, false, true);
		Moto zanella2= new Moto(1, "zanella", "450", 2015, 2, 0.4, false, true);
		System.out.println(zanella.calcularAntiguedad());
		System.out.println(zanella.calcularConsumo(24));
		System.out.println(zanella.equals(zanella2));
		System.out.println();*/
		
		Sistema sistema1 = new Sistema();
		try {
		sistema1.agregarAuto("Dodge", "Viper", 2003, 4, 0.9, 2);
		sistema1.agregarAuto("Ford", "Mustang", 2002, 4, 0.7, 4);
		sistema1.agregarAuto("Fiat", "600", 1997, 4, 0.8, 2);
		sistema1.agregarMoto( "zanella", "450", 2015, 2, 0.4, false, true);
		sistema1.agregarMoto( "zanella", "400", 2015, 2, 0.4, true, true);
		sistema1.agregarMoto( "zanella", "600", 2015, 2, 0.7, false, false);
		
		}
		catch (Exception e ) {
			System.out.println(e.getMessage());
		}
		System.out.println(sistema1.traerVehiculosDeDtransporte());
		
		System.out.println(sistema1.traerVehiculosPorConsumo(100, 60));
		
	}

}
