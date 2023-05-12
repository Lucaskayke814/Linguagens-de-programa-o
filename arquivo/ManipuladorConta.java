package Aula15.exercicio.completar.arquivo;
import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import  java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class ManipuladorConta {



    public static void leitorConta(String path) throws IOException {
        Banco b1 = new Banco();
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                String conta[] = linha.split(",");
                for (int i = 0; i < conta.length; i++)

                    System.out.println(conta[0]);


            } else
                break;
            linha = buffRead.readLine();


        }

        buffRead.close();
    }


    public static void leitorAgencia(String path) throws IOException {

        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                String agencia[] = linha.split(",");
                for (int i = 1; i < agencia.length; i++)

                    System.out.println(agencia[1]);


            } else
                break;
            linha = buffRead.readLine();


        }

        buffRead.close();
    }


    public static void leitorSaldo(String path) throws IOException {

        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                String saldo[] = linha.split(",");
                for (int i = 2; i < saldo.length; i++)

                    System.out.println(saldo[2]);


            } else
                break;
            linha = buffRead.readLine();


        }

        buffRead.close();
    }

    public void CalcularSaldo(String path) throws IOException  {
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
                System.out.println(soma);


            }  else
        break;
        linha = buffRead.readLine();




        }
    }
    public static void escritor (String path1) throws IOException{
        Banco b1 = new Banco();
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path1));
        String linha = "";
        Scanner in = new Scanner(System.in);

        linha = in.nextLine();
        buffWrite.write(b1.getNome()+" "+ b1.soma);
        buffWrite.close();

    }
}



