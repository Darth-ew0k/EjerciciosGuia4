/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia4;

import java.util.Scanner;

/**
 *
 * @author lily1
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        String nombre = "";
        String opc = "";
        boolean y = true;
        
        int edad = 0;
            do {
                
                nombre = Nombre(nombre, opc);
                
                edad = Edad(edad, opc, nombre);
                
                System.out.println("Quiere ingresar otra persona?(Si/No)");
                opc = leer.nextLine();
                opc = opc.toLowerCase();
                if (opc=="no"){
                    y=false;
                    break;
                }
            } while (opc.equals("si"));

    }
    public static String Nombre (String nombre, String opc){
        Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese el nombre de la persona");
            nombre = leer.nextLine();
            
        return nombre;
    }
    
    
    public static int Edad(int edad, String opc, String nombre) {
        Scanner leer = new Scanner(System.in);

            System.out.println("Ingrese la edad de la persona");

            edad = leer.nextInt();
            
            if (edad < 18) {
                System.out.println(nombre+" es menor de edad.");
            }else{
                System.out.println(nombre+" es mayor de edad.");
            }
        return edad;
    }
    
    
    
}
