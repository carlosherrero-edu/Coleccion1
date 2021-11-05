package coleccion1;

public class Col01_Ej14{
	public static void main (String[] args){
		// empezamos por declarar las variables necesarias
		int a = 3, b = 6, c;
		c = a / b;
		System.out.println( "El valor de c es: " + c);
		c = a % b;
		System.out.println( "El valor de c es: " + c);
		a++;
		System.out.println( "El valor de a es: " + a);
		++a;
		System.out.println( "El valor de a es: " + a);
		c = ++a + b++;
		System.out.println( "El valor de a es: " + a);
		System.out.println( "El valor de b es: " + b);
		System.out.println( "El valor de c es: " + c);
		c = ++a + ++b;
		System.out.println( "El valor de a es: " + a);
		System.out.println( "El valor de b es: " + b);
		System.out.println( "El valor de c es: " + c);
	}  // fin del main
}