/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcuPOO;

import Gui.Interfaz;
import AritmeticaMain.Aritmetica;
import ConverMain.Conver;
import javax.swing.JFrame;
/**
 *
 * @author Cristian Hernandez
 */
public class CalcuPOO {
    public static void main(String[] args) {

        JFrame Interfaz = new JFrame("Calcu");
        Interfaz.setContentPane(new Interfaz());
        Interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Interfaz.setResizable(false);
        Interfaz.pack();
        Interfaz.setVisible(true);
    } 
}