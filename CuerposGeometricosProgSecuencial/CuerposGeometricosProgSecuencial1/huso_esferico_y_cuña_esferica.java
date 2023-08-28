import java.util.Scanner;

public class huso_esferico_y_cuña_esferica {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		
		//Variables
		int numeroGrados;
		double area;
		double volumen;
		double radio;
		
		System.out.println("Ingrese el numero de grados: ");
		numeroGrados = lector.nextInt();
		System.out.println("Ingrese el radio : ");
		radio = lector.nextInt();
		
		area = (4 * Math.PI * Math.pow(radio,2) * numeroGrados)/360;
		volumen = 4/3 * (Math.PI * Math.pow(radio,3 *numeroGrados))/360;
		
		System.out.println("Hueso esferico: " + area + " unidades cuadradas ");
		
		System.out.println("Cuña esferica: " + volumen + " unidades cubicas ");
		lector.close();
		
		
	}
}