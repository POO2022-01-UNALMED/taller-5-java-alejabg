package gestion;

import zooAnimales.Animal;

import java.util.ArrayList;

public class Zona{
    private String nombre;
    private Zoologico zoo;
    private static ArrayList<Animal> animales = new ArrayList<Animal>();

    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public Zona(){};

    public void agregarAnimales(Animal animal){
        animales.add(animal);
    }

    public static int cantidadAnimales(){
		return Zona.animales.size();
	}

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public Zoologico getZoo(){
        return zoo;
    }
    public void setZoo(Zoologico zoo){
        this.zoo = zoo;
    }
    
    public static ArrayList<Animal> getAnimales(){
        return animales;
    }
    public static void setAnimales(ArrayList<Animal> animales){
        Zona.animales = animales;
    }
}
