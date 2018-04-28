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

    public void modifyBooking(Book book) {
        Iterator<Book> i = bookings.iterator();
        Scanner sc = new Scanner(System.in);
        String nameclient = sc.nextLine();
        System.out.println("What is the customers name");
        String datestr1 = sc.nextLine();
        System.out.println("What is the bookin date");
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        Date bookin = null;
        Date bookout= null;

        try {
             bookin = format1.parse(datestr1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String datestr2 = sc.nextLine();
        System.out.println("What is the bookin date");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
        try {
             bookout=format2.parse(datestr2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("What is the room number? ");
        int roomNumber=sc.nextInt();
        while (i.hasNext()){
            Book testBook=new Book(bookin,bookout,nameclient,roomNumber);
            if(testBook.equals(book)){
                testBook.setBookIn(book.getBookIn());
                testBook.setBookOut(book.getBookOut());
                testBook.setClient(book.getClient());
                testBook.setRoomNumber(book.getRoomNumber());
            }
        }
    }
}
