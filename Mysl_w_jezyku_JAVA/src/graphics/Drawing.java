package graphics;

import javax.swing.*;
import java.awt.*;

public class Drawing extends Canvas{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mó rysunek");
        Canvas canvas = new Drawing();
        canvas.setSize(500,500);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    public void paint(Graphics g){
        g.fill3DRect(100,100,20,16, true);
    }
}
