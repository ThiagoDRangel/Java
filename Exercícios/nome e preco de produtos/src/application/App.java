package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o total de produtos:");
    int n = sc.nextInt();
    Product[] vect = new Product[n];

    for(int i = 1; i < vect.length; i+=1) {
      sc.nextLine();
      String name = sc.nextLine();
      double price = sc.nextDouble();
      vect[i] = new Product(name, price);
    }

    double sum = 0.0;
    for(int i = 1; i < vect.length; i+=1) {
      sum += vect[i].getPrice();
    }

    double avg = sum / vect.length;

    System.out.printf("AVERAGE PRICE = %.2f%n", avg);

    sc.close();
  }
}