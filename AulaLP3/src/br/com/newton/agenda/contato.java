package br.com.newton.agenda;

public class contato {

    private String nome;
    private String numero;

    public String getNome() {
        return nome;
    }

    public void excluir(contato contato ){
        System.out.println("Excluindo o contato.");
    }
    public void incluir(contato contato ){
        System.out.println("Inclindo contato."+ contato.nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
