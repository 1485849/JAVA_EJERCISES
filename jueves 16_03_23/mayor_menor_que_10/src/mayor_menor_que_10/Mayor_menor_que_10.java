/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayor_menor_que_10;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Alumno
 */
public class Mayor_menor_que_10 {
    
    /**
     * @param args the command line arguments
     */

class Main {
    public static void main(String[] args) {
        // TODO code aplication logic here
        //Scanner lector=new Scanner(System.in;
        System.out.println("ingrese el numero: ");
        int n=lector.nextInt();
        int [] Arreglo=new int [n];
        for(int i=0;i<n;i++)
        {
            Arreglo[i]=lector.nextInt();
        }      
        int menor,mayor;
        menor=mayor=Arreglo[0];
        for(int j=1;j<n;j++)
        {
            if(Arreglo[j]>mayor)
            {
                mayor=Arreglo[j];
            }
            if(Arreglo[j]<menor)
            {
                menor=Arreglo[j];
            }
        }
        System.out.println("el numero mayor es : ");
        System.out.println(mayor);
        System.out.println("El mayor menor es: ");
        System.out.println(menor);
        
    } 
     
}