package App;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x;
		x = new Triangulo();
		// y = new Triangulo();
		
		System.out.println("Digite o valor do primeiro lado");
		x.primeiroLado = sc.nextDouble();
		
		System.out.println("Digite o valor do segundo lado");
		x.segundoLado = sc.nextDouble();
		
		System.out.println("Digite o valor do terceiro lado");
		x.terceiroLado = sc.nextDouble();
		sc.close();
		
		double areax = x.area();
		System.out.println("A area do triângulo é: " + areax);
	}

}
