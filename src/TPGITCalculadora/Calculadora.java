package TPGITCalculadora;
import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		 Integer a;
		 Integer b;
		 Integer opcion;
		 Integer resultado=0;
		 Scanner teclado=new Scanner(System.in);
		 
		 
		 do{
			 System.out.println("Ingrese su operación / 1 para sumar / 2 para restar / 3 para multiplicar / 4 para dividir");
			 opcion = teclado.nextInt();
		 } while(opcion < 1 && opcion > 4);
		 
		 System.out.println("Ingrese el primer numero");
		 a = teclado.nextInt();
		 System.out.println("Ingrese el segundo numero");
		 b = teclado.nextInt();
		 
		 switch(opcion) {
		 case 1:
		 	resultado=a*b;
		 	break;
		 case 2:
		 	resultado= dividir(a, b);
		 	break;
		 case 3:
		 	resultado=a+b;
		 	break;
		 case 4:
		 	resultado= restar(a, b);
		 	break;
		 	
		 }
		 System.out.println("El resultado es " + resultado.toString());
	}
	public static int restar (int a, int b) {
		int resultados;
		resultados = a-b;
		return resultados;
	}
	public static int dividir (int a, int b) {
		int resultados;
		resultados = a/b;
		return resultados;
		
	}
}
