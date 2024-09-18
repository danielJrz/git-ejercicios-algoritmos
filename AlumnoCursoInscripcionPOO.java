/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.alumnocursoinscripcionpoo;

import java.time.LocalDate;

/**
 *
 * @author Daniel
 */
public class AlumnoCursoInscripcionPOO {

    public static void main(String[] args) {
      
        Alumno alumno = new Alumno();
        double[] notas = {9, 8, 7, 10};
        System.out.println("Promedio del alumno: " + alumno.calcularPromedio(notas));
        System.out.println("Asistencia: " + alumno.calcularAsistencia(30, 28) + "%");
        System.out.println("Rendimiento: " + alumno.mostrarRendimientoGeneral(alumno.calcularPromedio(notas)));

        // Curso
        Curso curso = new Curso();
        int capacidad = curso.calcularCapacidadDisponible(30, 25);
        System.out.println("Costo total del curso: " + curso.calcularCostoTotal(50, 10));
        System.out.println("Duración del curso en semanas: " + curso.calcularDuracion(2, 5));
        System.out.println("Capacidad disponible: " + capacidad);

        // Inscripción
        Inscripcion inscripcion = new Inscripcion();
        System.out.println("Costo de inscripción: " + inscripcion.calcularCostoInscripcion(500, 0.10));
        System.out.println("¿Hay cupo disponible? " + (inscripcion.verificarCupo(capacidad) ? "Sí" : "No"));
        System.out.println("Fecha de finalización: " + inscripcion.calcularFechaFin(LocalDate.now(), 10)); 
        
        
        
    }
}
