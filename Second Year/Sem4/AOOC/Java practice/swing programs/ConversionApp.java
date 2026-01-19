import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ConversionApp extends JFrame implements ActionListener{
    
    JLabel l1, l2;
    JTextField t1, t2;
    JButton b1, b2, b3;

    ConversionApp(){
        setTitle("Converter");
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout());
        l1 = new JLabel("Enter a number : ");
        t1 = new JTextField(20);
        topPanel.add(l1);
        topPanel.add(t1);
        add(topPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(1,3,10,10));
        b1 = new JButton("Binary");
        b2 = new JButton("Octal");
        b3 = new JButton("Hexadecimal");

        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        add(buttonPanel, BorderLayout.CENTER);

        JPanel resultPanel = new JPanel(new FlowLayout());
        l2 = new JLabel("Result");
        t2 = new JTextField(50);
        t2.setEditable(false);

        resultPanel.add(l2);
        resultPanel.add(t2);
        add(resultPanel, BorderLayout.SOUTH);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
    public void actionPerformed(ActionEvent e){

        int number = Integer.parseInt(t1.getText());
        String result = "";

        if(e.getSource() == b1){
            result = Integer.toBinaryString(number);
        }
        else if(e.getSource() == b2){
            result = Integer.toOctalString(number);
        }
        else if(e.getSource() == b3){
            result = Integer.toHexString(number);
        }
        t2.setText(result);
    }

    public static void main(String[] args) {
        new ConversionApp();
    }
}
