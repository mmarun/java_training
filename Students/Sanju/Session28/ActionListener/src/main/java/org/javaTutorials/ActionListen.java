package org.javaTutorials;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ActionListen extends Frame implements ActionListener, WindowListener {

    TextField text=new TextField(20);
    Button b;
    private int clicks=0;

    public ActionListen(String title) {
        super(title);
        setLayout(new GridLayout());
        addWindowListener(this);
        b=new Button("Click Me");
        add(b);
        add(text);
        b.addActionListener(this);
    }




    @Override
    public void actionPerformed(ActionEvent e) {

        clicks++;
        text.setText( clicks + "   clicks");
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
