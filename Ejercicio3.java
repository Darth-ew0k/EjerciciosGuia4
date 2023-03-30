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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de Euros que quiere convertir");
        int num = leer.nextInt();

        
        System.out.println("1 - Convertir a Libras");
        System.out.println("2 - Convertir a Yenes");
        System.out.println("3 - Convertir a Dolares");
        
        
        System.out.println("Ingrese a la divisa que desea convertir sus Euro:");
        int opc = leer.nextInt();
        
        switch(opc){
            
            case 1 : {cambioDiv(num, opc);
            break;
            }
            case 2 : {cambioDiv(num, opc);
            break;
            }
            case 3 : {cambioDiv(num, opc);
            break;
            }
        
        }
              
        
    }
    
    
    public static void cambioDiv (int num, int opc){
    
        if (opc==1){
            double cambio = num*0.86;
            System.out.println("Total: "+ num +" cambio a Libras TOTAL: "+ cambio);
        }
        if (opc==2){
            double cambio2 = num*129.852; ;
            System.out.println("Total: "+ num +" cambio a Yenes TOTAL: "+ cambio2);
        }
        if(opc==3){
            double cambio1 = num*1.28611;
            System.out.println("Total: "+ num +" cambio a Dolares TOTAL: "+ cambio1);
        }
       
    }        
    
}
