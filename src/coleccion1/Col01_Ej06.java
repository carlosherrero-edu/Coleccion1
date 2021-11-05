package coleccion1;

public class Col01_Ej06 {

  	public static void main(String[] args) {
  		System.out.println("Cantidad a depositar: 3000");
  		System.out.println("Meses del depósito: 6");
  		System.out.println("Interés anual: 1.25%");
  		System.out.println("Retención de Hacienda: 18%");
  		System.out.println("Cantidad obtenida: " + ((3000*((1.25/100)*6/12)*(1.0-18.0/100))));
  		System.out.println("Cantidad total: " + (3000 + (3000*((1.25/100)*6/12)*(1.0-18.0/100))));
  		// Atención: Si se escribe 18/100, el resultado queda 0 porque se asume que la operación es con enteros
  		// Debe escribirse por ello 18.0/100   ó 18.0/100.0 para que Java "se dé cuenta" de que queremos operar con números flotantes
  		// (cantidad *((porcentajeInteresAnual/100)*meses/12)*(1-porcentajeRetencionHacienda/100));
  	}
}