package Laoneanu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Room {
    private List bookings;
    private int roomNumber;
    private String type;

    public Room(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.bookings = new ArrayList<Book>();
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

    public void addBooking(Book book) {
        bookings.add(bookings);
    }

    public void deleteBooking(Book book) {
        bookings.remove(bookings);
    }

    public void modifyBooking(Book book1) {
        Iterator<Book> i = bookings.iterator();
        Scanner sc = new Scanner(System.in);
        String nameclient = sc.nextLine();
        System.out.println("What is the customers name");
        String datestr = sc.nextLine();
        System.out.println("What is the bookin date");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date bookin = format.parse(datestr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
