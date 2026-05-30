public class ListaDEncadeadaC {
  NodoDEC primeiro;
  int tamanho;

  public ListaDEncadeadaC() {
    this.primeiro = null;
    this.tamanho = 0;
  }

  public void adiciona(int valor) {
    if (primeiro == null) {
      primeiro = new NodoDEC(valor);

    } else {
      NodoDEC x = primeiro.getAnt();
      NodoDEC novo = new NodoDEC(valor);
      novo.setAnt(x);
      novo.setProx(primeiro);
      x.setProx(novo);
      primeiro.setAnt(novo);
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
      primeiro = new NodoDEC(valor);

    } else {
      NodoDEC x = primeiro;
      int posTemp = 1;
      while (posicao > posTemp) {
        x = x.getProx();
        posTemp++;
      }
      NodoDEC novo = new NodoDEC(valor);
      novo.setProx(x);
      novo.setAnt(x.getAnt());
      x.getAnt().setProx(novo);
      x.setAnt(novo);
    }
    this.tamanho++;
    return true;
  }

}
