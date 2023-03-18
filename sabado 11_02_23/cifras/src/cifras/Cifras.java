/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cifras;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Cifras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String txt = JOptionPane.showInputDialog("ingrese un numero");
         int x = Integer.parseInt(txt);
        
        
        int iCantidad = 0;
        int iTemp = x;
    
    while (iTemp>0){
    iTemp = iTemp/10;
     iCantidad++;
    }
    
System.out.println(x + " tiene " + x + " dígitos");
    }
    
}
