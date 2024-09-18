/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alumnocursoinscripcionabstractfactory;

/**
 *
 * @author Daniel
 */
public class CursoImpl implements Curso {
    @Override
    public double calcularCostoTotal(double costoPorClase, int totalClases) {
        return costoPorClase * totalClases;
    }

    @Override
    public int calcularDuracion(int clasesPorSemana, int semanas) {
        return clasesPorSemana * semanas;
    }

    @Override
    public int calcularCapacidadDisponible(int capacidadMaxima, int estudiantesInscritos) {
        return capacidadMaxima - estudiantesInscritos;
    }
}