import java.util.Scanner;

public class ehPar2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um número:");
    String nome = sc.nextLine();
    int valor = Integer.parseInt(nome);
    boolean ehPar = false;
    for (int i = 0; i <= valor; i++) {

      ehPar = !ehPar;

    }
    if (ehPar) {
      System.out.println("é par");
    } else {
      System.out.println("é impar");
    }
    sc.close();

  }

}
