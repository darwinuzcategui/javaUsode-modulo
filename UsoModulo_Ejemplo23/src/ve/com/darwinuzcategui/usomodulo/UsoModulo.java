package ve.com.darwinuzcategui.usomodulo;

import ve.com.darwinuzcategui.producto.*;

public class UsoModulo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double montoDescuento;
		Producto miProducto = new Producto();
		
		miProducto.setPrecio(15000);
		
		montoDescuento = miProducto.getPrecio()-miProducto.getDescuento(); 
		System.out.println("Tiene un Precio   : "+miProducto.getPrecio());
		System.out.println("Descuento de 25%  : "+montoDescuento);
		System.out.println("Total precio venta: "+miProducto.getDescuento());
		

	}

}
