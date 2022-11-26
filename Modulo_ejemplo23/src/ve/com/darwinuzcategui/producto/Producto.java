package ve.com.darwinuzcategui.producto;

import ve.com.descuento.*;

public class Producto {
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double getDescuento() {
		
		return Descuento.calcularDescuento(this.precio);
		
	}

	private int codigo;
	
	private String nombre;
	
	private double precio;
	
	
	

}
