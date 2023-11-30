import com.sun.source.tree.IfTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JPanel Buttons = new JPanel();
    JPanel TurnText = new JPanel();
    JPanel ResetPanel = new JPanel();

    JLabel WhoTurn= new JLabel();

     JButton Tr = new JButton("Tr");
     JButton Tm = new JButton("Tm");
     JButton Tl = new JButton("Tl");
     JButton Mr = new JButton("Mr");
     JButton Mm = new JButton("Mm");
     JButton Ml = new JButton("Ml");
     JButton Br = new JButton("Br");
     JButton Bm = new JButton("Bm");
     JButton Bl = new JButton("Bl");

    int Xturn = 1;
    int Oturn =2;

    int TurnCheck;

    int TurnCount = 0;



    public static int random (){
        int number = 1 + (int) (2 * Math.random());
        return number;
    }

    TicTacToe() {
        frame.setSize(500,700);

        Buttons.setLayout(new GridLayout(3, 3));
        frame.add(Buttons);
        Buttons.setSize(500,500);

        TurnText.setSize(500,100);
        frame.add(TurnText);
        TurnText.add(WhoTurn);

        frame.add(ResetPanel);
        ResetPanel.setSize(500,100);


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
        ResetPanel.add(reset);
        frame.setVisible(true);

        //Who Start
        TurnCheck = random();


        do {
            System.out.println(TurnCount);
        }while (TurnCount>=9);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btn = e.getActionCommand();

        //Tl Button
        if (TurnCheck==Xturn && btn.matches("Tl")) {
            Tl.setText("X");
            TurnCheck = TurnCheck+1;
            TurnCount = TurnCount + 1;
            System.out.println(TurnCount);
        } else if (TurnCheck==Oturn && btn.matches("Tl")) {
            Tl.setText("O");
            TurnCheck = TurnCheck -1;
            TurnCount = TurnCount + 1;
            System.out.println(TurnCount);
        }
        //Tm Button
        if (TurnCheck==Xturn && btn.matches("Tm")) {
            Tm.setText("X");
            TurnCheck = TurnCheck+1;
            TurnCount = TurnCount + 1;
            System.out.println(TurnCount);
        } else if (TurnCheck==Oturn && btn.matches("Tm")) {
            Tm.setText("O");
            TurnCheck = TurnCheck -1;
            TurnCount = TurnCount + 1;
            System.out.println(TurnCount);
        }
        //Tr Button
        if (TurnCheck==Xturn && btn.matches("Tr")) {
            Tr.setText("X");
            TurnCheck = TurnCheck+1;
            TurnCount = TurnCount + 1;
            System.out.println(TurnCount);
        } else if (TurnCheck==Oturn && btn.matches("Tr")) {
            Tr.setText("O");
            TurnCheck = TurnCheck -1;
            TurnCount = TurnCount + 1;
            System.out.println(TurnCount);

        }
        //Ml Button
        if (TurnCheck==Xturn && btn.matches("Ml")) {
            Ml.setText("X");
            TurnCheck = TurnCheck+1;
            TurnCount = TurnCount + 1;
            System.out.println(TurnCount);
        } else if (TurnCheck==Oturn && btn.matches("Ml")) {
            Ml.setText("O");
            TurnCheck = TurnCheck -1;
            TurnCount = TurnCount + 1;
            System.out.println(TurnCount);
        }
        //Mm Button
        if (TurnCheck==Xturn && btn.matches("Mm")) {
            Mm.setText("X");
            TurnCheck = TurnCheck+1;
            TurnCount = TurnCount + 1;
            System.out.println(TurnCount);
        } else if (TurnCheck==Oturn && btn.matches("Mm")) {
            Mm.setText("O");
            TurnCheck=TurnCheck-1;
            TurnCount = TurnCount + 1;
            System.out.println(TurnCount);
        }
        //Mr Button
        if (TurnCheck==Xturn && btn.matches("Mr")) {
            Mr.setText("X");
            TurnCheck = TurnCheck+1;
            TurnCount = TurnCount + 1;
            System.out.println(TurnCount);
        } else if (TurnCheck==Oturn && btn.matches("Mr")) {
            Mr.setText("O");
            TurnCheck = TurnCheck -1;
            TurnCount = TurnCount + 1;
            System.out.println(TurnCount);
        }
        //Bl Button
        if (TurnCheck==Xturn && btn.matches("Bl")) {
            Bl.setText("X");
            TurnCheck = TurnCheck+1;
            TurnCount = TurnCount + 1;
            System.out.println(TurnCount);
        } else if (TurnCheck==Oturn && btn.matches("Bl")) {
            Bl.setText("O");
            TurnCheck = TurnCheck -1;
            TurnCount = TurnCount + 1;
            System.out.println(TurnCount);
        }
        //Bm Button
        if (TurnCheck==Xturn && btn.matches("Bm")) {
            Bm.setText("X");
            TurnCheck = TurnCheck+1;
            TurnCount = TurnCount + 1;
            System.out.println(TurnCount);
        } else if (TurnCheck==Oturn && btn.matches("Bm")) {
            Bm.setText("O");
            TurnCheck = TurnCheck -1;
            TurnCount = TurnCount + 1;
            System.out.println(TurnCount);
        }
        //Br Button
        if (TurnCheck==Xturn && btn.matches("Br")) {
            Br.setText("X");
            TurnCheck = TurnCheck+1;
            TurnCount = TurnCount + 1;
            System.out.println(TurnCount);
        } else if (TurnCheck==Oturn && btn.matches("Br")) {
            Br.setText("O");
            TurnCheck = TurnCheck -1;
            TurnCount = TurnCount + 1;
            System.out.println(TurnCount);
        }
        if (TurnCount==6) {

        }

        if (TurnCount==7) {

        }
        if (TurnCount==8) {

        }
        if (TurnCount==9) {
            System.out.println("The Board is full");

            if (TurnCount == 9) {
                System.out.println("It's a draw");
            }
        }
    }
}