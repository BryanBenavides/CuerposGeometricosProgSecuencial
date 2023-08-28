import java.util.Scanner;

public class dodecaedro {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		
		//Varibles 
		double arista;
		double area;
		double volumen;
		
		System.out.println("Ingrese el valor de la arista: ");
		arista = lector.nextDouble();
		area = 3 * Math.pow(arista,2) * (Math.sqrt(25 + 10 * Math.sqrt(5)));
		volumen = 1/4 * (15 + 7 * Math.sqrt(5)) * Math.pow(arista,3);
		
		System.out.println(" Area: " + area + " unidades cuadradas ");
		System.out.println(" Volumen: " + volumen + " unidades cubicas ");
		lector.close();
		
	}
}