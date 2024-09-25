package poo2024b.Coches;

public class Coche {
    //Atributos
    public String marca;
    public String color;
    public String matricula;
    public int cilindrada;

    //Métodos
    //Visibilidad Retorno nombreMetodo(<Argumentos>)
    public void decirSiEsMetalizado(){
        if(color.equals("Negro")){
            System.out.println("Es metalizado");
        }
        else{
            System.out.println("No es metalizado");
        }

    }

    public int decirCilindrada(){
        return cilindrada;
    }

    public void cambiarColor(String color){
        this.color=color;
    }

}
