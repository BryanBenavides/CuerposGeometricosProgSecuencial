import java.util.Scanner;

public class tronco_de_piramide {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		
		//Variables
		int cantidadLados;
		double longitudLados;
		double altura;
		double perimetroBase;
		double perimetroBaseMayor;
		double areaBase;
		double areaBaseMayor;
		double apotema;
		double areaLateral;
		double areaTotal;
		double volumen;
		double apotemaP;
		
		System.out.println("Ingrese la cantidad de lados: ");
		cantidadLados = lector.nextInt();
		System.out.println("Ingrese la longitud de los lados: ");
		longitudLados = lector.nextInt();
		System.out.println("Ingrese la altura: ");
		altura = lector.nextInt();
		
		perimetroBase = cantidadLados * longitudLados;
		perimetroBaseMayor = cantidadLados * longitudLados;
		double alfa = (Math.PI/180) * (360/cantidadLados);
       apotema = longitudLados / (2 * Math.tan((alfa)/2));
       apotemaP = altura + apotema;
      areaLateral = (perimetroBaseMayor + perimetroBase)/2 * apotemaP;
      areaBase = (perimetroBase * apotema)/2;
      areaBaseMayor = (perimetroBase * apotemaP)/2;
      areaTotal = areaLateral + areaBaseMayor + areaBase;
      volumen = 1/3 * altura * (areaBaseMayor + areaBase + Math.sqrt(areaBaseMayor * areaBase));
      
      System.out.println("Area Lateral: " + areaLateral + " unidades cuadradas.");
      System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
      System.out.println("Volumen: " + volumen + " unidades cubicas");
      lector.close();
      
      
      
		
		
	}
}