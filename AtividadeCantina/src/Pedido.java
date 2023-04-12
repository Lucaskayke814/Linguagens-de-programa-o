public class Pedido {
    private Massa massa;
    private Cliente cliente;
    private List<Ingrediente> ingredientes;

    public Pedido(Massa massa, Cliente cliente, List<Ingrediente> ingredientes) {
        this.massa = massa;
        this.cliente = cliente;
        this.ingredientes = ingredientes;
    }

    public double calcularValor() {
        double valorTotal = massa.getValor() + ingredientes.size() * 2.0;
        return valorTotal;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido feito para " + cliente.getNome() + "\n");
        sb.append(massa.getTipo() + " com ");

        for (int i = 0; i < ingredientes.size(); i++) {
            sb.append(ingredientes.get(i).getNome());
            if (i < ingredientes.size() - 1) {
                sb.append(" e ");
            }
        }

        sb.append("\nValor: " + calcularValor() + "\n");

        return sb.toString();
    }
}

