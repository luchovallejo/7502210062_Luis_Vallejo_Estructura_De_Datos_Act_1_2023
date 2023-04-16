/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tercer_Ejercicio;

/**
 *
 * @author lucho
 */

// Ejercicio 3
public class venta {
    
    private int[] ventas;
    private int valor;
    
    public venta(int[] Sales, int xValor){
        ventas = Sales;
        valor = xValor;
    }
    
    public int getVentaMayor(){
        int Alta = ventas[0];
        for(int producto=1; producto<valor; producto++){
            if(ventas[producto]>Alta){
                Alta = ventas[producto];
            }
        }return Alta;
    }
    
    public int getVentaMenor(){
        int Baja = ventas[0];
        for(int cliente=1; cliente<valor; cliente++){
            if(ventas[cliente]<Baja){
                Baja = ventas[cliente];
            }
        }return Baja;
    }
    
    public int getTotalventa(){
        int VentaTotal=0;
        for(int Valores=1; Valores<valor; Valores++){
            VentaTotal += ventas[Valores];
        }return VentaTotal;
    }
    
    public double getPromedioVentas(){
        double promedios = getTotalventa();
        return promedios / valor;
    }
    
}