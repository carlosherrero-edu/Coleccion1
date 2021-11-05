package coleccion1;

public class Col01_Ej05 {

  	public static void main(String[] args) {
    		double precio = 120;
  		double porcentajeDescuento = 15;
  		System.out.println("Precio original de las deportivas: " + precio);
  		System.out.println("Descuento a aplicar: " + porcentajeDescuento + "%");
  		System.out.println("Precio con descuento de las deportivas: " + (precio*(1-porcentajeDescuento/100)));
	}
}