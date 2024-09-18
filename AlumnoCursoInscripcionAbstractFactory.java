/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.alumnocursoinscripcionabstractfactory;

import java.time.LocalDate;

/**
 *
 * @author Daniel
 */
public class AlumnoCursoInscripcionAbstractFactory {

    public static void main(String[] args) {
      EscuelaFactory factory = new EscuelaFactoryImpl();

        // Creando Alumno
        Alumno alumno = factory.crearAlumno();
        double[] notas = {9, 8, 7, 10};
        System.out.println("Promedio del alumno: " + alumno.calcularPromedio(notas));
        System.out.println("Asistencia: " + alumno.calcularAsistencia(30, 28) + "%");
        System.out.println("Rendimiento: " + alumno.calcularRendimientoGeneral(alumno.calcularPromedio(notas)));

        // Creando Curso
        Curso curso = factory.crearCurso();
        System.out.println("Costo total del curso: " + curso.calcularCostoTotal(50, 10));
        System.out.println("Duración del curso en semanas: " + curso.calcularDuracion(2, 5));
        System.out.println("Capacidad disponible: " + curso.calcularCapacidadDisponible(30, 25));

        // Creando Inscripción
        Inscripcion inscripcion = factory.crearInscripcion();
        System.out.println("Costo de inscripción: " + inscripcion.calcularCostoInscripcion(500, 0.10));
        System.out.println("¿Hay cupo disponible? " + (inscripcion.verificarCupo(5) ? "Sí" : "No"));
        System.out.println("Fecha de finalización: " + inscripcion.calcularFechaFin(LocalDate.now(), 10));
    }
}