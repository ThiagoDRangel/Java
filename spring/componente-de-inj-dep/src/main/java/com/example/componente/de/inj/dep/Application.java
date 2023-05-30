package com.example.componente.de.inj.dep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;
import services.OrderService;


@SpringBootApplication
@ComponentScan({"com.example.componente.de.inj.dep"})
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		OrderService product;
		product = new OrderService();

		System.out.print("Digite o código do produto: ");
		int codigo = sc.nextInt();

		System.out.print("Digite o valor do produto: ");
		String valorEntrada = sc.next();
		String format = valorEntrada.replace(",", ".");
		product.valor = Double.parseDouble(format);

		System.out.print(("Digite a porcentagem de desconto: "));
		product.percentage = sc.nextDouble();

		double result = product.percentValue(product.valor, product.percentage);
		double frete = product.calculateShipping(product.valor);
		double total = result + frete;

		System.out.println("Pedido código: " + codigo);
		System.out.printf("Valor total: R$ %.2f\n", total);
	}

}
