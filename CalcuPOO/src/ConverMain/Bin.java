/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConverMain;

/**
 *
 * @author Cristian Hernandez
 */
public class Bin implements Conver{

    @Override
    public String Convertir(int a) {
        String bin = Integer.toBinaryString(a);
        return bin;
    }
}