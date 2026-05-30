public class NodoDEC {
  private NodoDEC prox;
  private NodoDEC ant;
  private int valor;

  public NodoDEC(int valor) {
    prox = this;
    ant = this;
    this.valor = valor;
  }

  public void setProx(NodoDEC prox) {
    this.prox = prox;
  }

  public NodoDEC getProx() {
    return prox;
  }

  public void setAnt(NodoDEC ant) {
    this.ant = ant;
  }

  public NodoDEC getAnt() {
    return ant;
  }

  public void setValor(int valor) {
    this.valor = valor;
  }

  public int getValor() {
    return valor;
  }

}
