import java.util.ArrayList;
import java.util.Scanner;

public class recursividade {

  public static void imprimirPares(int valor) {
    if (valor != 0) {
      imprimirPares(valor - 1);
      if (valor % 2 == 0) {
        System.out.println(valor);
      }

    }
  }

  public static void imprimirParesVetor(ArrayList<Integer> lista) {
    if (lista.size() >= 1) {
      if (lista.get(0) % 2 == 0) {
        System.out.println(lista.get(0));
      }
      lista.remove(0);
      imprimirParesVetor(lista);
    }
  }

  // public static int somaVetor(ArrayList<Integer> lista) {
  // if (lista.size() == 1) {
  // return lista.get(0);
  // }
  // int num = lista.get(0);
  // lista.remove(0);
  // return num + somaVetor(lista);

  // }

  public static int fatorial(int valor) {
    if (valor == 0) {
      return 1;
    }
    return fatorial(valor - 1) * valor;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nome;
    int valor;
    ArrayList<Integer> lista = new ArrayList<>();

    // System.out.println(fatorial(4));

    for (int i = 0; i < 5; i++) {
      System.out.print("Digite um número:");
      nome = sc.nextLine();
      valor = Integer.parseInt(nome);
      lista.add(valor);
    }
    sc.close();
    // System.out.println(somaVetor(lista));

    imprimirParesVetor(lista);
  }

}
