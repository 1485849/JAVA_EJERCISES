/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monedas;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Monedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    while (true){
        String valor=JOptionPane.showInputDialog("CONVERTIDOR DE SOLES: \n1.-YENES \n2.-DOLARES \n3.-EUROS\n \n4.-CONVERTIDOR DE YENES \n5.-SALIR");
      int opcion=Integer.parseInt(valor);
      
      switch(opcion){

       case 1:{
        valor=JOptionPane.showInputDialog("CANTIDAD EN SOLES: S/.");
        double cantidad=Double.parseDouble(valor);
        double yen=cantidad *35.45;
        JOptionPane.showMessageDialog(null,"S/."+cantidad+" equivale a " +"¥"+yen+" yenes");
       }
       break;
       
       case 2:{
        valor=JOptionPane.showInputDialog("CANTIDAD EN SOLES: S/.");
        double cantidad=Double.parseDouble(valor);
        double dol=cantidad *0.26;
        JOptionPane.showMessageDialog(null,"S/."+cantidad+" equivale a " +"$"+dol+" dolares");
       }
       break;
       
       case 3:{
        valor=JOptionPane.showInputDialog("CANTIDAD EN SOLES: S/.");
        double cantidad=Double.parseDouble(valor);
        double eur=cantidad *0.25;
        JOptionPane.showMessageDialog(null,"S/."+cantidad+" equivale a " +"€"+eur+" euros");
       }
       break;
       
       case 4:{
        String valor1=JOptionPane.showInputDialog("CONVERTIDOR DE YENES: \n1.-SOLES \n2.-DOLARES \n3.-EUROS");
        int opcion1=Integer.parseInt(valor1);
            switch(opcion1){

           case 1:{
            valor1=JOptionPane.showInputDialog("CANTIDAD EN YENES: ¥");
            double cantidad1=Double.parseDouble(valor1);
            double sol=cantidad1 *0.028;
            JOptionPane.showMessageDialog(null,"¥"+cantidad1+" equivale a " +"S/."+sol+" soles");
           }
           break;

           case 2:{
            valor1=JOptionPane.showInputDialog("CANTIDAD EN YENES: ¥");
            double cantidad1=Double.parseDouble(valor1);
            double dol1=cantidad1 *0.0074;
            JOptionPane.showMessageDialog(null,"¥."+cantidad1+" equivale a " +"$"+dol1+" dolares");
           }
           break;

           case 3:{
            valor1=JOptionPane.showInputDialog("CANTIDAD EN SOLES: S/.");
            double cantidad1=Double.parseDouble(valor1);
            double eur1=cantidad1 *0.0069;
            JOptionPane.showMessageDialog(null,"¥"+cantidad1+" equivale a " +"€"+eur1+" euros");
           }
           break;
       }
    }
       case 5:{
        JOptionPane.showMessageDialog(null,"EL PROGRAMA SE CERRÓ");   
        break;
    }
    }
    }
    }
}
