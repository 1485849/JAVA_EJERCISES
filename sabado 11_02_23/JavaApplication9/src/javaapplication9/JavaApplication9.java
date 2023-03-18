/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;
import javax.swing.JOptionPane;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class JavaApplication9 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            String valor=JOptionPane.showInputDialog("Elija el numero de la figura\n1.-Circulo\n2.-Triangulo\n3.-Cuadrado");
      int opcion=Integer.parseInt(valor);

      switch(opcion){

       case 1:{
        valor=JOptionPane.showInputDialog("Radio");
        double radio=Double.parseDouble(valor);
        double area=3.1416*(radio*radio);
        JOptionPane.showMessageDialog(null,"El area es: "+area);
       }
       break;

       case 2:{
        valor=JOptionPane.showInputDialog("Base");
        double base=Double.parseDouble(valor);
        valor=JOptionPane.showInputDialog("Altura");
        double altura=Double.parseDouble(valor);
        double area=(base*altura)/2;
        JOptionPane.showMessageDialog(null,"El area es: "+area);
       }
       break;

       case 3:{
        valor=JOptionPane.showInputDialog("Lado");
        double base=Double.parseDouble(valor);
        double area=base + base + base + base;
        JOptionPane.showMessageDialog(null, "El area es: "+area);
       }
       break;

       default:
        JOptionPane.showMessageDialog(null,"Opcion no validad");
      }
     }
    }
}
    
 