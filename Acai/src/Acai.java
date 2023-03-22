import javax.swing.JOptionPane;
public class Acai {

    public static void main(String[] args) {


        String acai = JOptionPane.showInputDialog("Tamanho \n 1 : 300\n 2: 500\n 3: 700");

        Cardapio   Acai = new Cardapio();
        int Pedido = Integer.parseInt();

        switch (Pedido){
            case 1:
            int sorvete = Integer.parseInt(JOptionPane.showInputDialog(null, "1: Sim \n2: Não \n", "Tem acresimo de sorvete? ",JOptionPane.INFORMATION_MESSAGE));
            Acai.tamanho = acai;
            if (sorvete == 1) {
                Acai.tamanho = Acai.calcularValor();
            }

            }



        }

    }



