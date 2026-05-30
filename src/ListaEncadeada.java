public class ListaEncadeada {
  Nodo primeiro;
  int tamanho;

  public ListaEncadeada() {
    this.primeiro = null;
    this.tamanho = 0;
  }

  public void adiciona(int valor) {
    if (primeiro == null) {
      primeiro = new Nodo(valor);
    } else {
      Nodo x = primeiro;
      while (x.getProx() != null) {
        x = x.getProx();
      }
      Nodo novo = new Nodo(valor);
      x.setProx(novo);
    }
    this.tamanho++;
  }

  public int getTamanho() {
    return tamanho;
  }

  public boolean adiciona(int posicao, int valor) {
    if (posicao > this.tamanho + 1) {
      return false;
    }
    if (primeiro == null) {
      primeiro = new Nodo(valor);
    } else if (posicao == 1) {
      Nodo novo = new Nodo(valor);
      novo.setProx(this.primeiro);
      this.primeiro = novo;
    } else {
      Nodo x = primeiro;
      for (int i = 2; i < posicao; i++) {
        x = x.getProx();
      }
      Nodo novo = new Nodo(valor);
      novo.setProx(x.getProx());
      x.setProx(novo);
    }
    this.tamanho++;
    return true;
  }

  public Nodo get(int posicao) {
    if (posicao > this.tamanho) {
      return null;
    } else {
      Nodo x = primeiro;
      for (int i = 1; i < posicao; i++) {
        x = x.getProx();
      }
      return x;
    }
  }

  public boolean remove(int posicao) {
    if (posicao > tamanho) {
      return false;
    } else if (posicao == 1) {
      this.primeiro = this.primeiro.getProx();
    } else {
      Nodo atual = this.primeiro;
      for (int i = 2; i > posicao; i++) {
        atual = atual.getProx();
      }
      atual.setProx(atual.getProx().getProx());
    }
    tamanho--;
    return true;
  }
}
