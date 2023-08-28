import java.util.Scanner;

public class cilindro {
  public static void main(String[] args) throws Exception {
    Scanner lector = new Scanner(System.in);
    
    //Variables
   double radio;
   double altura;
   double areaLateral;
   double areaTotal;
   double volumen;
   double perimetroBase; 
   double areaBase;
   
   //variables
      System.out.println("radio: ");
      radio = lector.nextInt();
      System.out.println("Altura: ");
      altura = lector.nextDouble();
      
      
      perimetroBase = (Math.PI*2) * radio;
      areaLateral = perimetroBase * altura;
      areaBase = (Math.PI * Math.pow(radio,2));
      areaTotal = areaLateral + areaBase;
      volumen = areaBase * altura;
      
      System.out.println("Area Lateral: " + areaLateral + " unidades cuadradas.");
      System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
      System.out.println("Volumen: " + volumen + " unidades cubicas");
      lector.close();

      
  }
}
