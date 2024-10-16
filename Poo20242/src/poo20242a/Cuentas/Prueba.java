package Cuentas;

public class Prueba {
    public static void main(String[] args) {
        Persona cl =new Persona("Carlos","123");
        Cuenta c=new Cuenta(123456,cl);
        System.out.println(c.toString());
        c.ingresar(100);
        System.out.println(c.toString());
        c.ingresar(0);
        System.out.println(c.toString());
        c.retirar(50);
        System.out.println(c.toString());
        c.retirar(0);
        System.out.println(c.toString());
        c.retirar(80);
        System.out.println(c.toString());

    }

}
