package palavra.aa;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        JFrame home = new JFrame("java swing");
        JPanel painel = new JPanel();
        JPanel painel2 = new JPanel();

        ArrayList<String> teste = new ArrayList<>();
        teste.add("nada");
        teste.add("lara");

        String palavra = teste.get(1);
        String[] palavraDividida = palavra.split("");
        System.out.println(Arrays.toString(palavraDividida));

        painel.setSize(200,200);
        painel.setLayout(new GridLayout());

        painel2.setSize(200,200);
        painel2.setLayout(new GridLayout());

        home.setSize(400,400);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        PRIMEIRA LINHA
        JTextField text1 = new JTextField("");
        JTextField text2 = new JTextField("");
        JTextField text3 = new JTextField("");
        JTextField text4 = new JTextField("");
//        SEGUNDA LINHA (ARRUMAR LAYOUT)
        JTextField text5 = new JTextField("");
        JTextField text6 = new JTextField("");
        JTextField text7 = new JTextField("");
        JTextField text8 = new JTextField("");

        Border normalBorder = new LineBorder(Color.BLACK, 2, true);

        home.setBackground(Color.GRAY);

        text1.setBorder(normalBorder);
        text2.setBorder(normalBorder);
        text3.setBorder(normalBorder);
        text4.setBorder(normalBorder);

        ActionListener acao = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String letra1 = text1.getText();
                if (letra1.equalsIgnoreCase(palavraDividida[0])){
                    text1.setBackground(Color.green);
                }
                else{
                    text1.setBackground(Color.red);
                }
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
