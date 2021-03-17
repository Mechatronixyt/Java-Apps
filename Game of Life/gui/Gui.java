package gui;

import draw.Draw;

import javax.swing.*;

public class Gui {
    JFrame jf;
    public static Draw d;

    public static final int WIDTH = 512, HEIGHT = 512, XOFF = 10, YOFF = 10;

    public void create(){
        jf = new JFrame("Game of Life");
        jf.setSize(550,570);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);

        d = new Draw();
        d.setBounds(0,0,550,570);
        d.setVisible(true);
        jf.add(d);

        jf.setVisible(true);

    }

}
