package zaj1;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.Savepoint;

public class interfejs {
    private JPanel SaveAndRead;


    public interfejs() {
            };

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame();
            }
        });




    }
}
