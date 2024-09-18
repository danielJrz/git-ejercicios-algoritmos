/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.alumnocursoinscripcionabstractfactory;

import java.time.LocalDate;

/**
 *
 * @author Daniel
 */
public interface Inscripcion {
    double calcularCostoInscripcion(double costoCurso, double descuento);
    boolean verificarCupo(int capacidadDisponible);
    LocalDate calcularFechaFin(LocalDate fechaInicio, int duracionSemanas);
}
