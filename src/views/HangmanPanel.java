package views;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class HangmanPanel extends JPanel {
    private int _lines;
    private BufferedImage image;

    public HangmanPanel(int numOfLines) {
        _lines = numOfLines;
        setPreferredSize(new Dimension(350, 300));
    }

    public int get_lines() {
        return _lines;
    }

    public void set_lines(int lines) {
        _lines = lines;
    }

    public void addLine(){
        _lines++;
        try {
            image = ImageIO.read(new File("D:\\Repos\\Hangman\\src\\views\\" +_lines+".png"));
        } catch (IOException ex) {
            // handle exception...
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters
    }
}