import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemo1 extends JFrame {
    private JPanel mainPanel;
    private JButton exitButton;

    public SwingDemo1(String title) {
        super(title);
        mainPanel = (JPanel) this.getContentPane();
        exitButton = new JButton("Bye Bye!");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        mainPanel.add(exitButton, BorderLayout.CENTER);
        mainPanel.add(exitButton. paintComponents());
    }

    public static void main(String... args) {
        SwingDemo1 swingDemo1 = new SwingDemo1("Swing Demo Window");
        swingDemo1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        swingDemo1.setSize(new Dimension(500, 500));
        swingDemo1.setVisible(true);
    }
}