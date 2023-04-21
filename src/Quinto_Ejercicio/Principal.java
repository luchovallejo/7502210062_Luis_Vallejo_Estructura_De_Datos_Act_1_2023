/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quinto_Ejercicio;

/**
 *
 * @author lucho
 */
public class Principal {
    public static void main(String[] args) {
        java.lang.Object[][] Object = new java.lang.Object[5][8];
        int infolenguaje = 5;
        
        Object[0] = new java.lang.Object[]{"NOMBRE", "AÑO", "AUTOR", "DETALLES", "FRAMEWORKS"};
        
        for(int t=0; t<Object.length; t++){
            for(int j=0; j<Object[t].length; j++){
                System.out.println(Object[t][j]);
            }
        }
       
    }
}
