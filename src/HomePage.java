import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class HomePage implements ActionListener {
    public MyFrame home;
    public JLabel title;
    public JButton checkInButton;
    HashMap<Integer, NewCamper> hashMap;

    public HomePage() {
        home = new MyFrame("Welcome");
        home.getContentPane().add(createTitle());
        home.getContentPane().add(newGuestButton());
        home.setVisible(true);
    }

    public JLabel createTitle() {
        title = new JLabel("Campground");
        title.setBounds(320, 0, 500, 100);
        title.setFont(new Font("Rockwell", Font.BOLD, 70));

        return title;
    }

    public JButton newGuestButton() {
        checkInButton = new JButton("New Guest");
        checkInButton.setBounds(440, 400, 200, 100);
        checkInButton.setFocusable(false);
        checkInButton.setFont(new Font("Rockwell", Font.ITALIC, 20));
        checkInButton.addActionListener(this);
        checkInButton.setBackground(new Color(199, 176, 234));

        return checkInButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkInButton) {

            hashMap = new HashMap<>(); // create a new hashmap to store guests
            new CheckInPage(hashMap); // pass in empty hashmap
            home.dispose();
        }
    }
}

