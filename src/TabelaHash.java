import java.util.LinkedList;

public class TabelaHash {
  private int tamanho = 10;
  private LinkedList<Aluno>[] tabela = new LinkedList[tamanho];

  private int funcaoHash(int matricula) {
    return matricula % tamanho;
  }

  public void inserir(int matricula, String nome) {
    int posicao = funcaoHash(matricula);
    Aluno novo = new Aluno(matricula, nome);
    tabela[posicao].add(novo);
  }

  public String pegarValor(int matricula) {
    int posicao = funcaoHash(matricula);
    LinkedList<Aluno> lista = tabela[posicao];

    for (int i = 0; i < lista.size(); i++) {
      Aluno atual = (Aluno) lista.get(i);
      if (matricula == atual.getMatricula()) {
        return atual.getNome();
      }
    }
    return null;
  }

}
