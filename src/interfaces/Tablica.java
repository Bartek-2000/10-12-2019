package interfaces;

public class Tablica implements Interfaces {
    @Override
    public void addSth(int[] table) {
        for (int i = 0; i < table.length; i++) {
            table[i] += 10;

        }
    }
}