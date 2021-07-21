package Ejercicio4;

public class Raices {

	private Integer a;
	
	private Integer b;
	
	private Integer c;
	
	public Raices () {
		this.a = 4;
		this.b = 7;
		this.c = 2;
	}
	
	
	
	public Raices(Integer a, Integer b, Integer c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}



	public Integer obtenerRaices(int a , int b , int c, double discrimante) {
		double X0 = 0;
		double X1 = 0;
		X0 = (-b + Math.sqrt(discrimante))/ 2*a;
		X1 = (-b - Math.sqrt(discrimante))/ 2*a;
		System.out.println(X0);
		System.out.println(X1);
		
		return c;
		
		
	}
	public Integer obtenerRaiz(int a , int b , int c, double discrimante) {
		double X0 = 0;
		X0 = (-b + Math.sqrt(discrimante))/ 2*a;
		System.out.println(X0);
		return c;
		
	}
	
	public double getDiscrimante(int a , int b , int c) {
		double discrimante = 0;
		discrimante = (b*b) - (4*a*c);
		return discrimante;
		
		
	}
	
	public boolean tieneRaices(double discrimante) {
		boolean posi = false;
		if (discrimante < 0){
			posi = true;
		}
		return posi;
	}
	
	public boolean tieneRaiz(double discrimante) {
		boolean posi = false;
		if (discrimante == 0){
			posi = true;
		}
		return posi;
		
	}
	

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}

	public Integer getC() {
		return c;
	}

	public void setC(Integer c) {
		this.c = c;
	}
	
	
}
