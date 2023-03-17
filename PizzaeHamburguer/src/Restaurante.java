import javax.swing.JOptionPane;

public class Restaurante {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();
        Hamburguer Hamburguer1 = new Hamburguer();


        String Pedido = JOptionPane.showInputDialog(null, " Informe o pedido: \n 1: Hamburguer \n 2: Pizza \n 3: Sair", "Informe seu pedido", JOptionPane.QUESTION_MESSAGE);
        int pedido = Integer.parseInt(Pedido);
            switch (pedido) {
                 case 1:

                int Artesanal = Integer.parseInt(JOptionPane.showInputDialog(null, "1: Sim \n2: Não ", "É artesanal ? ", JOptionPane.QUESTION_MESSAGE));
                Hamburguer1.nome = JOptionPane.showInputDialog(" Digite seu nome: ");
                Hamburguer1.valorHamburguer = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));
                if (Artesanal == 1) {
                    Hamburguer1.valorHamburguer = Hamburguer1.CalcularValor(true);
                } else
                    Hamburguer1.CalcularValor(false);



                JOptionPane.showMessageDialog(null, "O pedido do cliente:"+ Hamburguer1.nome +" Ficou, R$ :" + Hamburguer1.valorHamburguer, "Teste", JOptionPane.INFORMATION_MESSAGE);
                break;

                case 2:

                    int Borda = Integer.parseInt(JOptionPane.showInputDialog(null, "1: Sim \n2: Não ", "Tem borda ? ", JOptionPane.QUESTION_MESSAGE));
                    pizza1.Nome = JOptionPane.showInputDialog(" Digite seu nome: ");
                    pizza1.valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));
                        if (Borda == 1) {
                            pizza1.valor = pizza1.Calcularvalor(true);
                }       else
                            pizza1.Calcularvalor(false);

                    JOptionPane.showMessageDialog(null, "O pedido do cliente :"+ pizza1.Nome+ "Ficou, R$" + pizza1.valor, "Pedido", JOptionPane.INFORMATION_MESSAGE);
                case 3:
                break;
        }
    }
}


