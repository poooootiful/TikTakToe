import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.util.*;



public class TicTacToe extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JPanel Buttons = new JPanel();
    JPanel Panel = new JPanel();

    private String [] buttons = {"Tl","Tm","Tr","Ml","Mm","Mr","Bl","Bm","Br"};

    

    TicTacToe() {
        frame.setSize(500,600);
        Buttons.setLayout(new GridLayout(3, 3));
        frame.add(Buttons);
        Buttons.setSize(500,500);
        frame.add(Panel);
        Panel.setSize(500,100);

        for (String title:buttons) {
            JButton btn = new JButton(title);
            Buttons.add(btn);
            btn.addActionListener(this);
        }

        JButton reset = new JButton("Reset");
        Panel.add(reset);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
