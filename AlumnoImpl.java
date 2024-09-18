/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alumnocursoinscripcionabstractfactory;

/**
 *
 * @author Daniel
 */
public class AlumnoImpl implements Alumno {
    @Override
    public double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    @Override
    public int calcularAsistencia(int totalClases, int clasesAsistidas) {
        return (clasesAsistidas * 100) / totalClases;
    }

    @Override
    public String calcularRendimientoGeneral(double promedio) {
        if (promedio >= 9) return "Excelente";
        else if (promedio >= 7) return "Bueno";
        else return "Necesita mejorar";
    }
}
