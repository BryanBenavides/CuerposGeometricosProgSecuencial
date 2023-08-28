import java.util.Scanner;
   public class piramide {
     public static void main(String[] args){
      Scanner lector = new Scanner(System.in);
      
      //variables
       int cantidadLados;
       double longitudLados;
       double altura;
       double perimetroBase;
       double areaLateral;
       double areaBase;
       double areaTotal;
       double volumen;
       double apotema;
       double apotemaP;
        
       System.out.println("Digite la cantidad de lados: ");
       cantidadLados = lector.nextInt();
       System.out.println("Digite su longitud: ");
       longitudLados = lector.nextDouble();
       System.out.println("Digite la altura: ");
       altura = lector.nextDouble();
       

       perimetroBase = cantidadLados * longitudLados;
       double alfa = (Math.PI/180) * (360/cantidadLados);
       apotema = longitudLados / (2 * Math.tan((alfa)/2));
       apotemaP = altura + apotema;
       areaLateral = perimetroBase * apotemaP / 2;
       areaBase = (perimetroBase * apotema)/2;
       areaTotal = areaLateral + areaBase;
       volumen = (areaBase * altura)/3;
       
        //Mostrar los resultados
        System.out.println("Area lateral: " + areaLateral + " unidades cuadradas.");
        System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
        System.out.println("Volumen: " + volumen + " unidades cubicas.");
        lector.close();

       
       
   }
}