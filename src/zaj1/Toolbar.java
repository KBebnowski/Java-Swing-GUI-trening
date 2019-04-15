package zaj1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {

    private JButton helloButton;
    private JButton goodbyeButton;

    private StringListener textListener;

    public Toolbar(){
        helloButton = new JButton("Hello");
        goodbyeButton = new JButton("Goodbye");

        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloButton);
        add(goodbyeButton);
    }

    public void setStringListener(StringListener listener){
                textListener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton click = (JButton) e.getSource();

        if(click == helloButton) {
            if(textListener != null)
                textListener.textEmitted("Hello \n");
        }
        else if (click == goodbyeButton)
            if(textListener != null)
                textListener.textEmitted("Goodbye \n");
    }
}
