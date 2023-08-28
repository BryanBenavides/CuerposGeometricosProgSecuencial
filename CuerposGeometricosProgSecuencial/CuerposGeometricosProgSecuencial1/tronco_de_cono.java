import java.util.Scanner;

public class tronco_de_cono {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		
		//Variables
		double radio;
		double radioMayor;
		double altura;
		double generatriz;
		double areaLateral;
		double areaTotal;
		double volumen;
		double areaBaseMayor;
		double areaBase;
		
		System.out.println("Ingresar el radio: ");
		radio = lector.nextDouble();
		System.out.println("Ingresar el radioMayor ");
		radioMayor = lector.nextDouble();
		System.out.println("altura");
		altura = lector.nextDouble();
		
		generatriz = altura + radio;
		areaLateral = Math.PI * generatriz * (radioMayor * radio);
		areaBaseMayor = Math.pow(radioMayor,2) *Math.PI;
		areaBase = Math.PI * Math.pow(radio,2);
		areaTotal = areaLateral  + areaBaseMayor + areaBase;
		volumen = 1/3 * Math.PI * altura *Math.pow(radioMayor,2) + Math.pow(radio,2) + radioMayor + radio;
		
		
		System.out.println("Area Lateral " + areaLateral + " unidades cuadradas ");
		System.out.println("Area Total " + areaTotal + " unidades cuadradas ");
		System.out.println(" Volumen: " + volumen + " unidades cubicas ");
		lector.close();
		
		
	}
}