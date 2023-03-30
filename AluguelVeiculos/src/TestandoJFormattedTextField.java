import java.awt.Container;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;

public class TestandoJFormattedTextField extends JFrame {

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        TestandoJFormattedTextField field = new TestandoJFormattedTextField();
        field.testaJFormattedTextField();
    }
    private void testaJFormattedTextField() {
        Container janela = getContentPane();
        setLayout(null);

        //Define os rótulos dos botões
        JLabel labelAluguel = new JLabel("Aluguel de veiculos: ");
        JLabel labelNome = new JLabel("Nome : ");
        JLabel labelCpf = new JLabel("CPF: ");
        JLabel labelTel = new JLabel("Telefone: ");
        JLabel labelDados = new JLabel("Dados do cliente");
        JLabel labelNomeCliente = new JLabel("Nome do carro: ");
        JLabel labelPlaca = new JLabel("Placa do carro: ");
        JLabel labelAno = new JLabel("Ano: ");
        JLabel labelDataLocacao = new JLabel("Data de Locação: ");
        JLabel labelDataEntrega = new JLabel("Data de entrega : ");


        labelAluguel.setBounds(50,40,150,40);
        labelNome.setBounds(50,80,100,20);
        labelCpf.setBounds(50,120,100,20);
        labelTel.setBounds(50,160,100,20);
        labelDados.setBounds(50,200,150,20);
        labelNomeCliente.setBounds(50,240,150,20);
        labelPlaca.setBounds(50,280,150,20);
        labelAno.setBounds(50,320,150,20);
        labelDataLocacao.setBounds(50,360,150,20);
        labelDataEntrega.setBounds(50,400,150,20);


        //Define as máscaras
        MaskFormatter mascaraNome= null;
        MaskFormatter mascaraTel = null;
        MaskFormatter mascaraCpf = null;
        MaskFormatter mascaraData = null;
        MaskFormatter mascaraPlaca = null;
        try{

            mascaraTel = new MaskFormatter("(##)####-####");
            mascaraCpf = new MaskFormatter("#########-##");
            mascaraData = new MaskFormatter("##/##/####");
            mascaraPlaca = new MaskFormatter("UUU-####");

            mascaraTel.setPlaceholderCharacter('_');
            mascaraCpf.setPlaceholderCharacter('_');
            mascaraData.setPlaceholderCharacter('_');
            mascaraPlaca.setPlaceholderCharacter('_');
        }
        catch(ParseException excp) {
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
        }

        //Seta as máscaras nos objetos JFormattedTextField
        JFormattedTextField jFormattedTextAluguel = new JFormattedTextField(mascaraNome);
        JFormattedTextField jFormattedTextTel = new JFormattedTextField(mascaraTel);
        JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraCpf);
        JFormattedTextField jFormattedTextNomeCarro = new JFormattedTextField(mascaraNome);
        JFormattedTextField jFormattedTextPlacaCarro = new JFormattedTextField(mascaraPlaca);
        JFormattedTextField jFormattedTextAno = new JFormattedTextField(mascaraNome);
        JFormattedTextField jFormattedTextDataLocacao = new JFormattedTextField(mascaraData);
        JFormattedTextField jFormattedTextDataEntrega = new JFormattedTextField(mascaraData);
        jFormattedTextAluguel.setBounds(150,80,100,20);
        jFormattedTextCpf.setBounds(150,120,100,20);
        jFormattedTextTel.setBounds(150,160,100,20);
        jFormattedTextNomeCarro.setBounds(150,240,100,20);
        jFormattedTextPlacaCarro.setBounds(150,280,100,20);
        jFormattedTextAno.setBounds(150,320,100,20);
        jFormattedTextDataEntrega.setBounds(150,360,100,20);
        jFormattedTextDataLocacao.setBounds(150,400,100,20);

        //Adiciona os rótulos e os campos de textos com máscaras na tela
        janela.add(labelAluguel);
        janela.add(labelNome);
        janela.add(labelCpf);
        janela.add(labelTel);
        janela.add(labelDados );
        janela.add(labelNomeCliente);
        janela.add(labelPlaca);
        janela.add(labelAno);
        janela.add(labelDataLocacao);
        janela.add(labelDataEntrega);


        janela.add(jFormattedTextAluguel);
        janela.add(jFormattedTextTel);
        janela.add(jFormattedTextCpf);
        janela.add(jFormattedTextNomeCarro);
        janela.add(jFormattedTextAno);
        janela.add(jFormattedTextDataLocacao);
        janela.add(jFormattedTextDataEntrega);
        janela.add(jFormattedTextPlacaCarro);




        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
