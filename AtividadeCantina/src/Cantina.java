public class Cantina {
    public static void main(String[] args) {
        // Criação dos ingredientes
        Ingrediente bacon = new Ingrediente("Bacon");
        Ingrediente mussarela = new Ingrediente("Mussarela");
        Ingrediente tomate = new Ingrediente("Tomate");
        Ingrediente queijo = new Ingrediente("Queijo");

        // Criação das massas
        Massa penne = new Massa("Penne", 10.0);
        Massa espaguete = new Massa("Espaguete", 12.0);
        Massa ravioli = new Massa("Ravioli", 15.0);

        // Entrada de dados
        String nomeCliente = JOptionPane.showInputDialog(null, "Informe o nome do cliente:");
        String nomeMassa = JOptionPane.showInputDialog(null, "Informe o nome da massa:");
        String valorMassaStr = JOptionPane.showInputDialog(null, "Informe o valor da massa:");

        double valorMassa = Double.parseDouble(valorMassaStr);

        // Criação do cliente e da massa escolhida
        Cliente cliente = new Cliente(nomeCliente);
        Massa massa = new Massa(nomeMassa, valorMassa);

        // Escolha dos ingredientes
        List<Ingrediente> ingredientes = new ArrayList<>();
        int opcao = 0;

        while (opcao != 5) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Informe os ingredientes escolhidos:\n1-Bacon\n2-Mussarela\n3-Tomate\n4-Queijo\n5-Sair"));

            switch (opcao) {
                case 1:
                    ingredientes
}
