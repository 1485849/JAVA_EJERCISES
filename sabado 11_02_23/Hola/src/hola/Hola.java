/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Hola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        int op ;
        int op2;
        Scanner sumando = new Scanner(System.in);
        System.out.println("INGRESE EL PRIMER NUMERO: ");
        op = sumando.nextInt();
        System.out.println("INGRESE EL PRIMER NUMERO: ");
        op2 = sumando.nextInt();
        
        int resultado =sumaN(op,op2);
        System.out.println("LA SUMA ES: " + resultado);
        
    }
     public static int sumaN(int num1 , int num2){
     int resultado = num1 + num2;
     return resultado;
     }
}
