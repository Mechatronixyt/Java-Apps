package game;

import java.util.concurrent.ThreadLocalRandom;

public class GM {

    public static final int CELLCOUNT = 512;
    public static boolean[][] cells = new boolean[CELLCOUNT][CELLCOUNT];

    int startCells = 10000;
    static int gen = 0;

    public void setup() {
        for (int i = 0; i < startCells; i++) {
            int x = r(0, CELLCOUNT);
            int y = r(0, CELLCOUNT);

            cells[x][y] = true;
        }
    }

    public static void nextGen() {
        gen++;
        System.out.println("Generation: " + gen);

        for (int x = 0; x < CELLCOUNT; x++) {
            for (int y = 0; y < CELLCOUNT; y++) {
                int n = neighbours(x, y);

                //Regel 1: Wiederbeleben
                if (n == 3 && !cells[x][y]) {
                    cells[x][y] = true;
                }

                //Regel 2: Unterbevölkerung
                if (n < 2) {
                    cells[x][y] = false;
                }

                //Regel 3: Am Leben bleiben
                if (n == 2 || n == 3) {
                    //Zelle bleibt unverändert
                }

                //Regel 4: Überbevölkerung
                if (n > 3) {
                    cells[x][y] = false;
                }
            }
        }

    }

    public static int neighbours(int x, int y) {
        int count = 0;
        //Anfang mitte rechts, Uhrzeigersinn
        int[] xoff = {1, 1, 0, -1, -1, -1, 0, 1};
        int[] yoff = {0, 1, 1, 1, 0, -1, -1, -1};

        for (int i = 0; i < 8; i++) {
            try {
                if (cells[x + xoff[i]][y + yoff[i]]) count++;
            } catch (Exception e) {

            }
        }
        return count;
    }

    public static int r(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}
