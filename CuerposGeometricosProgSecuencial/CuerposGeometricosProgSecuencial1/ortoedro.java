import java.util.Scanner;

public class ortoedro {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		
		//Variables
		double largo;
		double altura;
		double ancho;
		double area;
		double volumen;
		double diagonal;
		
		System.out.println("Ingrese el largo del ortoedro");
		largo = lector.nextDouble();
		System.out.println("Ingrese la altura del ortoedro");
		altura = lector.nextDouble();
		System.out.println("Ingrese el ancho del ortoedro");
		ancho = lector.nextDouble();
		
		area = 2 * (largo * ancho + largo * altura + ancho * altura);
		volumen = (largo * ancho * largo);
		diagonal = Math.sqrt(Math.pow(largo,2) +Math.pow(ancho,2) + Math.pow(altura,2));
		
		System.out.println("Area: " + area + " unidades cuadradas.");
      System.out.println("volumen: " + volumen + " unidades cubicas.");
      System.out.println("diagonal " + diagonal + " unidades cuadradas");
      lector.close();
		
		
		
	}
}