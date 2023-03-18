/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while(true){
        int n;
        Scanner sc = new Scanner(System.in);
    
        do {  
            System.out.print("Introduce un numero entero >= 0: ");
            n = sc.nextInt();
        } while (n < 0);

        
        System.out.printf("%d! = %.0f %n", n, factorial(n));
    }
    }
    
    public static double factorial(int n) {
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
