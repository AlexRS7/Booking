package Laoneanu;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private List bookings;
    private int roomNumber;
    private String type;

    public Room(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.bookings =  new ArrayList<Book>();
    }

    public List getBookings() {
        return bookings;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type;
    }
}
