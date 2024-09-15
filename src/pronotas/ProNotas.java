/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pronotas;

import Igu.Prin;

/**
 *
 * @author crist
 */
public class ProNotas {

    static double mayor = 0;
    static double menor = 5.0;
    static double suma = 0;
    static double promedio = 0;
    
    public static void main(String[] args) {
       Prin prin = new Prin();
       prin.setVisible(true);
       prin.setLocationRelativeTo(null);
    }
    
    public static double promedio (double [] notas){
        
        for (int i = 0; i < 5; i++){
             suma += notas[i];
      }
      promedio = suma / 5;
      return promedio;
    }
    
    public static double nmayor (double [] notas){
      for (int i = 0; i < 5; i++){
           if (notas[i] > mayor){
               mayor = notas[i];
           }
           
           
      }
      return mayor;
    }
    
    public static double nmenor (double [] notas){
       for (int i = 0; i < 5; i++){
           if (notas[i] < menor){
               menor = notas[i];
           }
           
           
      }
      return menor;
    }
 
    public static double calcularDesviacionEstandar(double[] notas) {
        double promedio = promedio(notas);
        double sumaDeCuadrados = 0;
        
        for (double nota : notas) {
            sumaDeCuadrados += Math.pow(nota - promedio, 2);
        }
        
        double varianza = sumaDeCuadrados / notas.length;
        return Math.sqrt(varianza);
    }
}


    

