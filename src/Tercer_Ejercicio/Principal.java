/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tercer_Ejercicio;

/**
 *
 * @author lucho
 */
public class Principal {
    public static void main(String[] args) {
        int[] venta ={590, 122, 150, 30, 288};
        int valor = venta.length;
        
        venta cantidad = new venta(venta, valor);
        System.out.println("Las ventas son: \n");
        for(int t=0; t<venta.length; t++){
            System.out.println("Ventas "+ t + " es: "+venta[t]);
        }
        System.out.println("La venta mas Alta es: "+ venta[0]);
        System.out.println("La venta mas Baja es: "+ venta[3]);
        System.out.println("********************");
        System.out.println("El Total de  todas las ventas es: "+ cantidad.getTotal());
        System.out.println("EL promedio de todas las ventas es: "+ cantidad.getPromedios());
    }
}
