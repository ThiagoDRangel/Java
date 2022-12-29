package application;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    System.out.println("Digite o tamanho da matrix: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] mat = new int [n][n];
    for (int l = 0; l < mat.length; l+=1) {
      for (int c = 0; c < mat[l].length; c+=1) {
        mat[l][c] = sc.nextInt();
      }
    }
    System.out.println("Main Diogonal: ");
    for(int l = 0; l < mat.length; l+=1) {
      System.out.print(mat[l][l] + " ");
    }
    System.out.println();

    int count = 0;
    for (int l = 0; l < mat.length; l+=1) {
      for(int c = 0; c < mat[l].length; c+=1) {
        if (mat[l][c] < 0) {
          count+=1;
        }
      }
    }
    System.out.println("Negative numbers = " + count);
    sc.close();
  }
}