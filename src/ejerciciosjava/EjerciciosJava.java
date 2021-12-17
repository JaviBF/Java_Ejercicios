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
/**
 * 
 * @param numBellotas
 * @param finDeSemana
 * @return 
 */
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
   /**
    * 
    * @param velocidad valores entre 60 y 80
    * @param birthday indica si es tu cumpleaños
    * @return se devuelve un valor 0 1 o 2 depende de tu velocidad y de si es
    * tu cumpleaños o no
    */
   public int multa (int velocidad, boolean birthday){
       if(birthday){
           //velocidad = velocidad -5;
           velocidad -= 5; //si es mi cumple, me quitan 5 de la velocidad
       }
       if (velocidad <= 60){//si va entre 60, no hay multa
           return 0;
       }
       if (60 < velocidad && velocidad <= 80){//si va entre 60 y 80 es multa 
           return 1;//multa pequeña
       }
       return 2;
   }
 /**
  * 
  * @param multiplo
  * @param vanidoso
  * @return 
  */
   public boolean muyVanidoso (int multiplo){
       if (multiplo % 11 < 2){
           return true;
       }
       return false;
   }
  
    public static void main(String[] args) {
        EjerciciosJava ejercicio = new EjerciciosJava();
        //test de mi primer ejercicio
System.out.println("Ejercicio 01: ARDILLAS");
        System.out.println("30, False:"+ ejercicio.fiestaArdillas(30, false));
         System.out.println("50, False:"+ ejercicio.fiestaArdillas(50, false));
         System.out.println("70, True:"+ ejercicio.fiestaArdillas(70, true));
         
         //test del segundo ejercicio
         System.out.println("Ejercicio 02: Multa");
        System.out.println("60, False:"+ ejercicio.multa(60, false));
         System.out.println("65, False:"+ ejercicio.multa(65, false));
         System.out.println("65, True:"+ ejercicio.multa(65, true));
         
         //test del tercer ejercicio
         //test del segundo ej
         System.out.println("Ejercicio 03: Vanidoso");
        System.out.println("22, true:"+ ejercicio.muyVanidoso(22));
         System.out.println("23, true:"+ ejercicio.muyVanidoso(23));
         System.out.println("24, false:"+ ejercicio.muyVanidoso(24));
    }
    
}
