package views;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class HangmanPanel extends JPanel {
    private int _lines;
    private BufferedImage _image;

    public HangmanPanel(int numOfLines, int size) {
        _lines = numOfLines;
        setPreferredSize(new Dimension(size, size * 3 / 5));
    }

    public int get_lines() {
        return _lines;
    }

    public void set_lines(int lines) {
        _lines = lines;
    }

    public void addLine(){
        _lines++;

    }

    @Override
    protected void paintComponent(Graphics g) {
        try {
            var workDir = System.getProperty("user.dir");
            _image = ImageIO.read(new File(workDir + "\\src\\views\\images\\" +_lines+".png"));
        } catch (IOException ex) {
            // handle exception...
        }

        super.paintComponent(g);
        var imageWidth = _image.getWidth();
        var imageHeight = _image.getHeight();
        var panelWidth = getWidth();
        var panelHeight = getHeight();

        var x = (panelWidth - imageWidth) / 2;
        var y = (panelHeight - imageHeight) / 2;

        g.drawImage(_image, x, y, this); // see javadoc for more info on the parameters
    }
}