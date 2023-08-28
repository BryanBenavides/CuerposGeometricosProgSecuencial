import java.util.Scanner;

public class Icosaedro {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		
		//Variables 
		double arista;
		double area;
		double volumen;
		
		System.out.println("Ingrese el valor de la arista: ");
		arista = lector.nextDouble();
		
		area = 5 * Math.pow(arista,2) * Math.sqrt(3);
		volumen = 5/12 * (3 + Math.sqrt(5)) * Math.pow(arista,3);
		
		System.out.println(" Area: " + area + " unidades cuadradas ");
		System.out.println(" Volumen: " + volumen + " unidades cubicas ");
		lector.close();
		
	}
}