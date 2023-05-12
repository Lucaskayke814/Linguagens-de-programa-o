package Aula15.exercicio.completar.arquivo;

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Banco b1 = new Banco();
        String nomeCliente = JOptionPane.showInputDialog("Escreva o nome do cliente ");
        b1.setNome(nomeCliente);
        String path ="C:/Users/12117468/Desktop/teste/Contas.txt";
        String path1 ="C:/Users/12117468/Desktop/teste/ContaseNome.txt";
        ManipuladorConta.leitorConta(path);
        b1.setNome(nomeCliente);
        b1.CalcularSaldo(path);
        ManipuladorConta.escritor(path1);


    }
}
