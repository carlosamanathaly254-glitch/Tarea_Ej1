/*
Ejercicio 1 — Clase Mascota
Autor: Nathaly Carlosama

Enunciado: 
    Crea una clase llamada Mascota que represente una mascota sencilla.
*/

public class Mascota {
    String nombre;
    String especie;
    int edad;

    public Mascota(String nombre, String especie, int edad){
        this.nombre= nombre;
        this.especie= especie;
        this.edad= edad;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Especie: "+especie);
        System.out.println("Edad: "+edad);
    }
  
}
