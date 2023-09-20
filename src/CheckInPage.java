import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class CheckInPage extends JFrame implements ActionListener {
    NewCamper guest;
    int key;
    private final String[] states = {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"};
    private final String[] campSites = {"1", "2", "3", "4", "5", "6", "7", "8"};
    public MyFrame checkIn;
    public JLabel title, siteTaken, siteInvalid;
    public JRadioButton water, dump, wifi, elec;
    public JTextField nameInput, streetInput, cityInput, zipInput, phoneInput, daysInput, siteInput;
    public JComboBox<String> stateInput;
    public JButton registerButton, mapButton;
    public HashMap<Integer, NewCamper> hashMap;
    CheckInPage(HashMap<Integer, NewCamper> hashMap) {

        checkIn = new MyFrame("Check In"); // new JFrame for check in page
        this.hashMap = hashMap;

        // add all components to the frame
        checkIn.getContentPane().add(createTitle());
        checkIn.getContentPane().add(createLabel("Name:", 10, 140, 50));
        checkIn.getContentPane().add(createNameInput());
        checkIn.getContentPane().add(createLabel("Phone Number:", 300, 140, 125));
        checkIn.getContentPane().add(createPhoneInput());
        checkIn.getContentPane().add(createLabel("Street: ", 8, 200, 50));
        checkIn.getContentPane().add(createStreetInput());
        checkIn.getContentPane().add(createLabel("City:", 300, 200, 50));
        checkIn.getContentPane().add(createCityInput());
        checkIn.getContentPane().add(createLabel("Zip Code:", 530, 200, 80));
        checkIn.getContentPane().add(createZipInput());
        checkIn.getContentPane().add(createLabel("State:", 730, 200, 60));
        checkIn.getContentPane().add(createStateBox());
        checkIn.getContentPane().add(createLabel("Number of Days You are Staying:", 10, 290, 300));
        checkIn.getContentPane().add(createDaysInput());
        checkIn.getContentPane().add(createLabel("Select Desired Amenities:", 10, 390, 300));
        checkIn.getContentPane().add(createWaterInput());
        checkIn.getContentPane().add(createDumpInput());
        checkIn.getContentPane().add(createWifiInput());
        checkIn.getContentPane().add(createElecInput());
        checkIn.getContentPane().add(createLabel("Select Campsite: ", 10, 510, 300));
        checkIn.getContentPane().add(createRegisterButton());
        checkIn.getContentPane().add(createSiteInput());
        checkIn.getContentPane().add(createMapButton());
        checkIn.setVisible(true);
    }

    public JButton createMapButton() {
        mapButton = new JButton("View Map");
        mapButton.setBounds(200, 510, 100, 20);
        mapButton.setFocusable(false);
        mapButton.setBackground(new Color(161, 156, 156));
        mapButton.addActionListener(this);
        return mapButton;
    }

    public JButton createRegisterButton() {
        registerButton = new JButton("Register");
        registerButton.setBounds(455, 600, 150, 75);
        registerButton.setFocusable(false);
        registerButton.setFont(new Font("Rockwell", Font.ITALIC, 20));
        registerButton.setBackground(new Color(161, 156, 156));
        registerButton.addActionListener(this);
        return registerButton;
    }

    public JTextField createSiteInput() {
        siteInput = new JTextField();
        siteInput.setBounds(140, 505, 40, 30);
        return siteInput;
    }

    public JRadioButton createElecInput() {
        elec = new JRadioButton("Electrical Relay");
        elec.setBounds(780, 390, 150, 20);
        elec.setBackground(new Color(255,255,255));
        elec.setFont(new Font("Rockwell", Font.ITALIC, 15));
        elec.setFocusable(false);
        return elec;
    }

    public JRadioButton createWifiInput() {
        wifi = new JRadioButton("Wifi");
        wifi.setBounds(620, 390, 80, 20);
        wifi.setBackground(new Color(255,255,255));
        wifi.setFont(new Font("Rockwell", Font.ITALIC, 15));
        wifi.setFocusable(false);
        return wifi;
    }

    public JRadioButton createDumpInput() {
        dump = new JRadioButton("Dumping");
        dump.setBounds(450, 390, 100, 20);
        dump.setFont(new Font("Rockwell", Font.ITALIC, 15));
        dump.setBackground(new Color(255,255,255));
        dump.setFocusable(false);
        return dump;
    }

    public JRadioButton createWaterInput() {
        water = new JRadioButton("Water");
        water.setBounds(300, 390, 80, 20);
        water.setFont(new Font("Rockwell", Font.ITALIC, 15));
        water.setBackground(new Color(255,255,255));
        water.setFocusable(false);
        return water;
    }

    public JTextField createDaysInput() {
        daysInput = new JTextField();
        daysInput.setBounds(250, 280, 40, 30);
        return daysInput;
    }

    public JComboBox<String> createStateBox() {
        stateInput = new JComboBox<>(states);
        stateInput.setBounds(780, 190, 60, 30);
        return stateInput;

    }

    public JTextField createZipInput() {
        zipInput = new JTextField();
        zipInput.setBounds(610, 190, 70, 30);
        return zipInput;
    }

    public JTextField createCityInput() {
        cityInput = new JTextField();
        cityInput.setBounds(340, 190, 150, 30);
        return cityInput;
    }

    public JTextField createStreetInput() {
        streetInput = new JTextField();
        streetInput.setBounds(60, 190, 200, 30);
        return streetInput;
    }

    public JTextField createPhoneInput() {
        phoneInput = new JTextField();
        phoneInput.setBounds(420, 130, 100, 30);
        return phoneInput;
    }

    public JTextField createNameInput() {
        nameInput = new JTextField();
        nameInput.setBounds(60, 130, 200, 30);
        return nameInput;
    }

    public JLabel createTitle() {
        title = new JLabel("Check In");
        title.setBounds(370, 0, 500, 100);
        title.setFont(new Font("Rockwell", Font.BOLD, 70));
        return title;
    }

    public JLabel createLabel(String Text, int x, int y, int width) {
        JLabel label = new JLabel(Text);
        label.setFont(new Font("Rockwell", Font.PLAIN, 15));
        label.setBounds(x, y, width, 15);
        return label;
    }

    public JLabel createInvalidSite(){
        siteInvalid = new JLabel("Site Does Not Exist");
        siteInvalid.setBounds(100, 550, 300, 13);
        siteInvalid.setFont(new Font("Rockwell", Font.ITALIC, 15));
        siteInvalid.setForeground(new Color(255, 0, 0));
        siteInvalid.setVisible(false);

        ActionListener showLabel = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                siteInvalid.setVisible(true); // if called set the site invalid panel to visible
            }
        };

        ActionListener hideLabel = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                siteInvalid.setVisible(false); // make the site invalid panel go away
            }
        };

        // timer to display the site invalid panel
        Timer showTimer = new Timer(100, showLabel);
        showTimer.setRepeats(false);
        showTimer.start();

        Timer hideTimer = new Timer(1500, hideLabel); // Hide the label after 3000 milliseconds (3 seconds)
        hideTimer.setRepeats(false);
        hideTimer.start();

        return siteInvalid;
    }

    public JLabel createTakenSite(){
        siteTaken = new JLabel("Site is Occupied");
        siteTaken.setBounds(100, 550, 300, 13);
        siteTaken.setFont(new Font("Rockwell", Font.ITALIC, 15));
        siteTaken.setForeground(new Color(255, 0, 0));
        siteTaken.setVisible(false);

        ActionListener showLabel = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                siteTaken.setVisible(true); // make the site invalid panel go away
            }
        };

        ActionListener hideLabel = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                siteTaken.setVisible(false); // make the site invalid panel go away
            }
        };

        // timer to display the site invalid panel
        Timer showTimer = new Timer(100, showLabel);
        showTimer.setRepeats(false);
        showTimer.start();

        Timer hideTimer = new Timer(1500, hideLabel); // Hide the label after 3000 milliseconds (3 seconds)
        hideTimer.setRepeats(false);
        hideTimer.start();

        return siteTaken;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {

            key = Integer.parseInt(siteInput.getText()); // set key equal to site number

            if (key > 8){ // key does not exist if it's greater than the site numbers
                checkIn.getContentPane().add(createInvalidSite());
            }
            else if (hashMap.containsKey(key)){
                checkIn.getContentPane().add(createTakenSite());
            }
            else{
                guest = new NewCamper();

                // set class values for the new guest in the campground
                guest.setName(nameInput.getText());
                guest.setPhone(phoneInput.getText());
                guest.setStreet(streetInput.getText());
                guest.setCity(cityInput.getText());
                guest.setZip(zipInput.getText());
                guest.setDays(daysInput.getText());
                guest.setWater(water.isSelected());
                guest.setWifi(wifi.isSelected());
                guest.setDump(dump.isSelected());
                guest.setElectric(elec.isSelected());

                hashMap.put(key, guest); // add object to map with site number as key

                new CampGround(hashMap); // load new campground with updated hashmap

                checkIn.dispose(); // get rid of the frame
            }
        }
        if (e.getSource() == mapButton) {
            new CampGround(hashMap); // display a new map for user to check availability
        }
    }
}
