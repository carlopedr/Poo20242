package herencia1;

public class Vehiculo {
    private String marca;
    private String color;
    
    public Vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }
    public Vehiculo() {
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public final void cambiarColor(String color){
        this.color=color;
    }
    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", color=" + color + "]";
    }

    

}
