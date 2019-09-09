package Main;
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Window extends Canvas{
    private static final long serialVersionUId = -240840600533728354L;
    public Window(int width, int height, String title, Game game){

        JFrame frame = new JFrame(title); // frame of our window

        frame.setPreferredSize(new Dimension(width,height));
        frame.setMaximumSize(new Dimension(width,height));
        frame.setMinimumSize(new Dimension(width,height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // actually closes the game when hitting red X
        frame.setResizable(false); // can you resize the window
        frame.setLocationRelativeTo(null); // starts window middle of screen
        frame.add(game); // adding the game class to the frame
        frame.setVisible(true); // so you can see it
        game.start(); // starts the game
    }
}
