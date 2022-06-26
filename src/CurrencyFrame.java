import javax.swing.*;
import java.awt.*;

public class CurrencyFrame {
    public static void createAndShowGUI() {
        // Variables declaration
        String[] currencies = {"USD", "EUR"};

        JFrame frame = new JFrame("USD Converter");
        JButton convertButton = new JButton("Convert");
        JTextField amountField = new JTextField(10);
        JTextField convertedField = new JTextField(10);
        JComboBox currencyCombo = new JComboBox(currencies);

        // Button
        Dimension buttonSize = convertButton.getPreferredSize();
        frame.add(convertButton);

        // amountField
        Dimension fieldSize = amountField.getPreferredSize();
        frame.add(amountField);

        // convertedField
        Dimension convertedSize = convertedField.getPreferredSize();
        frame.add(convertedField);

        // currencyCombo
        Dimension comboSize = currencyCombo.getPreferredSize();
        frame.add(currencyCombo);

        // Frame Visibility and Layout
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 80);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setIconImage(new ImageIcon("src/images/currency.png").getImage());

        // Action Listeners & While Active
        while(frame.isVisible()) {
            if(currencyCombo.getSelectedItem().equals("USD")) {
                //double usdAmount = Double.parseDouble(amountField.getText());
                convertedField.setText("$" + amountField.getText());
            } else {
                if (amountField.getText().equals("")) {
                    convertedField.setText("");
                }
                else {
                    double amount = Double.parseDouble(String.valueOf(amountField.getText())) * 0.95;
                    convertedField.setText("€" + amount);
                }
            }
        }
    }
}
