package entities;

public class Triangulo {

	public double primeiroLado;
	public double segundoLado;
	public double terceiroLado;
	
	public double area() {
		double resultado = (primeiroLado + segundoLado + terceiroLado) / 2.0;
		return Math.sqrt(resultado * (resultado - primeiroLado) * (resultado - segundoLado) * (resultado * terceiroLado));
	}
}
