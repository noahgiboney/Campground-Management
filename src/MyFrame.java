import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String title) {
        ImageIcon logo = new ImageIcon("Campground Management/src/motor.png");
        this.setIconImage(logo.getImage());
        this.setSize(1024, 800);
        this.setResizable(false);
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(255, 255, 255));
    }
}
