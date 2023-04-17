/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuarto_Ejercicio;

/**
 *
 * @author lucho
 */
public class principal_ventas {
    public static void main(String[] args) {
        
        int[] Ventas = {600, 200, 450, 90, 45};
        int numeros = 5;
        
        ventas venta = new ventas(Ventas, numeros);
        
        System.out.println("a quie es: " + venta.Descendente()+ Ventas);
    }
}
