import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Hello Swing");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);

            JLabel label = new JLabel("Hello, Java GUI!");
            label.setBounds(50, 50, 200, 30);
            frame.add(label);

            frame.setVisible(true);
        });
    }
}
