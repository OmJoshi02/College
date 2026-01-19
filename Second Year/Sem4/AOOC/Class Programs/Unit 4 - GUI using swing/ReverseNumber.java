import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReverseNumber extends JFrame implements ActionListener {
    JButton b1;
    JTextField j1, j2;
    public ReverseNumber(){

        b1 = new JButton("Click");
        j1 = new JTextField();
        j2 = new JTextField();


        j1.setPreferredSize(new Dimension(400,30));
        b1.setPreferredSize(new Dimension(400,30));
        j2.setPreferredSize(new Dimension(400,30));
        j2.setEditable(false);

        add(j1);
        add(b1);
        add(j2);

        setLayout(new FlowLayout(FlowLayout.CENTER,50 , 50));

        b1.addActionListener(this);
        j1.addActionListener(this);
        j2.addActionListener(this);


        setSize(1920,1200);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public void actionPerformed(ActionEvent e){

        getContentPane().setBackground(Color.YELLOW);
        try{
            String input = j1.getText();
            int num = Integer.parseInt(input);
            int reversed = 0;

            while(num != 0){
                int digit = num %10;
                reversed = reversed * 10+digit;
                num /= 10;
            }

            j2.setText(String.valueOf(reversed));
        }
        catch (NumberFormatException ex){
            j2.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ReverseNumber::new);
    }
}
