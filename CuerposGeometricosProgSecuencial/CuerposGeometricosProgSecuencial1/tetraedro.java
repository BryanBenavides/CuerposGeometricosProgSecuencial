import java.util.Scanner;

public class tetaedro {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		
		//Variables
		double arista;
		double volumen;
		double area;
		
		System.out.println("Ingrese el valor de la arista: ");
		arista = lector.nextDouble();
		
		area = Math.pow(arista,2) * Math.sqrt(3);
		volumen = (Math.sqrt(2) * Math.pow(arista,3))/12;
		
		System.out.println("Area: " + area + " unidades cuadradas ");
		System.out.println("Volumen: " + volumen + " unidades cubicas ");
		lector.close();
		
		
		
		
	}
}