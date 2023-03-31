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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, num1;
        boolean stop;
        
        System.out.println("Ingrese dos numeros enteros:");
        System.out.println("Primer valor: ");
        num = leer.nextInt();
        System.out.println("Segundo valor: ");
        num1 = leer.nextInt();
        stop = true;
        
        do {
        System.out.println("*****MENU*****");
        System.out.println("1 - SUMA");
        System.out.println("2 - RESTA");
        System.out.println("3 - MULTIPLICAR");
        System.out.println("4 - DIVIDIR");
        System.out.println("5 - SALIR");
        System.out.println("-----o-----");
        System.out.println("Ingrese una opcion:");
        int menu = leer.nextInt();
        do {
        switch (menu) {
            

            case 1: {
                int suma = num + num1;
                System.out.println("*************************");
                System.out.println("El valor de la SUMA es: "+ suma(num, num1));
                System.out.println("*************************");
                break;
            }
            case 2: {
                int resta = num - num1;
                System.out.println("*************************");
                System.out.println("El valor de la RESTA es: "+ resta(num, num1));
                System.out.println("*************************");
                break;
            }
            case 3: {
                int multip = num * num1;
                System.out.println("*************************");
                System.out.println("El valor de la MULTIPLICACION es: "+ multip(num, num1));
                System.out.println("*************************");
                break;
            }
            case 4: {
                int div = num / num1;
                System.out.println("*************************");
                System.out.println("El valor de la DIVISION es: "+ div(num, num1));
                System.out.println("*************************");
                break;
            }
            case 5: {
                System.out.println("------------------------------------");
                System.out.println("Desea salir al menu principal? (S/N)");
                System.out.println("------------------------------------");
                 String opc = leer.next();
                if (("s".equalsIgnoreCase(opc))) {
                    System.out.println("------------------------------------");
                    System.out.println("Has salido satisfactoriamente.");
                    System.out.println("------------------------------------");
                    stop = false;
                } else if ("n".equalsIgnoreCase(opc)) {
                    System.out.println("*************************");
                    System.out.println("Volviendo al menu.");
                    System.out.println("*************************");
                    stop = true;

                }        
            }
            default: {
                if (menu >5) {
                System.out.println("*********************************************");
                System.out.println("Opcion invalida, ingrese un numero del 1 al 5");
                System.out.println("*********************************************");
            }
            }

        }
        break;
        } while (menu > 0 || menu < 6);
        } while (stop==true);
    }
     
 public static int suma (int num, int num1){  

   int resultado = num+num1;
   
   return resultado;
           

 }
 
 public static int resta (int num, int num1){
 
 int resultado = num-num1;
 
 return resultado;

 }
 public static int multip (int num, int num1){
 
 int resultado = num*num1;
 
 return resultado;

 }
public static int div (int num, int num1){

int resultado = num/num1;

return resultado;

}
}
    
