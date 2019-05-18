package views;

import javax.swing.*;
import java.awt.*;

class BankComboBox extends JComboBox {

    BankComboBox(String[] values, int size) {
        super(values);
        setPreferredSize(new Dimension(size / 5, size / 10));
    }
}