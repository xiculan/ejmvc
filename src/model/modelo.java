package model;

public class modelo {

	private int valor1 = 28;
	private int valor2 = 69;
	private int total = sumar();

	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int sumar() {
		this.total = this.valor1 + this.valor2;
		return this.total;
	}

}
