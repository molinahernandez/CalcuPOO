/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import AritmeticaMain.AritmeticFactory;
import ConverMain.ConvertionFactory;
/**
 *
 * @author Cristian Hernandez
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String type) {
        switch (type) {
            case "Aritmetica":
                return new AritmeticFactory();
            case "Conversion":
                return (AbstractFactory) new ConvertionFactory();
        }
        return null;
    }
}