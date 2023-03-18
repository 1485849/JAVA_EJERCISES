/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventas;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Ventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String venta = JOptionPane.showInputDialog("ingrese el numero de ventas: \nSOLO 10! ");
        int x = Integer.parseInt(venta);
    switch(x){

       case 1:{
            venta=JOptionPane.showInputDialog("digite el precio: ");
            double precio=Double.parseDouble(venta);
                if(precio > 0){
                JOptionPane.showMessageDialog(null,venta);
            }
                else
                JOptionPane.showMessageDialog(null,"Ingrese el precio de la venta!!");
       }
       break;
       
       case 2:{
            venta=JOptionPane.showInputDialog("digite el precio 1: ");
            double precio=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 2: ");
            double precio1=Double.parseDouble(venta);
                if(precio > 0){
                JOptionPane.showMessageDialog(null,precio + precio1);
            }
                else if(precio1 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1);
                }
                else
                JOptionPane.showMessageDialog(null,"Ingrese el precio de la venta!!");
       }
       break;
       
       case 3:{
            venta=JOptionPane.showInputDialog("digite el precio 1: ");
            double precio=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 2: ");
            double precio1=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 3: ");
            double precio2=Double.parseDouble(venta);
                if(precio > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2);
            }
                else if(precio1 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2);
                }
                
                else if(precio2 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2);
                }
                
                else
                JOptionPane.showMessageDialog(null,"Ingrese el precio de la venta!!");
       }
       break;
       
       case 4:{
            venta=JOptionPane.showInputDialog("digite el precio 1: ");
            double precio=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 2: ");
            double precio1=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 3: ");
            double precio2=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 4: ");
            double precio3=Double.parseDouble(venta);
                if(precio > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3);
            }
                else if(precio1 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3);
                }
                
                else if(precio2 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3);
                }
                
                else if(precio3 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3);
                }
                
                else
                JOptionPane.showMessageDialog(null,"Ingrese el precio de la venta!!");
       }
       break;
       
       case 5:{
            venta=JOptionPane.showInputDialog("digite el precio 1: ");
            double precio=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 2: ");
            double precio1=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 3: ");
            double precio2=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 4: ");
            double precio3=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 5: ");
            double precio4=Double.parseDouble(venta);
                if(precio > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4);
            }
                else if(precio1 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4);
                }
                
                else if(precio2 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4);
                }
                
                else if(precio3 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4);
                }
                
                else if(precio4 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4);
                }
                
                else
                JOptionPane.showMessageDialog(null,"Ingrese el precio de la venta!!");
       }
       break;
       
       case 6:{
            venta=JOptionPane.showInputDialog("digite el precio 1: ");
            double precio=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 2: ");
            double precio1=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 3: ");
            double precio2=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 4: ");
            double precio3=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 5: ");
            double precio4=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 6: ");
            double precio5=Double.parseDouble(venta);
                if(precio > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5);
            }
                else if(precio1 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5);
                }
                
                else if(precio2 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5);
                }
                
                else if(precio3 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5);
                }
                
                else if(precio4 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5);
                }
                
                else if(precio5 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5);
                }
                
                else
                JOptionPane.showMessageDialog(null,"Ingrese el precio de la venta!!");
       }
       break;
       
       case 7:{
            venta=JOptionPane.showInputDialog("digite el precio 1: ");
            double precio=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 2: ");
            double precio1=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 3: ");
            double precio2=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 4: ");
            double precio3=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 5: ");
            double precio4=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 6: ");
            double precio5=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 7: ");
            double precio6=Double.parseDouble(venta);
                if(precio > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6);
            }
                else if(precio1 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6);
                }
                
                else if(precio2 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6);
                }
                
                else if(precio3 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6);
                }
                
                else if(precio4 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6);
                }
                
                else if(precio5 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6);
                }
                
                else if(precio6 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6);
                }
                
                else
                JOptionPane.showMessageDialog(null,"Ingrese el precio de la venta!!");
       }
       break;
       
       case 8:{
            venta=JOptionPane.showInputDialog("digite el precio 1: ");
            double precio=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 2: ");
            double precio1=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 3: ");
            double precio2=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 4: ");
            double precio3=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 5: ");
            double precio4=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 6: ");
            double precio5=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 7: ");
            double precio6=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 8: ");
            double precio7=Double.parseDouble(venta);
                if(precio > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7);
            }
                else if(precio1 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7);
                }
                
                else if(precio2 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7);
                }
                
                else if(precio3 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7);
                }
                
                else if(precio4 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7);
                }
                
                else if(precio5 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7);
                }
                
                else if(precio6 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7);
                }
                
                else if(precio7 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7);
                }
                
                else
                JOptionPane.showMessageDialog(null,"Ingrese el precio de la venta!!");
       }
       break;
       
       case 9:{
            venta=JOptionPane.showInputDialog("digite el precio 1: ");
            double precio=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 2: ");
            double precio1=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 3: ");
            double precio2=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 4: ");
            double precio3=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 5: ");
            double precio4=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 6: ");
            double precio5=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 7: ");
            double precio6=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 8: ");
            double precio7=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 9: ");
            double precio8=Double.parseDouble(venta);
                if(precio > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7 + precio8);
            }
                else if(precio1 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7 + precio8);
                }
                
                else if(precio2 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7 + precio8);
                }
                
                else if(precio3 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7 + precio8);
                }
                
                else if(precio4 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7 + precio8);
                }
                
                else if(precio5 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7 + precio8);
                }
                
                else if(precio6 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7 + precio8);
                }
                
                else if(precio7 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7 + precio8);
                }
                
                else if(precio8 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7 + precio8);
                }
                
                else
                JOptionPane.showMessageDialog(null,"Ingrese el precio de la venta!!");
       }
       break;
       
       case 10:{
            venta=JOptionPane.showInputDialog("digite el precio 1: ");
            double precio=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 2: ");
            double precio1=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 3: ");
            double precio2=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 4: ");
            double precio3=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 5: ");
            double precio4=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 6: ");
            double precio5=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 7: ");
            double precio6=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 8: ");
            double precio7=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 9: ");
            double precio8=Double.parseDouble(venta);
            venta=JOptionPane.showInputDialog("digite el precio 10: ");
            double precio9=Double.parseDouble(venta);
                if(precio > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7 + precio8 + precio9);
            }
                else if(precio1 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7 + precio8 + precio9);
                }
                
                else if(precio2 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7 + precio8 + precio9);
                }
                
                else if(precio3 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7 + precio8 + precio9);
                }
                
                else if(precio4 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7 + precio8 + precio9);
                }
                
                else if(precio5 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7 + precio8 + precio9);
                }
                
                else if(precio6 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7 + precio8 + precio9);
                }
                
                else if(precio7 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7 + precio8 + precio9);
                }
                
                else if(precio8 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7 + precio8 + precio9);
                }
                
                else if(precio9 > 0){
                JOptionPane.showMessageDialog(null,precio + precio1 + precio2 + precio3 + precio4 + precio5 + precio6 + precio7 + precio8 + precio9);
                }
                
                else
                JOptionPane.showMessageDialog(null,"Ingrese el precio de la venta!!");
       }
       break;
       
       }
       }
}
    

