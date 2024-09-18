/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.alumnocursoinscripcionabstractfactory;

/**
 *
 * @author Daniel
 */
public interface Alumno {
    double calcularPromedio(double[] notas);
    int calcularAsistencia(int totalClases, int clasesAsistidas);
    String calcularRendimientoGeneral(double promedio);
}
