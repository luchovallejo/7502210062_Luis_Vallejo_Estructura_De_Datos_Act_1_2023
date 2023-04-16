/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Primer_Ejercicio;

/**
 *
 * @author lucho
 */
public class Dato_long {
    public static void main(String[] args) {
        //Tipo de dato primitivo long
        long[] Datos = new long[5];
        
        Datos[0] = 23;
        Datos[1] = 65;
        Datos[2] = 54;
        Datos[3] = 2;
        Datos[4] = 3;
        System.out.println("Los numeros del dato primitivo long son:\n");
        for(int l=0; l<Datos.length; l++){
            System.out.println("Dato " + (l+1) + " = " + Datos[l]);
        }
        
        System.out.println("\n");
        System.out.println("*********************************\n");
        
        Long[] data = new Long[5];
        
        data[0] = 65L;
        data[1] = 125L;
        data[2] = 98L;
        data[3] = 52L;
        data[4] = 10L;
        
        for(Long p:data){
            System.out.println("El numero de este dato Long es: "+p);
        }
    }
}
