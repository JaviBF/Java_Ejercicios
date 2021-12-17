/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

/**
 *
 * @author Javier Bolívar
 */
public class EjerciciosJava {

   public boolean fiestaArdillas(int numBellotas,boolean finDeSemana){
       //si es fin de semana da igual cuantas bellotas haya
       if (finDeSemana){
       return true;
       }
       //si hay entre 40 y 60 bellotas, exito.
       if (40 <= numBellotas && numBellotas <=60){
           return true;
       }
       return false;
   }
    public static void main(String[] args) {
        EjerciciosJava ejercicio = new EjerciciosJava();
System.out.println("Ejercicio 01: ARDILLAS");
        System.out.println("30, False:"+ ejercicio.fiestaArdillas(30, false));
         System.out.println("50, False:"+ ejercicio.fiestaArdillas(50, false));
         System.out.println("70, True:"+ ejercicio.fiestaArdillas(70, true));
    }
    
}
