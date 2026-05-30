public class Nodo {
  private Nodo prox;
  private int valor;

  public Nodo(int valor) {
    prox = null;
    this.valor = valor;
  }

  public void setProx(Nodo prox) {
    this.prox = prox;
  }

  public Nodo getProx() {
    return prox;
  }

  public void setValor(int valor) {
    this.valor = valor;
  }

  public int getValor() {
    return valor;
  }

}
