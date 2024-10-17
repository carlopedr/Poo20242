package Cuentas;

public class Prueba {
    public static void main(String[] args) {
        Persona p = new Persona("Pedro","123456");
        Cuenta c = new Cuenta(987654,p);
        System.out.println(c.toString());
        c.ingresar(100);
        System.out.println(c.toString());
        c.ingresar(-100);
        System.out.println(c.toString());
        c.retirar(50);
        System.out.println(c.toString());
        c.retirar(80);
        System.out.println(c.toString());
        c.retirar(-80);
        System.out.println(c.toString());
    }

}
