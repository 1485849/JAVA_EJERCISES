/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Alumno
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    while (true){     
        String txt = JOptionPane.showInputDialog("Introduce un numero");
        int limite = Integer.parseInt(txt);
         
        int cifras = cuentaCifras(limite);
         
        JOptionPane.showMessageDialog(null,"Numero de cifras: " + cifras);
         
    }
    }
 
    public static int cuentaCifras(int num) {
 
        int contador = 0;
 
        if (num == 0) {
            contador = 1;
        } else {
 
            for (int i = Math.abs(num); i > 0; i /= 10) {
                contador++;
            }
 
        }
 
        return contador;
    }
 
}
