/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculofiguras;

import calculofiguras.Clases.Circulo;
import calculofiguras.Clases.Cuadrado;
import calculofiguras.Clases.Triangulo;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class CalculoFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    Scanner read = new Scanner(System.in);
    int ingreso =0;
    System.out.println("Bienvenido. Seleccione en base a su requerimiento");
    System.out.println("Para calculo de valores de un Circulo   presione 1)");
    System.out.println("Para calculo de valores de un Triangulo presione 2)");
    System.out.println("Para calculo de valores de un Cuadrado  presione 3)");
    ingreso = read.nextInt();
    
   switch (ingreso){
       case 1:{
           Circulo();
           break;
       }
       case 2:{
           Triangulo();
           break;
       }
       case 3:{ 
           Cuadrado();
           break;
       }
       case 4:{
           System.out.println("Error no ha digitado una opcion valida.");
           break;
       }
   }
    
    
    }
    public static void Circulo(){
    Circulo bolita = new Circulo();
        bolita.solicitudParametros();
        bolita.calculoArea();
        bolita.validacion();
    }
    public static void Triangulo(){
    Triangulo tri = new Triangulo();
    
    tri.solicitudParametros();
    tri.calculoArea();
    tri.calculoPerime();
    tri.validacion();
    }
    public static void Cuadrado(){
    Cuadrado cua = new Cuadrado();
    cua.solicitudParametros();
    cua.calculoArea();
    cua.calculoPerime();
    cua.validacion();
    
    }
}
