import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

class fact extends Frame implements ActionListener {
    Label l1, l2;
    TextField t1, t2;
    Button b1;

    public fact(){
        setTitle("Factorial");
        setLayout(new FlowLayout());
        l1 = new Label("Number");
        t1 = new TextField(20);
        b1 = new Button("Click");
        l2 = new Label("Factorial");
        t2 = new TextField(20);



        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        b1.addActionListener(this);
        setSize(400,400);
        setVisible(true);

        addWindowListener(new java.awt.event.WindowAdapter(){
            public void windowClosing(java.awt.event.WindowEvent e){
                dispose();
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e){
        int num = Integer.parseInt(t1.getText());
        if(e.getSource() == b1){
            BigInteger fact = BigInteger.ONE;
            for(int i = num; i >= 1; i--){
                fact = fact.multiply(BigInteger.valueOf(i));


            }
            t2.setText(fact.toString());
        }
    }

    public static void main(String[] args){
        new fact();

    }
}
