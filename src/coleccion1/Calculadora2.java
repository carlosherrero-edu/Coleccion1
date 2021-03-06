
package  coleccion1;

import java.util.Scanner;
 
 //comentario Javadoc de la clase
 
 /** Clase SumarNumeros que solicita dos números  por teclado y calcula su suma, diferencia, 
 *		producto , cociente y cociente entero
 *		además realiza el control de errores de división entre cero y formato incorrecto
 * @author   Carlos Herrero
 * @version 1.0
 */


public class Calculadora2{
	
	
	 public static void main ( String [] args) {

	  Scanner teclado= new Scanner(System.in);  //abrimos una conexión con el teclado
		
	  double numero1;
	  double numero2;
	  double suma, diferencia;
	  double producto, cociente;
	  long cociente_entero;

	  //petición de los dos números
	  System.out.print(" * Introduce el primer número :  ");
	  numero1= teclado. nextDouble();
	  System.out.print("\n * Introduce el segundo número :  ");
	  numero2= teclado. nextDouble();

	  //realizamos las operaciones aritméticas
	  suma = numero1 + numero2;
	  diferencia = numero1 - numero2;
	  producto = numero1 * numero2;
	  cociente = numero1 / numero2;
	  cociente_entero= (long)cociente;   //hacemos la conversión forzada 


	  //mostramos la información por pantalla
	  System.out.format("%n La suma de %.4f y de %.4f es igual a:  %.4f", numero1, numero2, suma);
	  System.out.format("%n La diferencia de %.4f y de %.4f es igual a:  %.4f", numero1, numero2, diferencia);
	  System.out.format("%n El producto de %.4f y de %.4f es igual a:  %.4f", numero1, numero2, producto);
	  System.out.format("%n El cociente de %.4f y de %.4f es igual a:  %.4f %n", numero1, numero2, cociente);
	  System.out.format("%n El cociente entero  de %.4f y de %.4f es igual a:  %d %n", numero1, numero2, cociente_entero);

	  teclado.close();  //liberamos la conexión al teclado

	  
	} // fin del método main
	
	
	
}  // fin de la clase principal

