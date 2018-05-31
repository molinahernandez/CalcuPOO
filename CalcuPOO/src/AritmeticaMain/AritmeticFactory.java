/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AritmeticaMain;
import ConverMain.Conver;
import Main.AbstractFactory;

/**
 *
 * @author Cristian Hernandez
 */
public class AritmeticFactory implements AbstractFactory {

    public AritmeticFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Aritmetica getAritmetica(String type) {
        switch (type) {
            case "Suma":
                return new Suma();
            case "Resta":
                return new Resta();
            case "Multiplicacion":
                return new Multiplicacion();
            case "Division":
                return new Division();
        }
        return null;
    }

    public Conver getConver(String type) {
        return null;
    }
}