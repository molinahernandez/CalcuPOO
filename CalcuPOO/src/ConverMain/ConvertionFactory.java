/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConverMain;

import AritmeticaMain.Aritmetica;
import Main.AbstractFactory;

/**
 *
 * @author Cristian Hernandez
 */
public class ConvertionFactory implements AbstractFactory {

    public ConvertionFactory() {
    }

    public Conver getConver(String type) {
        switch (type) {
            case "Bin":
                return new Bin();
            default:
                break;
        }
        return null;
    }

    @Override
    public Aritmetica getAritmetica(String type) {
        return null;
    }
}