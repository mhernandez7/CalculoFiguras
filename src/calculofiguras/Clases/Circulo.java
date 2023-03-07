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
public class Circulo extends Figura{

    @Override
    public void solicitudParametros() {
    Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        this.radio = read.nextDouble();
    
           }

    @Override
    public void calculoArea() {
    
    this.area = valorPi * Math.pow(this.radio, 2);
    
        System.out.println("El valor del area del circulo es: "+this.area);
    }

    @Override
    public void calculoPerime() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
