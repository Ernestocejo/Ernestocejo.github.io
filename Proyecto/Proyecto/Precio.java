import java.io.*;
import java.util.*;

public class Precio {

	private float precio_compra;
	private float precio_venta;

	public Precio() {}

	public void setPrecioCompra(float precio) {
		this.precio_compra = precio;
	}
	public float getPrecioCompra() {
		return this.precio_compra;
	}
	public void setPrecioVenta(float precio) {
		this.precio_venta = precio;
	}

	public float getPrecioVenta() {
		return this.precio_venta;
	} 

	public String toString() {
		return "Compra: " +  this.precio_compra + ", " + "Venta: " + this.precio_venta;
	}

}