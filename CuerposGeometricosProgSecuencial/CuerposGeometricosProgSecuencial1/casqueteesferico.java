import java.util.Scanner;

public class casqueteesferico {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		
		//Variables
		double radioMayor;
		double altura;
		double volumen;
		double area;
		
		System.out.println("Ingrese el radio mayor: ");
		radioMayor = lector.nextDouble();
		System.out.println("Ingrese la altura: ");
		altura = lector.nextDouble();
		
		area = 2 * Math.PI * radioMayor * altura;
		volumen = Math.PI * Math.pow(altura,2) * (3 * radioMayor - altura)/3;
		
		System.out.println("Area: " + area + " unidades cuadradas ");
		System.out.println("Volumen: " + volumen +  " unidades cubicas ");
		lector.close();
		
	}
}