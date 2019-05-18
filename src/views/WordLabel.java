package views;

import javax.swing.*;
import java.awt.*;

public class WordLabel extends JLabel {

    public WordLabel(String text) {
        super(text, SwingConstants.CENTER);
        setPreferredSize(new Dimension(500, 100));
        setFont(new Font("SansSerif", Font.BOLD, 30));
    }
}