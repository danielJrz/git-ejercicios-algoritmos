/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alumnocursoinscripcionpoo;

/**
 *
 * @author Daniel
 */
import java.time.LocalDate; // Esta línea importa la clase LocalDate, que se utiliza para manejar fechas sin incluir tiempo (horas, minutos, etc.
import java.time.temporal.ChronoUnit; //Esta línea importa ChronoUnit, que permite manipular unidades de tiempo, como días, semanas, meses, etc

public class Inscripcion {
    public double calcularCostoInscripcion(double costoCurso, double descuento) {
        return costoCurso - (costoCurso * descuento);
    }

    public boolean verificarCupo(int capacidadDisponible) {
        boolean capacidadexistente;
        
         if (capacidadDisponible > 0){
   capacidadexistente= true;
    }else{
          capacidadexistente= false;   
    }          
         
         return capacidadexistente;
    }

    public LocalDate calcularFechaFin(LocalDate fechaInicio, int duracionSemanas) {
        return fechaInicio.plus(duracionSemanas, ChronoUnit.WEEKS);
        //. plus me permite sumar cantidad de tiempo El uso de ChronoUnit.WEEKS indica que las semanas deben ser sumadas a la fecha fechaInicio. Si, por ejemplo, duracionSemanas es 4, el método sumará 4 semanas a la fecha de inicio.
    }
}