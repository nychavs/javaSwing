package palavra.aa;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static JTextField text1, text2, text3, text4;
    public static JTextField text5, text6, text7, text8;
    public static void main(String[] args) throws IOException {

        Palavras palavra = new Palavras();
        palavra.sortearPalavra();

        JFrame home = new JFrame("java swing");
        JPanel painel = new JPanel();
        JPanel painel2 = new JPanel();

        painel.setSize(200,200);
        painel.setLayout(new GridLayout());

        painel2.setSize(200,200);
        painel2.setLayout(new GridLayout());

        home.setSize(400,400);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        PRIMEIRA LINHA
        text1 = new JTextField("");
        text2 = new JTextField("");
        text3 = new JTextField("");
        text4 = new JTextField("");

//        SEGUNDA LINHA (ARRUMAR LAYOUT)
        text5 = new JTextField("");
        text6 = new JTextField("");
        text7 = new JTextField("");
        text8 = new JTextField("");

        Border normalBorder = new LineBorder(Color.BLACK, 2, true);

        home.setBackground(Color.GRAY);

        text1.setBorder(normalBorder);
        text2.setBorder(normalBorder);
        text3.setBorder(normalBorder);
        text4.setBorder(normalBorder);

        Validador validar = new Validador();
        // PROVAVELMENTE VOU TROCAR O ACTION LISTENER POR LAMBDA
        // AI EU CONSIGO USAR UM METODO SÓ PARA TODOS OS OBJETOS DE JFIELD
        ActionListener acao = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validar.validar();
            }
        };

        text1.addActionListener(acao);
        painel2.add(text5);
        painel2.add(text6);
        painel2.add(text7);
        painel2.add(text8);

        painel.add(text1);
        painel.add(text2);
        painel.add(text3);
        painel.add(text4);

        home.add(painel2);
        home.add(painel);
        home.setVisible(true);
    }

}
