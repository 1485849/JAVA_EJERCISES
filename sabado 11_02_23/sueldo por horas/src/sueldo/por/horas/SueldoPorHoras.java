/*
 * Click nbfs://nbhost/SystemFileSyst em/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sueldo.por.horas;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class SueldoPorHoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sueldoPorHoraStr = JOptionPane.showInputDialog(null, "Ingrese el sueldo por horas: ");
        double sueldoPorHora = Double.parseDouble(sueldoPorHoraStr);

        
        String numHijosStr = JOptionPane.showInputDialog(null, "Ingrese número de hijos: ");
        int numHijos = Integer.parseInt(numHijosStr);

        String tipoContrato = JOptionPane.showInputDialog(null, "Ingrese tipo de contrato (n/c/l/tp): ");

        
        double sueldoMensual;
        double seguroSalud;

        // sueldo mensual y seguro de salud con su tipo de contrato
        switch (tipoContrato) {
            case "n":
                sueldoMensual = sueldoPorHora * 8 * 30;
                seguroSalud = 150;
                break;
            case "c":
                sueldoMensual = sueldoPorHora * 8 * 30;
                seguroSalud = 100;
                break;
            case "l":
                sueldoMensual = sueldoPorHora * 8 * 30;
                seguroSalud = 50;
                break;
            case "tp":
                sueldoMensual = sueldoPorHora * 8 * 30;
                seguroSalud = 25;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Null");
                return;
        }

        
        double bonoHijos = 0;
        if (numHijos == 2) {
            bonoHijos = 0;
        } else if (numHijos > 2) {
            bonoHijos = 0;
        }

        
        sueldoMensual += bonoHijos;
        sueldoMensual -= seguroSalud;

       
        JOptionPane.showMessageDialog(null, "Sueldo mensual total: " + sueldoMensual);
    }
}
