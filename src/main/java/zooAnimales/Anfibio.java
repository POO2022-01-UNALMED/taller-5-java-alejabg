package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{
    
    private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
    public static int ranas;
    public static int salamandras;
    private boolean venenoso;
    private String colorPiel;

    public Anfibio(String nombre, int edad, String habitat, String genero, boolean venenoso, String colorPiel){
        super(nombre, edad, habitat, genero);
        this.venenoso = venenoso;
        this.colorPiel = colorPiel;
        listado.add(this);
    }
   
    public Anfibio(){listado.add(this);};

    public String movimiento(){
        return "saltar";
    }

    public static int cantidadAnfibios(){
		return listado.size();
	}

    public static Anfibio crearRana(String nombre, int edad, String genero){
		Anfibio.ranas++;
		return new Anfibio(nombre, edad, "selva", genero, true, "rojo");
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad,  String genero){
		Anfibio.salamandras++;
		return new Anfibio(nombre, edad, "selva", genero, false, "negro y amarillo");
	} 

    public static ArrayList<Anfibio> getListado(){
        return listado;
    }
    public static void setListado(ArrayList<Anfibio> listado){
        Anfibio.listado = listado;
    }

    public static int getRanas(){
        return ranas;
    }
    public static void setRanas(int ranas){
       Anfibio.ranas = ranas;
    }
    
    public static int getSalamandras(){
        return salamandras;
    }
    public static void setSalamandras(int salamandras){
        Anfibio.salamandras = salamandras;
    }

    public String getColorPiel(){
        return colorPiel;
    }
    public void setColorPiel(String colorPiel){
        this.colorPiel = colorPiel;
    }

    public boolean getVenenoso(){
        return venenoso;
    }
    public void setVenenoso(boolean venenoso){
        this.venenoso = venenoso;
    }
}

