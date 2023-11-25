import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JPanel Buttons = new JPanel();

     int Turn;

     int XTurn;

     int OTurn;


    public String [] buttons = {"","","","","","","","",""};


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


       for (String title:buttons) {
           JButton btn = new JButton(title);
           btn.addActionListener(this);
           Buttons.add(btn);
       }

        JButton reset = new JButton("Reset");
        Panel.add(reset);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btn = e.getActionCommand();


        if (btn.isEmpty() && Turn==XTurn) {
                btn.replaceFirst("", "X");

        }else if (e.getActionCommand().isEmpty() && Turn==OTurn){
            btn.replaceFirst("","O");

        }
    }
}