package pe.lib.libreria;

import java.util.Date;

public class DetalleVenta {

	private int idVenta;
	private int idDetVenta;
	private int idLibro;
	private int cantidad;
	private double monto;
	
	public DetalleVenta(int idVenta, int idDetVenta, int idLibro, int cantidad, double monto) {
		super();
		this.idVenta = idVenta;
		this.idDetVenta = idDetVenta;
		this.idLibro = idLibro;
		this.cantidad = cantidad;
		this.monto = monto;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public int getIdDetVenta() {
		return idDetVenta;
	}

	public void setIdDetVenta(int idDetVenta) {
		this.idDetVenta = idDetVenta;
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
}
