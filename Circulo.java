package ejercicio1;

public class Circulo {
	//variables privadas
	private double radio;
    private String color;
    
    public Circulo() {
        this.radio = 12.5;
        this.color = "azul";}
    
    // sobrecargado
    public Circulo(double radio) {
        this.radio = radio;}
    
    //metod para radio
    public double getRadio() {
        return radio;}
        
    //metod para area
    public double getArea() {
    	return radio * radio * Math.PI;}

}
