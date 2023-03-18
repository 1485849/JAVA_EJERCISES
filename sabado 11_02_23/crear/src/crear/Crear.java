/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crear;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Crear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
 
		System.out.print("Digite el primer número: ");
		int primero=entrada.nextInt();
 
		System.out.print("Digite el segundo número: ");
		int segundo=entrada.nextInt();
 
		if(primero<segundo)
		{
			for(int i=primero;i<=segundo;i++)
			{
				int n = (int) (Math.random() * (segundo - primero)) + primero;
                                System.err.println(n);
			}
		}else{
			System.out.print("El primer numero tiene que ser inferior al segundo\n");
		}
    
	}
}
