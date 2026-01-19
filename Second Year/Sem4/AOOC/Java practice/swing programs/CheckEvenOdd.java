import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CheckEvenOdd extends JFrame implements ActionListener{

    JTextField t1, t2;
    JLabel l1, l2;
    JButton b1;

    CheckEvenOdd(){

        setTitle("Even Odd");
        setLayout(new FlowLayout());

        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t2.setEditable(false);
        l1 = new JLabel("Number");
        l2 = new JLabel("Result");
        b1 = new JButton("Click");

        add(l1);
        add(t1);
        add(b1);
        add(l2);
        add(t2);

        t1.addActionListener(this);
        t2.addActionListener(this);
        b1.addActionListener(this);

        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){

            int num = Integer.parseInt(t1.getText());

            if(num % 2 == 0){
                t2.setText("Even");
            }
            else{
                t2.setText("Odd");
            }
        }
    }

    public static void main(String[] args) {
        new CheckEvenOdd();
    }
}