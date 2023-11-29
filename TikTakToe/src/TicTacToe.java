import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JPanel Buttons = new JPanel();

     int Turn;

     int XTurn;

     int OTurn;

     JButton Tr = new JButton();
     JButton Tm = new JButton();
     JButton Tl = new JButton();
     JButton Mr = new JButton();
     JButton Mm = new JButton();
     JButton Ml = new JButton();
     JButton Br = new JButton();
     JButton Bm = new JButton();
     JButton Bl = new JButton();


     public static void RandomTurn () {
         int Xturn = 1;
         int Oturn =2;

         int number = 2;

         if (number == Xturn) {
             System.out.println("It's X turn");
         }else if (number == Oturn) {
             System.out.println("It's O Turn");
         }
    }

    TicTacToe() {
        frame.setSize(500,700);
        JPanel Text = new JPanel();
        Buttons.setLayout(new GridLayout(3, 3));
        frame.add(Buttons);
        Buttons.setSize(500,500);
        JPanel Panel = new JPanel();
        frame.add(Panel);
        Panel.setSize(500,100);
        Text.setSize(500,100);
        frame.add(Text);

        JLabel text = new JLabel();
        Text.add(text);
        RandomTurn (); 

        Turn = 1;
        XTurn = 1;
        OTurn = 2;

        Buttons.add(Tr);
        Tr.addActionListener(this);




        JButton reset = new JButton("Reset");
        Panel.add(reset);
        frame.setVisible(true);


    }




    @Override
    public void actionPerformed(ActionEvent e) {

    }
}