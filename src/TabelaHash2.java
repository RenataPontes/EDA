public class TabelaHash2 {
  private int tamanho = 7;
  private Aluno[] tabela = new Aluno[tamanho];

  private int funcaoHash(int matricula) {
    return matricula % tamanho;
  }

  public void inserir(int matricula, String nome) {
    int posicao = funcaoHash(matricula);
    Aluno novo = new Aluno(matricula, nome);
    while (tabela[posicao] != null && posicao < tamanho) {
      posicao++;
    }
    if (tabela[posicao] == null) {
      tabela[posicao] = novo;
    } else {

    }
  }

  public static void main(String[] args) {
    TabelaHash2 tabela = new TabelaHash2();
    tabela.inserir(2456, "renata");
  }
}
