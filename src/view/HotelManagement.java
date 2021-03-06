package view;

import javax.swing.*;
import java.awt.*;

public class HotelManagement extends JFrame {
    static final int FRAME_WIDTH = 1200, FRAME_HIGH = 600;
    private JPanel jpSideBar = new JPanel(new GridLayout(1, 2));
    private JPanel jpRoom = new RoomManagement();

    private JPUpdate jpUpdate = new JPUpdate();
    private JPInformation jpInformation = new JPInformation();

    public HotelManagement() {
        this.init();
    }

    public void init() {
        this.setTitle("Hotel Management.");
        this.setSize(FRAME_WIDTH, FRAME_HIGH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(1, 2));

        this.add(jpRoom);
        this.add(jpSideBar);

        this.setVisible(true);
    }
    public void setupSidebar () {
        jpSideBar.add(jpUpdate);
        jpSideBar.add(jpInformation);
    }
    public static void main(String[] args) {
        new HotelManagement();
    }
}
