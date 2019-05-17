package views;

import javax.swing.*;
import java.awt.*;

public class GameLabel extends JLabel {

    public GameLabel(String text) {
        super(text);
        setPreferredSize(new Dimension(500, 100));
        setFont(new Font("SansSerif", Font.BOLD, 30));
        setVerticalAlignment(SwingConstants.CENTER);
    }
}