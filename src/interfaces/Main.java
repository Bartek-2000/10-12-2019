package interfaces;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] table = new int[6];

        for(int i=0;i<table.length; i++){
            table[i]=2;
    }
        Interfaces i = new Tablica();
        Interfaces i2 = new Tablica2();
        System.out.println("Tablica etap 1: "+ Arrays.toString(table));
        i.addSth(table);
        System.out.println("Tablica etap 2: "+ Arrays.toString(table));
        i2.addSth(table);
        System.out.println("Tablica etap 3: "+ Arrays.toString(table));

    }
}
