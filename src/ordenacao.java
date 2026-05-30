import java.util.Scanner;

public class ordenacao {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nome;
    int valor;
    int[] lista = new int[10];
    System.out.println("Digite 10 valores inteiros!");
    for (int i = 0; i < 10; i++) {
      System.out.print("Digite um número:");
      nome = sc.nextLine();
      valor = Integer.parseInt(nome);
      lista[i] = valor;
    }
    int aux;
    for (int j = 1; j < 10; j++) {
      for (int k = j; k > 0; k--) {
        if (lista[k] < lista[k - 1]) {
          aux = lista[k];
          lista[k] = lista[k - 1];
          lista[k - 1] = aux;
        }

      }

    }
    for (int numero : lista) {
      System.out.println(numero);
    }
    sc.close();
  }
}
