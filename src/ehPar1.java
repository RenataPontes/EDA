import java.util.Scanner;

public class ehPar1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um número:");
    String nome = sc.nextLine();
    int valor = Integer.parseInt(nome);

    if (valor % 2 == 0) {
      System.out.println("é par");
    } else {
      System.out.println("é ímpar");
    }

    sc.close();

  }
}
