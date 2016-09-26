package bioinformatica;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class App extends JFrame{
    private JPanel contentPanel;
    App(){
        contentPanel =new JPanel();
        config();
    }
    private void config(){
        contentPanel.setLayout(null);
        setContentPane(contentPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 850, 400);
    }        
            
}
