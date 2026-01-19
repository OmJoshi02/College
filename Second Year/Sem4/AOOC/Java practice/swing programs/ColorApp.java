import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorApp extends JFrame implements ActionListener{

    JButton b1,b2,b3;
    ColorApp(){

        setTitle("Color App");
        setLayout(null);
        b1 = new JButton("Red");
        b2 = new JButton("Blue");
        b3 = new JButton("Green");

        b1.setBounds(20,20,80,130);
        b2.setBounds(120,20,80,130);
        b3.setBounds(220,20,80,130);

        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            getContentPane().setBackground(Color.RED);
        }
        else if(e.getSource() == b2){
            getContentPane().setBackground(Color.BLUE);
        }
        else if(e.getSource() == b3){
            getContentPane().setBackground(Color.GREEN);
        }
    }
    
    public static void main(String[] args) {
        new ColorApp();
    }
}
