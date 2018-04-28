package Laoneanu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

public class Hotel {
    private String name;
    private String type;
    private List<Room> rooms;

    public Hotel(String name, String type) {
        this.name = name;
        this.type = type;
        this.rooms = new ArrayList<>();

    }
    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void printRooms(Date date){
        int j = 0;
        for(Room x: rooms){
            j = j + x.listBookins(date);
        }
        System.out.println("Number of total bookings is " + j);
    }

}
