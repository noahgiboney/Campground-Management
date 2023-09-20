import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class InfoPage extends JFrame {

    HashMap<Integer, NewCamper> hashMap;
    JLabel guestInfo;
    InfoPage(HashMap<Integer, NewCamper> hashMap, String site, int key) {

        this.hashMap = hashMap;

        ImageIcon logo = new ImageIcon("C:/Users/noahg/IdeaProjects/AutoCamp/src/motor.png");
        this.setIconImage(logo.getImage());

        // add the components to the frame
        this.setTitle("Guest Information");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(300, 500));
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        this.getContentPane().add(createInfo("Guest Name:", 10,20));
        this.getContentPane().add(createInfo(hashMap.get(key).getName(), 105,20));

        this.getContentPane().add(createInfo("Site Number:", 10,50));
        this.getContentPane().add(createInfo(site, 110,50));

        this.getContentPane().add(createInfo("Phone Number:", 10,80));
        this.getContentPane().add(createInfo(hashMap.get(key).getPhone(), 130,80));

        this.getContentPane().add(createInfo("Street:", 10,110));
        this.getContentPane().add(createInfo(hashMap.get(key).getStreet(), 60,110));

        this.getContentPane().add(createInfo("City:", 10,140));
        this.getContentPane().add(createInfo(hashMap.get(key).getCity(), 55,140));

        this.getContentPane().add(createInfo("Zip:", 10,170));
        this.getContentPane().add(createInfo(hashMap.get(key).getZip(), 50,170));

        this.getContentPane().add(createInfo("Days Staying:", 10,200));
        this.getContentPane().add(createInfo(hashMap.get(key).getDays(), 110,200));

        this.getContentPane().add(createInfo("Water Hookup ->", 10,230));
        this.getContentPane().add(createInfo(String.valueOf(hashMap.get(key).isWater()), 135,230));

        this.getContentPane().add(createInfo("Dumping Access ->", 10,260));
        this.getContentPane().add(createInfo(String.valueOf(hashMap.get(key).isDump()), 155,260));

        this.getContentPane().add(createInfo("Wifi Access ->", 10,290));
        this.getContentPane().add(createInfo(String.valueOf(hashMap.get(key).isWifi()), 120,290));

        this.getContentPane().add(createInfo("Electrical Hookup ->", 10,320));
        this.getContentPane().add(createInfo(String.valueOf(hashMap.get(key).isElectric()), 160,320));

        this.setVisible(true);
    }

    public JLabel createInfo(String info, int x, int y){
        guestInfo = new JLabel();
        guestInfo.setText(info);
        guestInfo.setBounds(x,y,200,20);
        guestInfo.setFont(new Font("Rockwell", Font.PLAIN, 15));
        return guestInfo;
    }
}
