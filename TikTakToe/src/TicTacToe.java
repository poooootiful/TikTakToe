import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JPanel Buttons = new JPanel();
    JPanel Panel = new JPanel();

     String [] buttons = {"Tl","Tm","Tr","Ml","Mm","Mr","Bl","Bm","Br"};

     JButton bth = new JButton();

     int Turn;

     int XTurn;

     int OTurn;

    TicTacToe() {
        frame.setSize(500,600);
        Buttons.setLayout(new GridLayout(3, 3));
        frame.add(Buttons);
        Buttons.setSize(500,500);
        frame.add(Panel);
        Panel.setSize(500,100);

        if (Turn==XTurn) {
            bth.setText("X");
            Turn = Turn+1;
        }

        if (Turn==OTurn) {
            bth.setText("O");
            Turn = Turn+1;
        }


        //for (String title:buttons) {
           // JButton btn = new JButton(title);
           // Buttons.add(btn);
          //  btn.addActionListener(this);
        //}


        JButton reset = new JButton("Reset");
        Panel.add(reset);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}