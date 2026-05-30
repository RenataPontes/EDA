import java.util.Scanner;

public class enPar3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um número:");
    String nome = sc.nextLine();
    char c = nome.charAt(nome.length() - 1);

    switch (c) {
      case '1':
        System.out.println("é ímpar");
        break;
      case '2':
        System.out.println("é par");
        break;
      case '3':
        System.out.println("é ímpar");
        break;
      case '4':
        System.out.println("é par");
        break;
      case '5':
        System.out.println("é ímpar");
        break;
      case '6':
        System.out.println("é par");
        break;
      case '7':
        System.out.println("é ímpar");
        break;
      case '8':
        System.out.println("é par");
        break;
      case '9':
        System.out.println("é ímpar");
        break;

      default:
        break;
    }
    sc.close();

  }
}
