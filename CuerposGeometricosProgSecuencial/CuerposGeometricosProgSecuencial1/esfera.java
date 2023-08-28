import java.util.Scanner;

public class esfera {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		
		//Variables
		double radio;
		double area;
		double volumen;
		
		System.out.println("Ingrese el Radio: ");
		radio = lector.nextDouble();
		
		area = (4 * Math.PI) * Math.pow(radio,2);
		volumen = (4/3 * Math.PI) * Math.pow(radio,3);
		System.out.println("Area: " + area + " unidades cuadradas.");
      System.out.println("Volumen: " + volumen + " unidades cubicas");
      lector.close();
		
	}
}