package views;

import javax.swing.*;
import java.awt.*;

public class WordLabel extends JLabel {

    public WordLabel(String text, int size) {
        super(text, SwingConstants.CENTER);
        setPreferredSize(new Dimension(size, size / 5));
        setFont(new Font("SansSerif", Font.BOLD, 30));
    }
}