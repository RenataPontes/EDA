import java.util.Scanner;

public class acharValorVetor {
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

    int menor = lista[0];
    for (int j = 1; j < 10; j++) {
      if (lista[j] < menor) {
        menor = lista[j];
      }
    }
    System.out.println("o menor valor é: " + menor);
    sc.close();
  }

}
