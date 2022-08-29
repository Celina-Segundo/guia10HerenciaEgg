/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Alumno
 */
public class Caballo extends Animal {

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }
    
    @Override
    public void alimentarse() {
        System.out.println("El caballo se alimenta con: " + alimento);
    }
    
}
