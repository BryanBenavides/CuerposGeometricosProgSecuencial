import java.util.Scanner;

public class zonaesferica {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		
		//Variables
		double radio;
		double radioMenor;
		double radioMayor;
		double area;
		double volumen;
		double altura;
		
		System.out.println("Ingrese el Radio: ");
		radio = lector.nextDouble();
		System.out.println("Ingrese el Radio Mayor: ");
		radioMayor = lector.nextDouble();
		System.out.println("Ingrese el Radio Menor: ");
		radioMenor = lector.nextDouble();
		System.out.println("Ingrese la Altura: ");
		altura = lector.nextDouble();
		
		area = (2 * Math.PI) * radioMayor * altura;
		volumen = Math.PI * altura * (Math.pow(altura,2) + 3 * Math.pow(radio,2) + 3* Math.pow(radioMenor,2))/6;
		
		  System.out.println("Area: " + area + " unidades cuadradas.");
      System.out.println("Volumen: " + volumen + " unidades cubicas");
      lector.close();
		
		
		
	}
}