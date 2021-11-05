package coleccion1;

public class Col01_Ej07 {

  	public static void main(String[] args) {
  		double cantidad = 3000;
  		int meses = 6;
  		double porcentajeInteresAnual = 1.25;
  		double porcentajeRetencionHacienda = 18;
  		double cantidadObtenida;
  		double total;
  		System.out.println("Cantidad a depositar: " + cantidad);
  		System.out.println("Meses del depósito: " + meses);
  		System.out.println("Interés anual: " + porcentajeInteresAnual);
  		System.out.println("Retención de Hacienda: " + porcentajeRetencionHacienda);
  		cantidadObtenida = cantidad *((porcentajeInteresAnual/100)*meses/12)*(1-porcentajeRetencionHacienda/100);
  		total = cantidad + cantidadObtenida;
  		System.out.println("Cantida obtenida: " + cantidadObtenida);
  		System.out.println("Cantida total: " + total);
  	}
}