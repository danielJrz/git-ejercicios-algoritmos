/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alumnocursoinscripcionpoo;

/**
 *
 * @author Daniel
 */
public class Curso {
    public double calcularCostoTotal(double costoPorClase, int totalClases) {
        return costoPorClase * totalClases;
    }

    public int calcularDuracion(int clasesPorSemana, int semanas) {
        return clasesPorSemana * semanas;
    }

    public int calcularCapacidadDisponible(int capacidadMaxima, int estudiantesInscritos) {
        return capacidadMaxima - estudiantesInscritos;
    }
}
