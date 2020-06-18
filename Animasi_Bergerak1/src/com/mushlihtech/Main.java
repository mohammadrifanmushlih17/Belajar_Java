package com.mushlihtech;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    JPanel PanelKonten;
    JLabel LabelGambar = new JLabel();
    JLabel HeaderLabel = new JLabel();

    public Main(){
        try {

            setDefaultCloseOperation(EXIT_ON_CLOSE);
            PanelKonten = (JPanel) getContentPane();
            PanelKonten.setLayout(new BorderLayout());
            setSize(new Dimension(500, 500));
            setTitle("AnimasiGIF");
            GraphicsEnvironment graphicsEnvironment;
//            HeaderLabel.setFont(new java.awt.Font("arial, 16, 16"));
            HeaderLabel.setText("MushlihTech Foundation");
            PanelKonten.add(HeaderLabel, BorderLayout.NORTH);
            ImageIcon Icon = new ImageIcon(this.getClass().getResource("abc.gif"));
            LabelGambar.setIcon(Icon);
            PanelKonten.add(LabelGambar, BorderLayout.CENTER);
            this.setLocationRelativeTo(null);
            this.setVisible(true);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new Main();

    }
}
