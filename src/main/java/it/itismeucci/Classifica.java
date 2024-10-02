package it.itismeucci;

import java.util.ArrayList;

public class Classifica {
    public ArrayList<Integer> classifica;

    public Classifica() {
        this.classifica = new ArrayList<Integer>();
    }   

    synchronized public void finish(int n) {
        this.classifica.add(n);
    }

    @Override
    public String toString() {
        return this.classifica.toString();
    }
    
}
