package Aula15.exercicio.completar.arquivo;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Banco {


    String nome;
    double soma = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;


    }

    public void CalcularSaldo(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        double soma = 0.0;
        while (true) {
            if (linha != null) {
                String saldo[] = linha.split(",");
                for (int i = 2; i < saldo.length; i++) {
                    double valor = Double.parseDouble(saldo[2]);
                    soma += valor;


                }
            }else
                break;
            linha = buffRead.readLine();
        }
        System.out.println(soma);
    }
}

