public class Pizza {


    public String Nome;
    public double valor;
    public boolean possuiBorda;

    public double Calcularvalor(boolean possuiBorda) {

        if (possuiBorda) {
            return valor + 5.00;
        }
        return valor;
    }

    public String consultarNome() {
        return Nome;
    }
}
