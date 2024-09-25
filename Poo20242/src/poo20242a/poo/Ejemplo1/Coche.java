package poo20242a.poo.Ejemplo1;

public class Coche {
    //Atributos
    public String marca;
    public String color;
    public String matricula;
    public int cilindrada;
    
    //Métodos
    //Visibilidad Retorno nombreMétodo (argumentos)

    public void decirSiEsMetalizado(){
        if(color.equals("Negro")){
            System.out.println("Color metalizado");}
        else{
            System.out.println("Color NO metalizado");

        }
    }

    public void matricularCoche(String matricula){
        this.matricula=matricula;
    }
    
    public String decirMarca(){
        return this.marca;

    }

}
