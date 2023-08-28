import java.util.Scanner;

public class cono {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		
		
		//variables
		double radio;
		double altura;
		double areaLateral;
		double areaTotal;
		double volumen;
		double perimetroBase;
		double areaBase;
		double generatriz;
		
		System.out.println("Ingrese el radio: ");
		radio = lector.nextDouble();
		System.out.println("Ingrese la altura: ");
		altura = lector.nextDouble();
		
		
		generatriz = altura + radio;
		perimetroBase = (Math.PI * 2) * radio;
		areaLateral = (perimetroBase * generatriz)/2;
		areaBase = (Math.PI * (radio * radio));
		areaTotal = areaLateral + areaBase;
		volumen = (areaBase * altura)/3;
		
	    System.out.println("Area Lateral: " + areaLateral + " unidades cuadradas.");
      System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
      System.out.println("Volumen: " + volumen + " unidades cubicas");
      lector.close();
      
   
  }
    
   
}

