package ejercicio1;

public class CirculoTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo c1 = new Circulo(42.0);
        System.out.println("Radio: " + c1.getRadio());
        System.out.println("Área: " + c1.getArea());
        
        Circulo c2 = new Circulo(6.55);
        System.out.println("Radio: " + c2.getRadio());
        System.out.println("Área: " + c2.getArea());

	}

}
