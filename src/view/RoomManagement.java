package view;

import model.fileReadWrite.ReadWriteRoom;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RoomManagement extends JPanel {
    private ArrayList<JPRoom> listJPRooms = new ArrayList<JPRoom>();
    private ReadWriteRoom readWriteRoom = new ReadWriteRoom();
    private int numOfRooms = 0;
    private int row = 0, col = 4;

    public RoomManagement() {
        this.init();
    }

    private void init() {
        this.setBorder(BorderFactory.createEmptyBorder(10,10, 10, 10));
        this.numOfRooms = readWriteRoom.getListRooms().size();
        System.out.println("room: " + numOfRooms);
        row = numOfRooms / col + (numOfRooms % col == 0 ? 0 : 1);
        this.setLayout(new GridLayout(this.row, this.col, 10, 10));

        for (int i=0; i<numOfRooms; i++) {
            listJPRooms.add(new JPRoom(readWriteRoom.getListRooms().get(i)));
            this.add(listJPRooms.get(i));
        }
    }


}