package ar.com.xeven.crudrefugiospringrest.entities;

import javax.persistence.*;

@Entity
@Table(name="animales")
public class Animal {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer idanimal;
    protected String nombre;
    protected int edad;
    protected String color;

    public Animal() {
    }

    public Animal(Integer idanimal, String nombre, int edad, String color) {
        this.idanimal = idanimal;
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    public Animal(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "idanimal=" + idanimal +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                '}';
    }

    public Integer getIdanimal() {
        return idanimal;
    }

    public void setIdanimal(Integer idanimal) {
        this.idanimal = idanimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
