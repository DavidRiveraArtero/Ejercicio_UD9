package Ejercicio1;

public class Television extends Electrodomesticos {

	private Integer Resolucion;
	
	private boolean Tdt;
	
	public Television () {
		this.Resolucion = 20;
		this.Tdt = false;
		
	}
	public Television (Integer precio, String color, String consumo, Integer peso, Integer resolucion, boolean tdt) {
		super(precio, color, consumo, peso);
		this.Resolucion=resolucion;
		this.Tdt=tdt;
	}
	public Integer getResolucion() {
		return Resolucion;
	}
	public void setResolucion(Integer resolucion) {
		Resolucion = resolucion;
	}
	public boolean isTdt() {
		return Tdt;
	}
	public void setTdt(boolean tdt) {
		Tdt = tdt;
	}
	
	public Integer precioFinal(int resolucion, boolean tdt, int precio) {
		
		if (resolucion > 40) {
			precio = (precio * 30) / 100;
			if (tdt = false) {
				precio = precio + 0;
				return precio;
			}else {
				precio = precio + 50;
				return precio;
			}
		}else {
			precio = precio + 0;
			if (tdt = false) {
				precio = precio + 0;
				return precio;
			}else {
				precio = precio + 50;
				return precio;
			}
	
		}
		
		
		
	}
	@Override
	public String toString() {
		return "Television [Resolucion=" + Resolucion + ", Tdt=" + Tdt + ", Precio=" + Precio + ", Color=" + Color
				+ ", Consumo=" + Consumo + ", Peso=" + Peso + "]";
	}
	
}
