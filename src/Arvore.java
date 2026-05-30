public class Arvore {

  NoArvore raiz;

  public Arvore() {
    raiz = null;
  }

  public void adicionar(int valor) {
    NoArvore novo = new NoArvore(valor);
    if (raiz == null) {
      raiz = novo;
    } else {
      adicionar(raiz, valor);
    }
  }

  public void adicionar(NoArvore atual, int valor) {
    NoArvore novo = new NoArvore(valor);
    if (valor < atual.getValor()) {
      if (atual.getEsq() == null) {
        atual.setEsq(novo);
      } else {
        adicionar(atual.getEsq(), valor);
      }
    } else {
      if (atual.getDir() == null) {
        atual.setDir(novo);
      } else {
        adicionar(atual.getDir(), valor);
      }
    }

  }

}
