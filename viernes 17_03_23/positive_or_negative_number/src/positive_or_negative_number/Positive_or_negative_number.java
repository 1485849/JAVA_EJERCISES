/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positive_or_negative_number;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Positive_or_negative_number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // pedir que ingrese un numero y indicar si es positivo o negativo
        Scanner teclado=new Scanner(System.in);
        int a;
        System.out.println("ingrese un numero: ");
        a=teclado.nextInt();
        if(a>0)
            System.out.println("el numero ingresado es positivo");
        else
            System.out.println("el numero ingresado es negativo");   
        }
    }
    
}
