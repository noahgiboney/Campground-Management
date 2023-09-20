import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class CampGround extends JFrame implements ActionListener {
    public MyFrame campSite;
    HashMap<Integer, NewCamper> hashMap;
    public JButton newCheckIn, checkOut, info1, info2 ,info3, info4, info5, info6, info7, info8;
    public JPanel openSign;
    public JLabel siteNumber, camper;
    public JLabel fish;

    public CampGround(HashMap<Integer, NewCamper> hashMap) {

        campSite = new MyFrame("Camp Grounds"); //new JFame displaying campground
        this.hashMap = hashMap;

        // add components to the JFrame
        DrawingsPanel drawingsPanel = new DrawingsPanel();
        drawingsPanel.setBounds(0, 0, 1024, 800);
        fish = new JLabel();
        fish.setBounds(100,580,50,50);
        fish.setIcon(new ImageIcon("C://Users//noahg//IdeaProjects//AutoCamp//src//fish.png"));
        displayCampLabels();
        checkOpen(this.hashMap);
        campSite.getContentPane().add(drawingsPanel);
        campSite.setVisible(true);
    }

    public JLabel createCamper (int x, int y) {
        JLabel camper = new JLabel();
        camper.setBounds(x, y, 147, 207);
        camper.setIcon(new ImageIcon("C://Users//noahg//IdeaProjects//AutoCamp//src//camperImage.png"));

        return camper;
    }

    // this function displays the info buttons for each campsite
    public void displayInfoButtons(){
        info1 = new JButton("Info");
        info1.setBounds(85,220,70,30);
        info1.setFont(new Font("Rockwell", Font.PLAIN, 13));
        info1.setBackground(new Color(255, 255, 255));
        info1.setFocusable(false);
        info1.addActionListener(this);
        info1.setVisible(false);
        campSite.getContentPane().add(info1);

        info2 = new JButton("Info");
        info2.setBounds(265,220,70,30);
        info2.setFont(new Font("Rockwell", Font.PLAIN, 13));
        info2.setBackground(new Color(255, 255, 255));
        info2.setFocusable(false);
        info2.addActionListener(this);
        info2.setVisible(false);
        campSite.getContentPane().add(info2);

        info3 = new JButton("Info");
        info3.setBounds(445,220,70,30);
        info3.setFont(new Font("Rockwell", Font.PLAIN, 13));
        info3.setBackground(new Color(255, 255, 255));
        info3.setFocusable(false);
        info3.addActionListener(this);
        info3.setVisible(false);
        campSite.getContentPane().add(info3);

        info4 = new JButton("Info");
        info4.setBounds(625,220,70,30);
        info4.setFont(new Font("Rockwell", Font.PLAIN, 13));
        info4.setBackground(new Color(255, 255, 255));
        info4.setFocusable(false);
        info4.addActionListener(this);
        info4.setVisible(false);
        campSite.getContentPane().add(info4);

        info5 = new JButton("Info");
        info5.setBounds(265,540,70,30);
        info5.setFont(new Font("Rockwell", Font.PLAIN, 13));
        info5.setBackground(new Color(255, 255, 255));
        info5.setFocusable(false);
        info5.addActionListener(this);
        info5.setVisible(false);
        campSite.getContentPane().add(info5);

        info6 = new JButton("Info");
        info6.setBounds(445,540,70,30);
        info6.setFont(new Font("Rockwell", Font.PLAIN, 13));
        info6.setBackground(new Color(255, 255, 255));
        info6.setFocusable(false);
        info6.addActionListener(this);
        info6.setVisible(false);
        campSite.getContentPane().add(info6);

        info7 = new JButton("Info");
        info7.setBounds(625,540,70,30);
        info7.setFont(new Font("Rockwell", Font.PLAIN, 13));
        info7.setBackground(new Color(255, 255, 255));
        info7.setFocusable(false);
        info7.addActionListener(this);
        info7.setVisible(false);
        campSite.getContentPane().add(info7);

        info8 = new JButton("Info");
        info8.setBounds(805,540,70,30);
        info8.setFont(new Font("Rockwell", Font.PLAIN, 13));
        info8.setBackground(new Color(255, 255, 255));
        info8.setFocusable(false);
        info8.addActionListener(this);
        info8.setVisible(false);
        campSite.getContentPane().add(info8);
    }

    public void checkOpen(HashMap<Integer, NewCamper> hashMap){
        displayInfoButtons();
        for (int i = 1; i <= 8 ; i++) { // iterate over the campground available sites
            if (!hashMap.containsKey(i)) { // check if the hashmap does not contain this key (site open)
                if (i == 1) {
                    campSite.getContentPane().add(createOpenSign(85, 100));
                }
                if (i == 2) {
                    campSite.getContentPane().add(createOpenSign(265, 100));
                }
                if (i == 3) {
                    campSite.getContentPane().add(createOpenSign(445, 100));
                }
                if (i == 4) {
                    campSite.getContentPane().add(createOpenSign(625, 100));
                }
                if (i == 5) {
                    campSite.getContentPane().add(createOpenSign(265, 650));
                }
                if (i == 6) {
                    campSite.getContentPane().add(createOpenSign(445, 650));
                }
                if (i == 7) {
                    campSite.getContentPane().add(createOpenSign(625, 650));
                }
                if (i == 8) {
                    campSite.getContentPane().add(createOpenSign(805, 650));
                }
            }
            if(hashMap.containsKey(i)){ // if the hashmap does have this key then display an occupied sign at respective site
                if(i == 1){
                    campSite.getContentPane().add(createCamper(70,25));
                    info1.setVisible(true);
                }
                if(i == 2){
                    campSite.getContentPane().add(createCamper(250,25));
                    info2.setVisible(true);
                }
                if(i == 3){
                    campSite.getContentPane().add(createCamper(430,25));
                    info3.setVisible(true);
                }
                if(i == 4){
                    campSite.getContentPane().add(createCamper(610,25));
                    info4.setVisible(true);
                }
                if(i == 5){
                    campSite.getContentPane().add(createCamper(250,550));
                    info5.setVisible(true);
                }
                if(i == 6){
                    campSite.getContentPane().add(createCamper(430,550));
                    info6.setVisible(true);
                }
                if(i == 7){
                    campSite.getContentPane().add(createCamper(610,550));
                    info7.setVisible(true);
                }
                if(i == 8){
                    campSite.getContentPane().add(createCamper(790,550));
                    info8.setVisible(true);
                }
            }
        }
    }

    public JPanel createOpenSign(int x, int y){

        openSign = new JPanel();
        openSign.setBounds(x,y,70,25);
        openSign.setBackground(new Color(41, 255, 0));

        JLabel text = new JLabel("Vacant");
        text.setFont(new Font("Rockwell", Font.PLAIN, 12));

        openSign.add(text);
        return openSign;
    }

    public JButton createCheckOutButton(){
        checkOut = new JButton("Check Out");
        checkOut.setBounds(900,530,100,40);
        checkOut.setFont(new Font("Rockwell", Font.PLAIN, 13));
        checkOut.setBackground(new Color(229, 93, 93));
        checkOut.setFocusable(false);
        checkOut.addActionListener(this);
        return checkOut;
    }

    public JLabel createSiteNumber(String num, int x, int y){
        siteNumber = new JLabel();
        siteNumber.setText(num);
        siteNumber.setBounds(x,y,50,50);
        siteNumber.setFont(new Font("Rockwell",Font.ITALIC,20));
        return siteNumber;
    }

    public JButton createNewCheckInButton() {
        newCheckIn = new JButton("New Check-In");
        newCheckIn.setFocusable(false);
        newCheckIn.setBounds(790, 200, 140, 30);
        newCheckIn.setFont(new Font("Rockwell", Font.PLAIN, 13));
        newCheckIn.addActionListener(this);
        return newCheckIn;
    }

    public JLabel createFish(int x, int y){
        fish = new JLabel();
        fish.setBounds(x,y,50,50);
        fish.setIcon(new ImageIcon("C://Users//noahg//IdeaProjects//AutoCamp//src//fish.png"));
        return fish;
    }

    public void displayCampLabels(){
        campSite.getContentPane().add(createNewCheckInButton());
        campSite.getContentPane().add(createCheckOutButton());
        campSite.getContentPane().add(createSiteNumber("1",50,230));
        campSite.getContentPane().add(createSiteNumber("2",230,230));
        campSite.getContentPane().add(createSiteNumber("3",410,230));
        campSite.getContentPane().add(createSiteNumber("4",590,230));
        campSite.getContentPane().add(createSiteNumber("5",230,510));
        campSite.getContentPane().add(createSiteNumber("6",410,510));
        campSite.getContentPane().add(createSiteNumber("7",590,510));
        campSite.getContentPane().add(createSiteNumber("8",770,510));
        campSite.getContentPane().add(createFish(120,590));
        campSite.getContentPane().add(createFish(90,660));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == newCheckIn){
            new CheckInPage(hashMap);
            campSite.dispose();
        }
        if (e.getSource() == info1){
            new InfoPage(hashMap, "1", 1);
        }
        if (e.getSource() == info2){
            new InfoPage(hashMap, "2", 2);
        }
        if (e.getSource() == info3){
            new InfoPage(hashMap, "3", 3);
        }
        if (e.getSource() == info4){
            new InfoPage(hashMap, "4", 4);
        }
        if (e.getSource() == info5){
            new InfoPage(hashMap, "5", 5);
        }
        if (e.getSource() == info6){
            new InfoPage(hashMap, "6", 6);
        }
        if (e.getSource() == info7){
            new InfoPage(hashMap, "7", 7);
        }
        if (e.getSource() == info8){
            new InfoPage(hashMap, "8", 8);
        }
        if(e.getSource() == checkOut){
            new CheckOutPage(hashMap);
            campSite.dispose();
        }
    }

    //draw the campground using drawings panel
    static class DrawingsPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            Graphics2D g2D = (Graphics2D) g;

            //GRASS TOP
            g2D.setPaint(new Color(86, 125, 70));
            g2D.drawRect(0, 0, 1024, 270);
            g2D.fillRect(0, 0, 1024, 270);

            //GRASS BOTTOM
            g2D.setPaint(new Color(86, 125, 70));
            g2D.drawRect(0, 520, 1024, 280);
            g2D.fillRect(0, 520, 1024, 280);

            //SITE 1
            g2D.setPaint(new Color(130, 130, 130));
            g2D.drawRect(70, 0, 100, 280);
            g2D.fillRect(70, 0, 100, 280);

            //SITE 2
            g2D.setPaint(new Color(130, 130, 130));
            g2D.drawRect(250, 0, 100, 280);
            g2D.fillRect(250, 0, 100, 280);

            //SITE 3
            g2D.setPaint(new Color(130, 130, 130));
            g2D.drawRect(430, 0, 100, 280);
            g2D.fillRect(430, 0, 100, 280);

            //SITE 4
            g2D.setPaint(new Color(130, 130, 130));
            g2D.drawRect(610, 0, 100, 280);
            g2D.fillRect(610, 0, 100, 280);

            //POOL
            g2D.setPaint(new Color(116, 217, 234));
            g2D.drawOval(65, 570, 120, 150);
            g2D.fillOval(65, 570, 120, 150);

            //SITE 5
            g2D.setPaint(new Color(130, 130, 130));
            g2D.drawRect(250, 520, 100, 280);
            g2D.fillRect(250, 520, 100, 280);

            //SITE 6
            g2D.setPaint(new Color(130, 130, 130));
            g2D.drawRect(430, 520, 100, 280);
            g2D.fillRect(430, 520, 100, 280);

            //SITE 7
            g2D.setPaint(new Color(130, 130, 130));
            g2D.drawRect(610, 520, 100, 280);
            g2D.fillRect(610, 520, 100, 280);

            //SITE 8
            g2D.setPaint(new Color(130, 130, 130));
            g2D.drawRect(790, 520, 100, 280);
            g2D.fillRect(790, 520, 100, 280);

            //MAIN ROAD
            g2D.setPaint(new Color(130, 130, 130));
            g2D.drawRect(0, 270, 1024, 250);
            g2D.fillRect(0, 270, 1024, 250);

            //ROAD DASH
            g2D.setPaint(new Color(225, 241, 41));
            g2D.drawRect(50, 385, 100, 15);
            g2D.fillRect(50, 385, 100, 15);

            //ROAD DASH
            g2D.setPaint(new Color(225, 241, 41));
            g2D.drawRect(250, 385, 100, 15);
            g2D.fillRect(250, 385, 100, 15);

            //ROAD DASH
            g2D.setPaint(new Color(225, 241, 41));
            g2D.drawRect(450, 385, 100, 15);
            g2D.fillRect(450, 385, 100, 15);

            //ROAD DASH
            g2D.setPaint(new Color(225, 241, 41));
            g2D.drawRect(650, 385, 100, 15);
            g2D.fillRect(650, 385, 100, 15);

            //ROAD DASH
            g2D.setPaint(new Color(225, 241, 41));
            g2D.drawRect(850, 385, 100, 15);
            g2D.fillRect(850, 385, 100, 15);

            g2D.setColor(Color.BLACK);
            g2D.setStroke(new BasicStroke(2));

            // Draw the house shape
            int x = 810;
            int y = 90;
            int width = 100;
            int height = 100;

            // Draw the roof
            g2D.setColor(new Color(51, 33, 14));
            g2D.drawLine(x, y, x + width / 2, y - height / 2);
            g2D.drawLine(x + width / 2, y - height / 2, x + width, y);

            // Draw the walls
            g2D.drawRect(x, y, width, height);
            g2D.setColor(new Color(238, 233, 233));
            g2D.fillRect(x, y, width, height);

            // Draw the door
            g2D.setColor(Color.BLACK);
            int doorWidth = 30;
            int doorHeight = 60;
            g2D.drawRect(x + width / 2 - doorWidth / 2 + 17, y + height - doorHeight, doorWidth, doorHeight);
            g2D.setColor(new Color(155, 123, 80));
            g2D.fillRect(x + width / 2 - doorWidth / 2 + 17, y + height - doorHeight, doorWidth, doorHeight);
            g2D.setColor(Color.black);
            g2D.drawOval(885,160,2,2);
            g2D.fillOval(885,160,2,2);

            // Set the color for the roof and fill it
            g2D.setColor(new Color(51, 33, 14));
            int[] xRoof = {x, x + width / 2, x + width};
            int[] yRoof = {y, y - height / 2, y};
            g2D.fillPolygon(xRoof, yRoof, 3);

            // Draw the window
            int windowWidth = 25;
            int windowHeight = 20;
            g2D.drawRect(x + width / 4 - 12, y + height / 2 - windowHeight / 2, windowWidth, windowHeight);
            g2D.setColor(new Color(96, 255, 242));
            g2D.fillRect(x + width / 4 - 12, y + height / 2 - windowHeight / 2, windowWidth, windowHeight);
            g2D.setColor(Color.BLACK);
            g2D.setStroke(new BasicStroke(1));
            g2D.drawLine(x + width / 4 - 12,y + height / 2 - windowHeight +20,x + width / 4 - 12 + 25,y + height / 2 - windowHeight +20);
            g2D.drawLine(x + width / 4 - 12 +12,y + height / 2 - windowHeight +10,x + width / 4 - 12 + 12,y + height / 2 - windowHeight +30);
        }
    }
}

