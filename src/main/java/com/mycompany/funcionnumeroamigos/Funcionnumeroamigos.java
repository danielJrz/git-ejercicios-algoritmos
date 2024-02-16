/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcionnumeroamigos;

import java.util.Scanner;

/**
 *
 * @author Daniel Jerez Mayorga
 */
public class Funcionnumeroamigos {

    public static void main(String[] args) {
        int num1;
        int num2;
        
        Scanner ingresoteclado=new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1=ingresoteclado.nextInt();
         System.out.println("Ingrese el segundo numero: ");
        num2=ingresoteclado.nextInt();
        
        
        if (sonAmigos(num1, num2)) {
            System.out.println(num1 + " y " + num2 + " son números amigos.");
        } else {
            System.out.println(num1 + " y " + num2 + " no son números amigos.");
        }
    }    
   

    // Función para obtener la suma de los divisores propios de un número
    public static int sumaDivisores(int num) {
        int suma = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    // Función para verificar si dos números son amigos
    public static boolean sonAmigos(int num1, int num2) {
     
       
       boolean amigos=true;
       
       if(sumaDivisores(num1) == num2 && sumaDivisores(num2) == num1){
       
           amigos=true;
       }
       else {
       amigos=false;
       }
       
       return amigos;
    }
    }


   

  
        
