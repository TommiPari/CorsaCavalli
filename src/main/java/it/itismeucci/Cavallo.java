package it.itismeucci;

public class Cavallo extends Thread {
    private int numero;
    private Classifica c;
    private final int lung = 100;

    public Cavallo(int n, Classifica c) {
        this.numero = n;
        this.c = c;
    }

    public void run() {
        for (int i=0; i<lung; i++) {
            try {
                Thread.sleep((int)Math.random()*100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.c.finish(this.numero);
    }

    
}