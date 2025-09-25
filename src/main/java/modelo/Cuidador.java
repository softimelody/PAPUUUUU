/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Santo Tomas
 */
public class Cuidador {
    public int id;
    public String nombre; // min 3 max 15, requerido
    public String run;
    public int edad;
    
    public Cuidador (){}    
    public Cuidador(int id, String nombre, String run, int edad) {
        this.id = id;
        setNombre(nombre);
        this.run = run;
        this.edad = edad;
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRun() {
        return run;
    }

    public int getEdad() {
        return edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        
        if (nombre.trim().isEmpty() || nombre == null){
            System.out.println("ERROR,nombre vacio");
        }
        if (nombre.length() >= 3 && nombre.length ()<=33){
            this.nombre = nombre;}
        else {
                    System.out.println("Error, Nombre no valido");
                    }
    
        this.nombre = nombre;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cuidador{" + "id=" + id + ", nombre=" + nombre + ", run=" + run + ", edad=" + edad + '}';
    }
    


    
    
}
