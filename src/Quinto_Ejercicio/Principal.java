/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quinto_Ejercicio;

import static Quinto_Ejercicio.Quinto_Ejercicio.infoLenguajes;

/**
 *
 * @author lucho
 */
public class Principal {
    public static void main(String[] args) {
        Object[][] lenguajes = new Object[5][8];
        lenguajes[0] = new Object[]{"NOMBRE", "AÑO", "AUTOR", "DETALLES", "FRAMEWORKS"};
        
        infoLenguajes(lenguajes);
        
        for(int k=0; k<lenguajes.length; k++){
           for(int h=0; h<lenguajes[k].length; h++){
               System.out.print(lenguajes[k][h] + "\t");
           }
            System.out.println();
        } 
    }
}
