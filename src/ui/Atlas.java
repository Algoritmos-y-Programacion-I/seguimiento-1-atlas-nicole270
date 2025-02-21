/*
* Analisis
* Descripcion del programa:
* Entradas: Nombre del usuario, numero de documento, edad del usuario, cuidad a la que esta cotizando el viaje
* Salidas: 
* Ejemplo:
*/

package ui;

import java.util.Scanner;

public class Atlas {

	private Scanner escaner;

    // Declaracion de constantes (completar)
    final double COSTO_TRAYECTO_AVION = 250000;
    final double COSTO_NOCHE = 150000;

	private Atlas() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{   
        // Declaracion de info a pedir del usuario (completar)
        String nombre;
        // Saludo
        System.out.println("Bienvenido al programa de viajes EVENTOS ATLAS realizado por los estudiantes de Algoritmos y programacion I de la Universidad ICESI.");
        // Pedir info al usuario (completar)
        System.out.println("Cual es tu nombre?");
        nombre = escaner.nextLine();

        
        System.out.println("Bienvenido " + nombre + "!");
        

        int edad , numerodedocumento ;
        System.out.println("Que edad tienes?");
        edad = escaner.nextInt();

        System.out.println("Porfavor escribe tu numero de documento");
        numerodedocumento = escaner.nextInt();
        escaner.nextLine();

        String ciudad;
        System.out.println("Desde que cuidad te comunicas con nosotros?");
        ciudad = escaner.nextLine(); 

        

        int noches;
        System.out.println("Bienvenido a EVENTOS ATLAS, cuantas noches deseas hospedarte?");
        noches = escaner.nextInt();

        System.out.println("Super! La vas a pasar genial. Te quedaras "+ noches + " noches en Bogota y este es el resumen de tu compra:");
        System.out.println("tu nombre es" + nombre + "!");
        System.out.println("tu edad es" + edad + "!");
        System.out.println("tu numero de documento es " + numerodedocumento + "!");

        System.out.println("Tu costo de viaje y devuelta es de: "+ calcularTotalTransporte() * calcularCostoNoche(noches));




        // Declaracion de salidas calculadas (completar)
        double totalTransporte;
        // Calculo de salidas mediante metodos (completar)
        totalTransporte = calcularTotalTransporte(); // aqui podrian faltar parametros
	}

	public static void main(String[] args) {
		Atlas mainApp = new Atlas();
		mainApp.run();
	}

    // Completar metodos para calcular salidas

    /**
	 * Descripción: El método ... permite calcular ...
	 * @param 
	 * @return 
	 */
    public double calcularTotalTransporte() {
        return COSTO_TRAYECTO_AVION*2; // Completar operacion
    }

    public double calcularCostoNoche(int noches) {
        return COSTO_NOCHE*noches; // Completar operacionS
    }

	

	
}