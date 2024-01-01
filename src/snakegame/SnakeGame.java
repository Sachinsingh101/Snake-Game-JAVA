
package snakegame;

import  javax.swing.*;
import java.awt.*;

public class SnakeGame extends JFrame {
    SnakeGame(){
//        setSize(, HEIGHT);
//        setLocation(100,100);
        super("Snake Game");
        add(new Board());
        pack();
        setSize(300,300);
        setLocationRelativeTo(null);
        setBackground(Color.BLACK);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SnakeGame();    
    }
    
}
