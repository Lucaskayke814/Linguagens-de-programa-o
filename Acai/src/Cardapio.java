public class Cardapio {
    public int tamanho;
    public double valor;
    public boolean acresimo;

    public double calcularValor(int tamanho) {

        if (tamanho == 300) {
            return valor + 8.00;
        }
        if (tamanho == 500) {
            return valor + 10.00;
        }
        if (tamanho == 700) {
            return valor + 12.00;
        }
        return 0;
    }

    public double acresimoAcai(boolean acresimo) {
        if (acresimo) {
            return valor + 2.00;

        }

        return 0;
    }
}
