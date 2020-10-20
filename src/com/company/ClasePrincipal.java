package com.company;

public class ClasePrincipal{
    public ClasePrincipal() {
        System.out.println("Clase principal entro");
        Hilo1 t1 = new Hilo1(this);
        t1.start();
        System.out.println("Clase principal salgo");
    }

    public void decirHola(){
        System.out.println("Hola");
    }
}
