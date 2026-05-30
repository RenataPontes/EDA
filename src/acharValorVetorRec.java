import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class acharValorVetorRec {

  public static int menorVetor(List<Integer> lista) {
    if (lista.size() == 1) {
      return lista.get(0);
    } else if (menorVetor(lista.subList(0, lista.size() / 2)) < menorVetor(
        lista.subList(lista.size() / 2, lista.size()))) {
      return menorVetor(lista.subList(0, lista.size() / 2));
    }
    return menorVetor(lista.subList(lista.size() / 2, lista.size()));

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nome;
    int valor;
    List<Integer> lista = new ArrayList<>();

    System.out.println("Digite 10 valores inteiros!");
    for (int i = 0; i < 10; i++) {
      System.out.print("Digite um número:");
      nome = sc.nextLine();
      valor = Integer.parseInt(nome);
      lista.add(valor);
    }
    System.out.println("o menor valor é: " + menorVetor(lista));
    sc.close();
  }

}
