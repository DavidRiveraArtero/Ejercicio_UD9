package Ejercicio1;

public class Electrodomesticos {

	// ATRIVUTOS

	// ATRIVUTO PRECIO
	protected Integer Precio;

	// ATRIVUTO COLOR
	protected String Color;

	// ATRIVUTO CONSUMO
	protected String Consumo;

	// ATRIVUTO PESO
	protected Integer Peso;

	public Electrodomesticos() {
		this.Precio = 100;
		this.Peso = 5;
		this.Color = "Blanco";
		this.Consumo = "A";

	}

	public Electrodomesticos(Integer precio, String color, String consumo, Integer peso) {
		this.Color = comprobarColor(color);
		this.Consumo = comprobarConsumoEnergetico(consumo);
		this.Peso = peso;
		this.Precio = precioFinal(precio);
	}

	public String comprobarConsumoEnergetico(String Consumo) {
		switch (Consumo) {
		case ("A"):
			return Consumo;

		case ("B"):
			return Consumo;

		case ("C"):
			return Consumo;

		case ("D"):
			return Consumo;

		case ("E"):
			return Consumo;

		case ("F"):
			return Consumo;

		default:
			Consumo = "F";
			return Consumo;

		}

	}

	public String comprobarColor(String Color) {
		switch (Color.toUpperCase()) {
		case ("BLANCO"):
			return Color;
		case ("NEGRO"):
			return Color;
		case ("ROJO"):
			return Color;
		case ("AZUL"):
			return Color;
		case ("GRIS"):
			return Color;
		default:
			Color = "BLANCO";

		}
		return Color;

	}

	public Integer precioFinal(Integer Precio) {
		if (this.Consumo == "A") {
			Precio +=  100;
		} else if (this.Consumo == "B") {
			Precio += 80;
		} else if (this.Consumo == "C") {
			Precio += 60;
		} else if (this.Consumo == "D") {
			Precio += 50;
		} else if (this.Consumo == "E") {
			Precio += 30;
		} else if (this.Consumo == "F") {
			Precio += 10;
		} else {
			Precio += 10;
		}

		switch (this.Peso) {
		case (19):
			Precio = Precio + 10;
			return Precio;

		case (49):
			Precio = Precio + 50;
			return Precio;

		case (79):
			Precio = Precio + 80;
			return Precio;

		case (80):
			Precio = Precio + 100;
			return Precio;
		default:
			Precio = Precio + 50;

		}

		return Precio;

	}

	public void mostrarDatos() {
		System.out.print(Precio);
	}

	public Integer getPrecio() {
		return Precio;
	}

	public void setPrecio(Integer precio) {
		Precio = precio;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		this.Color = color;
	}

	public String getConsumo() {
		return Consumo;
	}

	public void setConsumo(String consumo) {
		Consumo = consumo;
	}

	public Integer getPeso() {
		return Peso;
	}

	public void setPeso(Integer peso) {
		Peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomesticos [Precio=" + Precio + ", Color=" + Color + ", Consumo=" + Consumo + ", Peso=" + Peso
				+ "]";
	}

}
