public class NoArvore {
  int valor;
  NoArvore esq;
  NoArvore dir;

  public NoArvore(int valor) {
    this.valor = valor;
    esq = null;
    dir = null;
  }

  public int getValor() {
    return valor;
  }

  public NoArvore getEsq() {
    return esq;
  }

  public void setEsq(NoArvore esq) {
    this.esq = esq;
  }

  public NoArvore getDir() {
    return dir;
  }

  public void setDir(NoArvore dir) {
    this.dir = dir;
  }
}
