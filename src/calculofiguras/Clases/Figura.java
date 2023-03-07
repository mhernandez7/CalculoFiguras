/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculofiguras.Clases;

import static calculofiguras.CalculoFiguras.Circulo;
import static calculofiguras.CalculoFiguras.Cuadrado;
import static calculofiguras.CalculoFiguras.Triangulo;
import calculofiguras.Interfaz.Ifigura;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public abstract class Figura implements Ifigura{
    
    protected double radio;
    protected double base;
    protected double altura;
    protected double lado;
    protected double area;
    protected double perimetro;
    protected int validacion;

    public Figura() {
        this.radio = 0;
        this.base = 0;
        this.altura = 0;
        this.lado = 0;
    }
    
    public void validacion(){
    Scanner read = new Scanner(System.in);
    int ingreso =0;
    System.out.println("Desea calcular el valor de otra figura");
    System.out.println("Para confirmar presion 1 o cualquier otro numero para salir");
        this.validacion = read.nextInt();
        if (this.validacion == 1){
        
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
    
}else
        {
            System.out.println("Ha salido correctamente: ");
            
        }      
    }
 }