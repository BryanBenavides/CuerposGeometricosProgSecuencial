import java.util.Scanner;

public class hexaedro {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		
		//Varibles 
		double arista;
		double area;
		double volumen;
		
		System.out.println("Ingrese el valor de la arista: ");
		arista = lector.nextDouble();
		
		area = 6 * Math.pow(arista,2);
		volumen = Math.pow(arista,3);
		
		System.out.println(" Area: " + area + " unidades cuadradas ");
		System.out.println(" Volumen: " + volumen + " unidades cubicas ");
		lector.close();
	
		
		
		
	}
}