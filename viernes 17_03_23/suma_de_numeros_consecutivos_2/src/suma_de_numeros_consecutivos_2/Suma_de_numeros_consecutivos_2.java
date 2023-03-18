/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma_de_numeros_consecutivos_2;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Suma_de_numeros_consecutivos_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner name = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre = name.nextLine();
        System.out.println("Hello "+nombre+ "!");
         //*****************************************
        Scanner number =new Scanner(System.in);
        System.out.println("ingrese el numero: ");
        int n = number.nextInt();
        int suma = 0;   // inicializamos la variable suma
        
        for (int numero = 1; numero<=n; numero++ ){
            suma = suma + numero;
        }
        System.out.println(" la suma es: "+ suma);
    }
    
}
