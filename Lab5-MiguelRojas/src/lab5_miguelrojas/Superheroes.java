package lab5_miguelrojas;

import java.util.ArrayList;

public class Superheroes {
    
    ArrayList<Superpoderes> listSuperpoderes = new ArrayList();
    
    private String nombre;
    private int edad;
    private String planeta_origen;
    private double altura;
    private int num_villanosCapturados;

    public Superheroes() {
    }

    public Superheroes(String nombre, int edad, String planeta_origen, double altura, int num_villanosCapturados) {
        this.nombre = nombre;
        this.edad = edad;
        this.planeta_origen = planeta_origen;
        this.altura = altura;
        this.num_villanosCapturados = num_villanosCapturados;
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

    public String getPlaneta_origen() {
        return planeta_origen;
    }

    public void setPlaneta_origen(String planeta_origen) {
        this.planeta_origen = planeta_origen;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getNum_villanosCapturados() {
        return num_villanosCapturados;
    }

    public void setNum_villanosCapturados(int num_villanosCapturados) {
        this.num_villanosCapturados = num_villanosCapturados;
    }

    public ArrayList<Superpoderes> getListSuperpoderes() {
        return listSuperpoderes;
    }

    public void setListSuperpoderes(ArrayList<Superpoderes> listSuperpoderes) {
        this.listSuperpoderes = listSuperpoderes;
    }

    @Override
    public String toString() {
        return  nombre + "-" + edad + "-" + planeta_origen;
    }
    
    
    
}
