/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariocomputadores;

/**
 *
 * @author edwar
 */
public class PrecioTotal {
    private Double totalComputadores = 0.0;
        private Double totalComputadoresPortatiles = 0.0;
        private Double totalComputadoresMesa = 0.0;
        private Computadores[] listaComputadores;
        
        PrecioTotal(Computadores[] pComputadores) {
        this.listaComputadores = pComputadores;
        }
        public void mostrarTotales() {
            for (int i = 0; i < listaComputadores.length; i++){
                
                if (listaComputadores[i] instanceof Computadores){
                    totalComputadores += listaComputadores[i].calcularPrecio();
                }
                if (listaComputadores[i] instanceof ComputadoresMesa){
                    totalComputadoresMesa += listaComputadores[i].calcularPrecio();
                }
                if (listaComputadores[i] instanceof ComputadoresPortatiles){
                    totalComputadoresPortatiles += listaComputadores[i].calcularPrecio();
                }
            }
            
        // Mostramos los resultados
        System.out.println("La suma del precio de los computadores es de " + totalComputadores);
        System.out.println("La suma del precio de los computadores de mesa es de " + totalComputadoresMesa);
        System.out.print("La suma del precio de los computadores portátiles es de " + totalComputadoresPortatiles);
        }    
}
