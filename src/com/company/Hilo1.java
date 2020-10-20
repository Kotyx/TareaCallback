package com.company;

public class Hilo1 extends Thread {
    ClasePrincipal clasePrincipal;
    public Hilo1(ClasePrincipal clasePrincipal){
        this.clasePrincipal=clasePrincipal;
    }

    @Override
    public void run() {
        try {
            System.out.println("Entro");
            sleep(2000);
            System.out.println("Salgo");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
