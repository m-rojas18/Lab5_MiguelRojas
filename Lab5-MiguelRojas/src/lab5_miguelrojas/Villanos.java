package lab5_miguelrojas;

import java.util.ArrayList;

public class Villanos {
    
    ArrayList<Superpoderes> listSuperpoderes = new ArrayList();
    private String nombre;
    private int edad;
    private String planeta_origenV;
    private double altura_villain;
    private boolean atrapado;
    private int num_muertes;
    
    public Villanos(){
        
    }

    public Villanos(String nombre, int edad, String planeta_origenV, double altura_villain, boolean atrapado, int num_muertes) {
        this.nombre = nombre;
        this.edad = edad;
        this.planeta_origenV = planeta_origenV;
        this.altura_villain = altura_villain;
        this.atrapado = atrapado;
        this.num_muertes = num_muertes;
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

    public String getPlaneta_origenV() {
        return planeta_origenV;
    }

    public void setPlaneta_origenV(String planeta_origenV) {
        this.planeta_origenV = planeta_origenV;
    }

    public double getAltura_villain() {
        return altura_villain;
    }

    public void setAltura_villain(double altura_villain) {
        this.altura_villain = altura_villain;
    }

    public boolean isAtrapado() {
        return atrapado;
    }

    public void setAtrapado(boolean atrapado) {
        this.atrapado = atrapado;
    }

    public int getNum_muertes() {
        return num_muertes;
    }

    public void setNum_muertes(int num_muertes) {
        this.num_muertes = num_muertes;
    }

    public ArrayList<Superpoderes> getListSuperpoderes() {
        return listSuperpoderes;
    }

    public void setListSuperpoderes(ArrayList<Superpoderes> listSuperpoderes) {
        this.listSuperpoderes = listSuperpoderes;
    }
    
    
    
    
    
}
