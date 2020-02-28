package lab5_miguelrojas;

public class Superpoderes {
    
    private int nivel_poder;
    private String descripcion;
    private boolean mortal;

    public Superpoderes() {
    }

    public Superpoderes(int nivel_poder, String descripcion, boolean mortal) {
        this.nivel_poder = nivel_poder;
        this.descripcion = descripcion;
        this.mortal = mortal;
    }

    public int getNivel_poder() {
        return nivel_poder;
    }

    public void setNivel_poder(int nivel_poder) {
        this.nivel_poder = nivel_poder;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isMortal() {
        return mortal;
    }

    public void setMortal(boolean mortal) {
        this.mortal = mortal;
    }
    
    
    
}
