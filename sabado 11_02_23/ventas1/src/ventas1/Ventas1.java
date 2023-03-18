/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventas1;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Ventas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ventas;
       // int ventas2 = 0;
         int detalles;
         int total = 0;
         Scanner sc = new Scanner(System.in);
         System.out.print("Indique el número de productos vendidos ");
         ventas = sc.nextInt();
             for(int i=1;i<=ventas;i++) {
                  System.out.print("Indique precio del producto ");
                  detalles = sc.nextInt();
                
                  total += detalles;
                 
 
             }
         System.out.println("El total de ventas es "+ total);
 
    }
}
