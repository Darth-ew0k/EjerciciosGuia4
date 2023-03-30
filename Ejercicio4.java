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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero a verificar si es o no PRIMO.");
        int num = leer.nextInt();
       
        System.out.println(esPrimo(num));
        
        
    }
    
        public static boolean esPrimo (int num){
 
        //Un numero menor o igual que 1, no es primo.
        if (num<=1){
            return false;
        }
 
        //Declaramos esta variable aqui ya que despues es usada"
        int cont=0;
        for (int divisor=(int)Math.sqrt(num);divisor>1;divisor--){
            //contabilizados los divisibles"
                if (num%divisor==0){
                cont+=1;
            }
        }
        //Según el numero de divisibles es o no primo"
        if (cont>=1){
            return false;
        }else{
            return true;
        }
    }
    
}
