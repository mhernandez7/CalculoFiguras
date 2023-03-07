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
public class Triangulo extends Figura{

    @Override
    public void solicitudParametros() {
    Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo: ");
        this.base = read.nextDouble();
        System.out.println("Ingrese la altura del triangulo: ");
        this.altura = read.nextDouble();
    
    }
    @Override
    public void calculoArea() {
    this.area =    (this.base*this.altura)/2;
        System.out.println("El area del triangulo es: "+this.area);
    }

    @Override
    public void calculoPerime() {
    this.perimetro = this.base *3;
    
    System.out.println("El perimetro del triangulo es: "+this.perimetro);
    }
    


}
