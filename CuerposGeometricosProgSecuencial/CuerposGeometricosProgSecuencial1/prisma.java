import java.util.Scanner;

public class prisma {
  public static void main(String[] args) throws Exception {
   Scanner lector = new Scanner(System.in);
   //variables//
   int cantidadLados;
   double longitudLados;
   double altura;
   double areaLateral;
   double areaTotal;
   double volumen;
   double perimetroBase; 
   double areaBase;
   double apotema;
   
      System.out.println("Cantidad de lados: ");
      cantidadLados = lector.nextInt();
      System.out.println("LontitudLados: ");
      longitudLados = lector.nextDouble();
      System.out.println("Altura");
      altura = lector.nextDouble();
      
      perimetroBase = cantidadLados * longitudLados;
      areaLateral = perimetroBase * altura;
      double alfa = (Math.PI/180) * (360/cantidadLados);
      apotema = longitudLados / (2 * Math.tan(alfa/2));
      areaBase = (perimetroBase * apotema/2);
      areaTotal = areaLateral + 2 * areaBase;
      volumen = areaBase * altura;
      System.out.println("Area Lateral: " + areaLateral + " unidades cuadradas.");
      System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
      System.out.println("Volumen: " + volumen + " unidades cubicas");
      lector.close();
      
   
  }
    
   
}
