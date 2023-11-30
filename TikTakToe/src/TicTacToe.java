import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JPanel Buttons = new JPanel();
    JPanel TurnText = new JPanel();
    JPanel ResetPanel = new JPanel();
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
        JLabel WhoTurn= new JLabel();
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


        JButton reset = new JButton("Reset");
        ResetPanel.add(reset);
        frame.setVisible(true);

        //Who Start
        TurnCheck = random();
        System.out.println(TurnCheck);


        if (TurnCheck==Xturn){
            WhoTurn.setText("It's X Turn");
            TurnCount = TurnCount +1;
        }
        if (TurnCheck==Oturn) {
            WhoTurn.setText("It's O Turn");
            TurnCount = TurnCount +1;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btn = e.getActionCommand();

        //Tl Button
        if (TurnCheck==Xturn && btn.matches("Tl")) {
            Tl.doClick();
            Tl.setText("X");
        }
        if (TurnCheck==Oturn && btn.matches("Tl")) {
            Tl.doClick();
            Tl.setText("O");
        }
        //Tm Button
        if (TurnCheck==Xturn && btn.matches("Tm")) {
            Tm.doClick();
            Tm.setText("X");
        }
        if (TurnCheck==Oturn && btn.matches("Tm")) {
            Tm.doClick();
            Tm.setText("O");
        }
        //Tr Button
        if (TurnCheck==Xturn && btn.matches("Tr")) {
            Tr.doClick();
            Tr.setText("X");
            TurnCheck = Oturn;
        }
        if (TurnCheck==Oturn && btn.matches("Tr")) {
            Tr.doClick();
            Tr.setText("O");
            TurnCheck = Xturn;
        }
        //Ml Button
        if (TurnCheck==Xturn && btn.matches("Ml")) {
            Ml.doClick();
            Ml.setText("X");
            TurnCheck = Oturn;
        }
        if (TurnCheck==Oturn && btn.matches("Ml")) {
            Ml.doClick();
            Ml.setText("O");
            TurnCheck = Xturn;
        }
        //Mm Button
        if (TurnCheck==Xturn && btn.matches("Mm")) {
            Mm.doClick();
            Mm.setText("X");
            TurnCheck = Oturn;
        }
        if (TurnCheck==Oturn && btn.matches("Mm")) {
            Mm.doClick();
            Mm.setText("O");
            TurnCheck = Xturn;
        }
        //Mr Button
        if (TurnCheck==Xturn && btn.matches("Mr")) {
            Mr.doClick();
            Mr.setText("X");
            TurnCheck = Oturn;
        }
        if (TurnCheck==Oturn && btn.matches("Mr")) {
            Mr.doClick();
            Mr.setText("O");
            TurnCheck = Xturn;
        }
        //Bl Button
        if (TurnCheck==Xturn && btn.matches("Bl")) {
            Bl.doClick();
            Bl.setText("X");
            TurnCheck = Oturn;
        }
        if (TurnCheck==Oturn && btn.matches("Bl")) {
            Bl.doClick();
            Bl.setText("O");
            TurnCheck = Xturn;
        }
        //Bm Button
        if (TurnCheck==Xturn && btn.matches("Bm")) {
            Bm.doClick();
            Bm.setText("X");
            TurnCheck = Oturn;
        }
        if (TurnCheck==Oturn && btn.matches("Bm")) {
            Bm.doClick();
            Bm.setText("O");
            TurnCheck = Xturn;
        }
        //Br Button
        if (TurnCheck==Xturn && btn.matches("Br")) {
            Br.doClick();
            Br.setText("X");
            TurnCheck = Oturn;
        }
        if (TurnCheck==Oturn && btn.matches("Br")) {
            Br.doClick();
            Br.setText("O");
            TurnCheck = Xturn;
        }
    }
}