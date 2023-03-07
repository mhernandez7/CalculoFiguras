/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculofiguras.Clases;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Cuadrado extends Figura{

    @Override
    public void solicitudParametros() {
   Scanner read = new Scanner(System.in);
   
        System.out.println("Ingrese el valor del lado del cuadrado");
        this.lado = read.nextInt();
    
    }

    @Override
    public void calculoArea() {
        this.area = Math.pow(this.lado, 2);
        System.out.println("El area del Cuadrado es: "+this.area);
           
    }

    @Override
    public void calculoPerime() {
         this.perimetro = this.lado * 4;
           System.out.println("El perimetro del Cuadrado es: "+this.perimetro); 
           }
    
    
    
}
