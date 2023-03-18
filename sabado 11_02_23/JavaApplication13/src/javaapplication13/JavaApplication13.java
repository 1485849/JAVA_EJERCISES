/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int time = 18;
        String result = (time <18)? "Good day":"good everning";
        System.out.println(result);*/
        
        while (true) {
            String valor=JOptionPane.showInputDialog("Elija un mes del año\n1.-ENERO\n2.-FEBRERO\n3.-MARZO\n4.-ABRIL \n5.-MAYO \n6.-JUNIO \n7.-JULIO \n8.-AGOSTO \n9.-SETIEMBRE \n10.-OCTUBRE \n11.-NOVIEMBRE \n12.-DICIEMBRE \n13.-AÑO");
      int opcion=Integer.parseInt(valor);

      switch(opcion){

       case 1:{
        JOptionPane.showMessageDialog(null,"EL MES TIENE 31 DIAS:\n_________________________________ \n| 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 | 09 | 10 |\n| 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 |\n| 21 | 22 | 23 | 24 | 25 | 26 | 27 | 28 | 29 | 30 \n| 31 |\n_________________________________");
       }
       break;
       
       case 2:{
        JOptionPane.showMessageDialog(null, "EL MES TIENE 28 DIAS:\n_________________________________ \n| 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 | 09 | 10 |\n| 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 |\n| 21 | 22 | 23 | 24 | 25 | 26 | 27 | 28 |\n_________________________________");
       }
       break;
       
       case 3:{
        JOptionPane.showMessageDialog(null,"EL MES TIENE 31 DIAS:\n_________________________________ \n| 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 | 09 | 10 |\n| 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 |\n| 21 | 22 | 23 | 24 | 25 | 26 | 27 | 28 | 29 | 30 \n| 31 |\n_________________________________");
       }
       
       case 4:{
        JOptionPane.showMessageDialog(null,"EL MES TIENE 30 DIAS:\n_________________________________ \n| 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 | 09 | 10 |\n| 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 |\n| 21 | 22 | 23 | 24 | 25 | 26 | 27 | 28 | 29 | 30 |\n_________________________________");
       }
       
       case 5:{
        JOptionPane.showMessageDialog(null,"EL MES TIENE 31 DIAS:\n_________________________________ \n| 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 | 09 | 10 |\n| 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 |\n| 21 | 22 | 23 | 24 | 25 | 26 | 27 | 28 | 29 | 30 \n| 31 |\n_________________________________");
       }

       case 6:{
        JOptionPane.showMessageDialog(null,"EL MES TIENE 30 DIAS:\n_________________________________ \n| 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 | 09 | 10 |\n| 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 |\n| 21 | 22 | 23 | 24 | 25 | 26 | 27 | 28 | 29 | 30 |\n_________________________________");
       }
       break;

       case 7:{
        JOptionPane.showMessageDialog(null,"EL MES TIENE 31 DIAS:\n_________________________________ \n| 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 | 09 | 10 |\n| 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 |\n| 21 | 22 | 23 | 24 | 25 | 26 | 27 | 28 | 29 | 30 \n| 31 |\n_________________________________");
       }
       break;
       
       case 8:{
        JOptionPane.showMessageDialog(null,"EL MES TIENE 31 DIAS:\n_________________________________ \n| 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 | 09 | 10 |\n| 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 |\n| 21 | 22 | 23 | 24 | 25 | 26 | 27 | 28 | 29 | 30 \n| 31 |\n_________________________________");
       }
       break;
       
       case 9:{
        JOptionPane.showMessageDialog(null,"EL MES TIENE 30 DIAS:\n_________________________________ \n| 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 | 09 | 10 |\n| 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 |\n| 21 | 22 | 23 | 24 | 25 | 26 | 27 | 28 | 29 | 30 |\n_________________________________");
       }
       break;
       
       case 10:{
        JOptionPane.showMessageDialog(null,"EL MES TIENE 31 DIAS:\n_________________________________ \n| 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 | 09 | 10 |\n| 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 |\n| 21 | 22 | 23 | 24 | 25 | 26 | 27 | 28 | 29 | 30 \n| 31 |\n_________________________________");
       }
       break;
       
       case 11:{
        JOptionPane.showMessageDialog(null,"EL MES TIENE 30 DIAS:\n_________________________________ \n| 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 | 09 | 10 |\n| 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 |\n| 21 | 22 | 23 | 24 | 25 | 26 | 27 | 28 | 29 | 30 |\n_________________________________");
       }
       break;

       case 12:{
        JOptionPane.showMessageDialog(null,"EL MES TIENE 31 DIAS:\n_________________________________ \n| 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 | 09 | 10 |\n| 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 |\n| 21 | 22 | 23 | 24 | 25 | 26 | 27 | 28 | 29 | 30 \n| 31 |\n_________________________________");
       }
       break;
       
       case 13:{
        valor=JOptionPane.showInputDialog("digite el año: ");
        double año=Double.parseDouble(valor);
            if((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))){
                JOptionPane.showMessageDialog(null,"El año es bisiesto");
            }
            else
            JOptionPane.showMessageDialog(null,"El año no es bisiesto");
        }
       break;
       
       default:
        JOptionPane.showMessageDialog(null,"OPCION NO VALIDA");
      }
     }
    }
}
