package it.itismeucci;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Cavallo> cavalli = new ArrayList<Cavallo>();
        Classifica classifica = new Classifica();
        for (int i=1; i<=10; i++) {
            Cavallo c = new Cavallo(i,classifica);
            cavalli.add(c);
        }
        for (Cavallo c : cavalli) {
            c.start();
        }
        for (Cavallo c : cavalli) {
            c.join();
        }
        System.out.println(classifica);
    }
}