package br.com.newton.agenda;

import javax.swing.JOptionPane;

public class Telefone {
    public static void main(String[] args) {
        contato contato = new contato();

        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String Telefone = JOptionPane.showInputDialog("Digite Telefone ");

        if (Telefone.length() != 9)
            JOptionPane.showMessageDialog(null, "Numero invalido..", "ERROO",JOptionPane.ERROR_MESSAGE);

        else
        JOptionPane.showMessageDialog(null, "Nome: "+ nome +"Telefone: "+Telefone, "Contato", JOptionPane.QUESTION_MESSAGE);

        }

        }


