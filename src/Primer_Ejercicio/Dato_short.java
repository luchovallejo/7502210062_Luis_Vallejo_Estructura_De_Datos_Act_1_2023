/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Primer_Ejercicio;

/**
 *
 * @author lucho
 */
public class Dato_short {
    public static void main(String[] args) {
        
        short[] matrix = new short[5];
        
        matrix[0] = 76;
        matrix[1] = 33;
        matrix[2] = 67;
        matrix[3] = 89;
        matrix[4] = 12;
        
        for(short Matz:matrix){
            System.out.println("El numero de esta matriz equivale a: "+ Matz);
        }
        
        System.out.println("\n");
        System.out.println("*********************************\n");
        
        Short[] Qnumbers = {67, 8, 32, 22, 45};
        for(Short cantidad: Qnumbers){
            System.out.println("Este numero equivale a: " + cantidad);
        }
    }
}
