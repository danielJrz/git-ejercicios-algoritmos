/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alumnocursoinscripcionpoo;

/**
 *
 * @author Daniel
 */
public class Alumno {  //Declaracion de la clase publica cualquier otra clase accede
    
    public double calcularPromedio(double[] notas) { //metodo publico accesible desde cualquier lugar recibe como parametro un arreglo y devuelve un doble
        double suma = 0; // variable double para devolver la suma de notas y calcular el promedio
       for (int i = 0; i < notas.length; i++) { // rrecorrer el arreglo y almacenarno en la variable nota temporalmente
        suma += notas[i];  // Accede a cada elemento del arreglo mediante el índice
    }
        return suma / notas.length; // retorno el valor
    }

    public int calcularAsistencia(int totalClases, int clasesAsistidas) { //devuelve el entero que representa el porcentaje
        return (clasesAsistidas * 100) / totalClases;
    }

    public String mostrarRendimientoGeneral(double promedio) { // Este método realiza una evaluación simple del rendimiento del alumno en función de su promedio
        if (promedio >= 9){ 
            return "Excelente";
        }else if (promedio >= 7) {
            return "Bueno";
        }else 
            return "Necesita mejorar";
    }
}