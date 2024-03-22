//PREGUNTA 1


package Semana01;
import java.util.Scanner;
@SuppressWarnings("unused")

public class Circulo {

	private double radio;
	private String color;
	

	public Circulo() {
		this.radio = 12.5;
		this.color = "azul";
	}

	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double getRadio()
	{
		return radio;
	}
	
	public double getArea()
	{
		return radio*radio*Math.PI;
	}
	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese el radio del círculo:");
        double radio = scanner.nextDouble();

       
        Circulo circulo = new Circulo(radio);

        
        System.out.println("Radio del círculo: " + circulo.getRadio());
        System.out.println("Área del círculo: " + circulo.getArea());

        scanner.close();
    }
}




// PREGUNTA 2
/* Podemos ejecutar esta clase porque estamos utilizando el método main. Dentro de este método, 
 estamos haciendo que el proceso de crear el círculo funcione correctamente */

