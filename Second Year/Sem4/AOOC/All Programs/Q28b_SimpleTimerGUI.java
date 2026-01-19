import javax.swing.*;
import java.awt.event.*;

public class Q28b_SimpleTimerGUI {
    static int count = 0;
    static Timer timer;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Timer");
        JLabel label = new JLabel("Count: 0");
        JButton start = new JButton("Start");
        JButton stop = new JButton("Stop");

        start.addActionListener(e -> {
            timer = new Timer(1000, new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    count++;
                    label.setText("Count: " + count);
                }
            });
            timer.start();
        });

        stop.addActionListener(e -> {
            if (timer != null) timer.stop();
        });

        JPanel panel = new JPanel();
        panel.add(start);
        panel.add(stop);
        panel.add(label);

        frame.add(panel);
        frame.setSize(300, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
