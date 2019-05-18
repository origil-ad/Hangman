package views;

import javax.swing.*;
import java.awt.*;

public class BankComboBox extends JComboBox {

    public BankComboBox(String[] values, int size) {
        super(values);
        setPreferredSize(new Dimension(size / 5, size / 5));
    }
}