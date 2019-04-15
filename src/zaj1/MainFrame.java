package zaj1;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private TextPanel textPanel;         //tworzenie zmiennych
    private Toolbar toolbar;

    public MainFrame(){
        super("Hello World");     //dziedziczy konstruktory po JFrame

        setLayout(new BorderLayout());

        toolbar = new Toolbar();
        textPanel = new TextPanel();


        toolbar.setStringListener(new StringListener() {
            public void textEmitted(String text) {
                System.out.println(text);               //wyswietla w konsoli
                textPanel.appendText(text);             //wyswietla w interfejsie

            }
        });


        add(textPanel, BorderLayout.CENTER);
        add(toolbar, BorderLayout.NORTH);


        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //konczy dzialanie programu po zamknieciu okna
        setVisible(true);
    }
}
