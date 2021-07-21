package Ejercicio1;

public class Lavadora extends Electrodomesticos {
	
	//ATRIBUTOS 
	private Integer Carga;
	
	//Constructor
	public Lavadora() {
		this.Carga = 5;
		
	}
	
	
	//Constructor
	public Lavadora(Integer precio, String color, String consumo, Integer peso, Integer carga) {
		super(precio, color, consumo, peso);
		
		this.Carga=carga;
		
			
	}
	
	public Integer precioFinal() {
		if (Carga > 30) {
			
			this.Precio += 50;
			return Precio;
		}else {
			Precio += 50;
			return Precio;
		}
		
	
	}

	public Integer getCarga() {
		return Carga;
	}

	public void setCarga(Integer carga) {
		Carga = carga;
	}

	@Override
	public String toString() {
		return "Lavadora [Carga=" + Carga + ", Precio=" + Precio + ", Color=" + Color + ", Consumo=" + Consumo
				+ ", Peso=" + Peso + "]";
	}
	
	
	
}
