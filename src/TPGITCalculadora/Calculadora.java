package TPGITCalculadora;
import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		 Integer a;
		 Integer b;
		 Integer opcion;
		 Integer resultado;
		 Scanner teclado=new Scanner(System.in);
		 
		 
		 do{
			 System.out.println("Ingrese su operación / 1 para sumar / 2 para restar / 3 para multiplicar / 4 para dividir");
			 opcion = teclado.nextInt();
		 } while(opcion < 1 && opcion > 4);
		 
		 System.out.println("Ingrese el primer numero");
		 a = teclado.nextInt();
		 System.out.println("Ingrese el segundo numero");
		 b = teclado.nextInt();
		 
		 if(opcion.equals(1)){
			 resultado = a + b;
			 }else if(opcion.equals(2)){
			 resultado = a - b;
			 }else if(opcion.equals(3)){
			 resultado = a * b;
			 }else{
			 resultado = a / b;
			 }
		 System.out.println("El resultado es " + resultado.toString());
	}
}
