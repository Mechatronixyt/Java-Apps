package actions;

import game.GM;
import game.GameClock;
import gui.Gui;

public class Main {

    public static void main(String[] args) {
        Gui g = new Gui();
        GM gm = new GM();
        GameClock gc = new GameClock();

        gm.setup();
        g.create();
        gc.start();
    }

}
