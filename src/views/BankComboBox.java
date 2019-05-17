package views;

import javax.swing.*;
import java.awt.*;

public class BankComboBox extends JComboBox {

    public BankComboBox(String[] values) {
        super(values);
        setPreferredSize(new Dimension(150, 300));
    }
}