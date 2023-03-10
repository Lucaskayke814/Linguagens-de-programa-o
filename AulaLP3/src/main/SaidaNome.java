package main;

import javax.swing.JOptionPane;

public class SaidaNome {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String sobreNome = JOptionPane.showInputDialog("Digite o sbrenome");


        JOptionPane.showMessageDialog(null, "Nome Completo" + nome + "Sobrenome"+ sobreNome ,
                "teste", JOptionPane.QUESTION_MESSAGE);
    }
}
