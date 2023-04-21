/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quinto_Ejercicio;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Object {
    
    private Object[][] lenguajes;
    private Object infolenguaje;
    
    public Object(Object[][] idioma, Object info){
        lenguajes = idioma;
        infolenguaje = info;
    }
    
    public void infoLenguajes(){
        Scanner scar = new Scanner(System.in);
        int leng = lenguajes.length;
        for(int p=0; p<leng; p++){
            for(int j=0; j<leng; j++){
                String[][] Object = null;
               Object[p][j]= scar.nextLine();
            }
        }
    }
}
