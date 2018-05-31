/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import AritmeticaMain.Aritmetica;
import ConverMain.Conver;
import ConverMain.Conver;
/**
 *
 * @author Cristian Hernandez
 */
public interface AbstractFactory {
    Aritmetica getAritmetica (String type);
    Conver getConver (String type);
}