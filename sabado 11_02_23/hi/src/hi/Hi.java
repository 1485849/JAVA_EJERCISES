/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hi;
import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author Alumno
 */
public class Hi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Solicitar los dos números al usuario mediante ventanas de JOptionPane
        String input1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        int num1 = Integer.parseInt(input1);
        
        String input2 = JOptionPane.showInputDialog("Ingrese el segundo número:");
        int num2 = Integer.parseInt(input2);
        
        // Crear una instancia de la clase Random
        Random random = new Random();
        
        // Generar 9 números aleatorios en base a los dos números ingresados y mostrarlos en ventanas de JOptionPane
        for (int i = 0; i < 9; i++) {
            int numeroAleatorio = random.nextInt(Math.max(num1, num2) - Math.min(num1, num2) + 1) + Math.min(num1, num2);
            JOptionPane.showMessageDialog(null, "Número aleatorio generado: " + numeroAleatorio);
            break;
        }
    }
}
