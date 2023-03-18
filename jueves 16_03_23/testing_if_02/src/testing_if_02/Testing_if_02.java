/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testing_if_02;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class Testing_if_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre = name.nextLine();
        System.out.println("Hello "+nombre+ "!");
        System.out.println("Ingrese un numero: ");
        //***********************************
        int num =name.nextInt();
        //Algoritmo if
        if (num < 10){
            System.out.println("hola "+nombre+" "+"el numero que ingresaste es menor que 10");
        }
        else if (num == 10){
            System.out.println("hola "+nombre+" "+"el numero que ingresaste es igual a 10");
          }
        else if (num > 10){
            System.out.println("Hola "+nombre+" "+"el numero que ingresaste es mayor que 10");
        }
    } 
    
}
