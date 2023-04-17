/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuarto_Ejercicio;

import java.util.Arrays;

/**
 *
 * @author lucho
 */
public class ventas {
    
    private int[] Ventas;
    private int numeros;
    
    public ventas(int[] negocio, int cifras){
        Ventas = negocio;
        numeros = cifras;
    }
    
    public int Descendente(){
        int Baja = Ventas[0];
        for(int cliente=1; cliente<numeros; cliente++){
            if(Ventas[cliente]<Baja){
                Baja = Ventas[cliente];
            }   
        }return Baja;
    }
    
    public void Ascendente(){
        Arrays.sort(Ventas);
    }
}
