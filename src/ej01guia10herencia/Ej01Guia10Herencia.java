/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package ej01guia10herencia;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author Alumno
 */
public class Ej01Guia10Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1 = new Perro("mara", "pedigree razas pequeñas", "caniche", 3);
        Animal perro2 = new Perro("Toby", "pedigree", "callejero", 3);
        Animal gato1 = new Gato("michi", "purina cat chow", "carey", 5);
        Animal caballo1 = new Caballo("Spirit", "pasto", "percheron", 3);
        
        perro1.alimentarse();
        perro2.alimentarse();
        gato1.alimentarse();
        caballo1.alimentarse();
    }
    
}
