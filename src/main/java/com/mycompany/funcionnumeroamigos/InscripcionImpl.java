/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alumnocursoinscripcionabstractfactory;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Daniel
 */
public class InscripcionImpl implements Inscripcion {
    @Override
    public double calcularCostoInscripcion(double costoCurso, double descuento) {
        return costoCurso - (costoCurso * descuento);
    }

    @Override
    public boolean verificarCupo(int capacidadDisponible) {
        return capacidadDisponible > 0;
    }

    @Override
    public LocalDate calcularFechaFin(LocalDate fechaInicio, int duracionSemanas) {
        return fechaInicio.plus(duracionSemanas, ChronoUnit.WEEKS);
    }
}
