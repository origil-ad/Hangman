package views;

import javax.swing.*;
import java.awt.*;

public class HangmanPanel extends JPanel {
    private int _lines;

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
    }
}