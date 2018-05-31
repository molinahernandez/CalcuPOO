/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;
import AritmeticaMain.Aritmetica;
import ConverMain.Conver;
import Main.AbstractFactory;
import Main.FactoryProducer;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Cristian Hernandez
 */
public class Interfaz extends JPanel {
    public int WIDTH = 300, widthTF = 120, widthB = 80;
    public int HEIGHT = 300, heightTF = 30, heightB = 30;
    public JTextField textF1, textF2, textF3;
    public JButton button, button2, button3, button4, button5;

    public Interfaz() {
        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(50, 40, widthTF, heightTF));

        textF3 = new JTextField();
        textF3.setBounds(new Rectangle(50, 80, widthTF, heightTF));

        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(110, 250, widthTF, heightTF));

        button = new JButton("Sumar");
        button.setBounds(new Rectangle(50, 115, widthB, heightB));

        button2 = new JButton("Restar");
        button2.setBounds(new Rectangle(150, 115, widthB, heightB));

        button3 = new JButton("Dividir");
        button3.setBounds(new Rectangle(50, 150, widthB, heightB));

        button4 = new JButton("Multiplicar");
        button4.setBounds(new Rectangle(150, 150, widthB, heightB));

        button5 = new JButton("Binario");
        button5.setBounds(new Rectangle(100, 200, widthB, heightB));

        textF1.setEditable(true);
        textF3.setEditable(true);
        textF2.setEditable(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                AbstractFactory l;
                l = FactoryProducer.getFactory("Aritmetica");
                Aritmetica suma = l.getAritmetica("Suma");
                Integer valor1 = 0, valor2 = 0, resultado = 0;
                String numero1 = textF1.getText(), numero2 = textF3.getText();

                valor1 = Integer.parseInt(numero1);
                valor2 = Integer.parseInt(numero2);

                resultado = suma.calcular(valor1, valor2);

                textF2.setText(resultado.toString());
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                AbstractFactory l;
                l = FactoryProducer.getFactory("Aritmetica");
                Aritmetica Resta = l.getAritmetica("Resta");
                Integer valor1 = 0, valor2 = 0, resultado = 0;
                String numero1 = textF1.getText(), numero2 = textF3.getText();

                valor1 = Integer.parseInt(numero1);
                valor2 = Integer.parseInt(numero2);

                resultado = Resta.calcular(valor1, valor2);

                textF2.setText(resultado.toString());
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                AbstractFactory l;
                l = FactoryProducer.getFactory("Aritmetica");
                Aritmetica Division = l.getAritmetica("Division");
                Integer valor1 = 0, valor2 = 0, resultado = 0;
                String numero1 = textF1.getText(), numero2 = textF3.getText();

                valor1 = Integer.parseInt(numero1);
                valor2 = Integer.parseInt(numero2);

                resultado = Division.calcular(valor1, valor2);

                textF2.setText(resultado.toString());
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                AbstractFactory l;
                l = FactoryProducer.getFactory("Aritmetica");
                Aritmetica Multiplicar = l.getAritmetica("Multiplicar");
                Integer valor1 = 0, valor2 = 0, resultado = 0;
                String numero1 = textF1.getText(), numero2 = textF3.getText();

                valor1 = Integer.parseInt(numero1);
                valor2 = Integer.parseInt(numero2);

                resultado = Multiplicar.calcular(valor1, valor2);

                textF2.setText(resultado.toString());
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                AbstractFactory l;
                l = FactoryProducer.getFactory("Convertir");
                Conver bin = l.getConver("Binario");

                int valor1 = 0;
                String numero1 = textF1.getText();

                valor1 = Integer.parseInt(numero1);

                textF2.setText(bin.Convertir(valor1));
            }
        });

        add(textF1);
        add(textF3);
        add(button);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(textF2);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
}