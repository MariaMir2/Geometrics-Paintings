/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa;


public class Dibujar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio pendiente de realizar");
        
        Circle circulo1 = new Circle();
        Square cuadrado1 = new Square();
        Square cuadrado2 = new Square();
        Triangle triangulo1 = new Triangle();
        Triangle triangulo2 = new Triangle();
        Person persona = new Person();
        Square puerta1 = new Square();
        Square puerta2 = new Square();
        
        circulo1.changeColor("yellow");
        circulo1.moveVertical(-40);
        circulo1.makeVisible();
        
        cuadrado1.changeColor("blue");
        cuadrado1.moveVertical(65);
        cuadrado1.moveHorizontal(-210);
        cuadrado1.makeVisible();
        
        cuadrado2.changeColor("green");
        cuadrado2.moveVertical(65);
        cuadrado2.moveHorizontal(10);
        cuadrado2.makeVisible();
        
        triangulo1.changeColor("red");
        triangulo1.moveVertical(-10);
        triangulo1.moveHorizontal(-80);
        triangulo1.makeVisible();
        
        triangulo2.changeColor("red");
        triangulo2.moveVertical(-10);
        triangulo2.moveHorizontal(140);
        triangulo2.makeVisible();
        
        persona.moveVertical(15);
        persona.moveHorizontal(-50);
        persona.makeVisible();
        
        puerta1.changeColor("magenta");
        puerta1.moveVertical(100);
        puerta1.moveHorizontal(-190);
        puerta1.changeSize(25);
        puerta1.makeVisible();
        
        puerta2.changeColor("black");
        puerta2.moveVertical(100);
        puerta2.moveHorizontal(25);
        puerta2.changeSize(25);
        puerta2.makeVisible();
              
    }
    
}
