package lab5_miguelrojas;

public class Superheroes {
    
    Superpoderes spH = new Superpoderes();
    Superpoderes spH2 = new Superpoderes();
    Superpoderes spH3 = new Superpoderes();
    
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


    public Superpoderes getSpH() {
        return spH;
    }

    public void setSpH(Superpoderes spH) {
        this.spH = spH;
    }

    public Superpoderes getSpH2() {
        return spH2;
    }

    public void setSpH2(Superpoderes spH2) {
        this.spH2 = spH2;
    }

    public Superpoderes getSpH3() {
        return spH3;
    }

    public void setSpH3(Superpoderes spH3) {
        this.spH3 = spH3;
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
    
    
    
}
