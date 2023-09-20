import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class CheckOutPage extends JFrame implements ActionListener {
    int key;
    NewCamper guest;
    CampGround oldCamp;
    JLabel message, siteNumberError;
    JButton exitButton, mapButton;
    JTextField siteNumber;
    HashMap<Integer, NewCamper> hashMap;

    CheckOutPage(HashMap<Integer,NewCamper > hashMap){

        this.hashMap = hashMap;

        ImageIcon logo = new ImageIcon("C:/Users/noahg/IdeaProjects/AutoCamp/src/motor.png");
        this.setIconImage(logo.getImage());

        this.setTitle("Check Out");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(450, 300));
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        // add frame components
        this.getContentPane().add(createExitButton());
        this.getContentPane().add(createExitMessage());
        this.getContentPane().add(createSiteInput());

        this.setVisible(true);
    }

    public void removeKey (HashMap<Integer, NewCamper> hashMap, int key){
        hashMap.remove(key);
    }

    public JTextField createSiteInput(){
        siteNumber = new JTextField();
        siteNumber.setBounds(185,100,50,30);

        return siteNumber;
    }

    public JLabel createExitMessage(){
        message = new JLabel("What site number would you like to check out of?");
        message.setFont(new Font("Rockwell", Font.PLAIN, 15));
        message.setBounds(40,50,400,13);

        return message;
    }

    public JButton createExitButton (){
        exitButton = new JButton("Exit");
        exitButton.setBounds(160,160,100,40);
        exitButton.setFont(new Font("Rockwell", Font.PLAIN, 13));
        exitButton.setBackground(new Color(229, 93, 93));
        exitButton.setFocusable(false);
        exitButton.addActionListener(this);
        return exitButton;
    }

    public JLabel createSiteNumberError (){
        siteNumberError = new JLabel("Invalid Site Number");
        siteNumberError.setBounds(150,220,200,13);
        siteNumberError.setFont(new Font("Rockwell", Font.ITALIC, 15));
        siteNumberError.setForeground(new Color(255, 0, 0));
        siteNumberError.setVisible(false);

        ActionListener showLabel = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                siteNumberError.setVisible(true);
            }
        };

        ActionListener hideLabel = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                siteNumberError.setVisible(false);
            }
        };

        Timer showTimer = new Timer(100, showLabel);
        showTimer.setRepeats(false);
        showTimer.start();

        Timer hideTimer = new Timer(1500, hideLabel); // Hide the label after 3000 milliseconds (3 seconds)
        hideTimer.setRepeats(false);
        hideTimer.start();

        return siteNumberError;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exitButton){

            key = Integer.parseInt(siteNumber.getText()); // set the key as site number to remove

            if (key > 8 || !hashMap.containsKey(key)){ //if the site does not exist or the site is not taken give an error
                this.getContentPane().add(createSiteNumberError());
            }
            else {
                removeKey(hashMap, key); // remove the key/checkoutguest
                new CampGround(hashMap); // redraw the campground
                this.dispose();
            }
        }
    }
}
