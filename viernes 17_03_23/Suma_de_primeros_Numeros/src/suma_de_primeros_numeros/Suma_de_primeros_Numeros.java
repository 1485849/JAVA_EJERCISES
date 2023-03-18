/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma_de_primeros_numeros;
import java.util.Scanner; // para poder ingresar un numero (libreria)
/**
 *
 * @author Alumno
 */
public class Suma_de_primeros_Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner name = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre = name.nextLine();
        System.out.println("Hello "+nombre+ "!");
        System.out.println("Ingrese un numero: ");
        //*****************************************
        Scanner number = new Scanner(System.in);
        int n  = number.nextInt();
        int suma = 0;
      
        
        
        for (int i = 0; i<=n; i++){
            suma = suma + i;
       
        }
        
        System.out.println(" La suma de los numeros es: "+ suma);
    } 
    
}
