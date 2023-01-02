import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      System.out.println("Digite todos os nomes separados por espaço");
      Scanner sc = new Scanner(System.in);

      try {
        String[] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();
        System.out.println("Digite a posição no array a ser consultado");
        System.out.println(vect[position]);
      }
      catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Invalid Position");
      }
      catch (InputMismatchException e) {
        System.out.println("Input Error");
      }

      System.out.println("Continue Program...");

      sc.close();
    }
}
