/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.alumnocursoinscripcionabstractfactory;

/**
 *
 * @author Daniel
 */
public interface Curso {
    double calcularCostoTotal(double costoPorClase, int totalClases);
    int calcularDuracion(int clasesPorSemana, int semanas);
    int calcularCapacidadDisponible(int capacidadMaxima, int estudiantesInscritos);
}