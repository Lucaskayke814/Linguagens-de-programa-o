public class Hamburguer {

    public String nome;
    public double valorHamburguer;
    public boolean artersanal;

    public double CalcularValor(boolean artesanal){
        if (artesanal){
            return valorHamburguer + 8.00;
        }
        return valorHamburguer;
    }


}
