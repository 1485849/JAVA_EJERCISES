/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ahorasi;
 import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Alumno
 */
public class Ahorasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada=new Scanner(System.in);
 
		String txt = JOptionPane.showInputDialog("ingrese el limite");
                int limite = Integer.parseInt(txt);
                txt = JOptionPane.showInputDialog("Ingrese N°1");
                int numero1= Integer.parseInt(txt);
                txt = JOptionPane.showInputDialog("Ingrese N°2");
                int numero2= Integer.parseInt(txt);
                 for ( int i=0;i<limite;i++){
                     System.out.println(Aleatorio(numero1,numero2));
                 }}
    public static int Aleatorio(int num1,int num2){
        return ((int)Math.ceil(Math.random()*(num2-num1)+num1));    
    }
    
}