import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CounterApp extends JFrame implements ActionListener {
    
    JLabel l;
    JTextArea a;
    JButton b1,b2,b3;
    int count = 0;
    CounterApp(){

        setTitle("Counter");
        setLayout(new FlowLayout());

        l = new JLabel("Counter");
        a = new JTextArea(1, 10);
        a.setEditable(false);
        b1 = new JButton("Count up");
        b2 = new JButton("Count down");
        b3 = new JButton("Reset");

        add(l);
        add(a);
        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){

        
        if(e.getSource() == b1){
            count++;
            String result = String.valueOf(count);
            a.setText(result);
        }

        if(e.getSource() == b2){
            count--;
            String result = String.valueOf(count);
            a.setText(result);
        }

        if(e.getSource() == b3){
            count = 0;
            String result = String.valueOf(count);
            a.setText(result);
        }
    }

    public static void main(String[] args) {
        new CounterApp();
    }
}
