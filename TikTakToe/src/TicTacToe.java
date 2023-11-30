import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JPanel Buttons = new JPanel();

     JButton Tr = new JButton();
     JButton Tm = new JButton();
     JButton Tl = new JButton();
     JButton Mr = new JButton();
     JButton Mm = new JButton();
     JButton Ml = new JButton();
     JButton Br = new JButton();
     JButton Bm = new JButton();
     JButton Bl = new JButton();
     JLabel WhoTurn = new JLabel("");


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

        JLabel WhoTurn= new JLabel();
        Text.add(WhoTurn);
        int Xturn = 1;
        int Oturn =2;
        int number = 1+(int) (2*Math.random());;

        if (number == Xturn) {
            WhoTurn.setText("It's X Turn");
        }else if (number == Oturn) {
            WhoTurn.setText("It's O Turn");
        }


        Buttons.add(Tl);
        Tl.addActionListener(this);
        Buttons.add(Tm);
        Tm.addActionListener(this);
        Buttons.add(Tr);
        Tr.addActionListener(this);
        Buttons.add(Ml);
        Ml.addActionListener(this);
        Buttons.add(Mm);
        Mm.addActionListener(this);
        Buttons.add(Mr);
        Mr.addActionListener(this);
        Buttons.add(Bl);
        Bl.addActionListener(this);
        Buttons.add(Bm);
        Bm.addActionListener(this);
        Buttons.add(Br);
        Br.addActionListener(this);





        JButton reset = new JButton("Reset");
        Panel.add(reset);
        frame.setVisible(true);


    }




    @Override
    public void actionPerformed(ActionEvent e) {
    }
}