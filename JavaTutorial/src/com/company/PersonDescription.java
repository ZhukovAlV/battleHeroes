package com.company;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class PersonDescription extends JFrame {
    private JPanel panel;
    private JLabel nameLabel;
    private JLabel powerLabel;
    private JLabel agilityLabel;
    private JLabel intelligenceLabel;
    private JLabel nameValue;
    private JLabel powerValue;
    private JLabel agilityValue;
    private JLabel intelligenceValue;
    private JLabel imageLabel;
    private JLabel positionValue;
    private JLabel positionLabel;
    private JTextArea superPowerValue;
    private JLabel superPowerLabel;

    public PersonDescription(String title) {
        setTitle(title);
        setContentPane(panel);
/*        getContentPane().add(BorderLayout.NORTH, new Label(title));
        getContentPane().add(BorderLayout.CENTER,panel);*/
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,200,600,370);

        ImageIcon image = new ImageIcon("resource/ironMan.png");
        imageLabel.setIcon(image);

    }

    public void setNameValue(String str) {
        nameValue.setText(str);
    }

    public void setPowerValue(String str) {
        powerValue.setText(str);
    }

    public void setAgilityValue(String str) {
        agilityValue.setText(str);
    }

    public void setIntelligenceValue(String str) {
        intelligenceValue.setText(str);
    }

    public void setPositionValue(String str) {
        positionValue.setText(str);
    }

    public void setSuperPowerValue(String str) {
        superPowerValue.setFont(new Font("Arial", Font.BOLD, 12));
        superPowerValue.setText(str);
    }
}
