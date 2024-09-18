/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alumnocursoinscripcionabstractfactory;

/**
 *
 * @author Daniel
 */
public class EscuelaFactoryImpl implements EscuelaFactory {
    @Override
    public Alumno crearAlumno() {
        return new AlumnoImpl();
    }

    @Override
    public Curso crearCurso() {
        return new CursoImpl();
    }

    @Override
    public Inscripcion crearInscripcion() {
        return new InscripcionImpl();
    }
}