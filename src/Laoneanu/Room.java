package Laoneanu;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Room {
    private List<Book> bookings;
    private int roomNumber;
    private String type;

    public Room(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.bookings = new ArrayList<>();
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
        bookings.add(book);
    }

    public void deleteBooking(Book book) {
        bookings.remove(bookings);
    }

    public void modifyBooking(Book book) {

        Iterator<Book> i = bookings.iterator();
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the customer's name");
        String nameClient = sc.nextLine();
        System.out.println("What is the customer's code?");
        int code = sc.nextInt();
        System.out.println("What is the date for the new bookin?");
        String datestr1 = sc.next();
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        Date bookin = null;
        Date bookout= null;
        System.out.println("test");
        try {
             bookin = format1.parse(datestr1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("What is the date for the new bookout?");
        String datestr2 = sc.next();
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
        try {
             bookout=format2.parse(datestr2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("What is the room number? ");
        int roomNumber=sc.nextInt();

        Client client = new Client(nameClient, code);
        System.out.println(bookings);;
        while (i.hasNext()){
            Book currentBook = i.next();
            Book testBook=new Book(bookin,bookout,client,roomNumber);
            if(currentBook.equals(book)){
                testBook.setBookIn(book.getBookIn());
                testBook.setBookOut(book.getBookOut());
                testBook.setClient(book.getClient());
                testBook.setRoomNumber(book.getRoomNumber());
                System.out.println("Booking has been modified successfully!");
            }
        }
    }

   public int listBookins(Date date){
        int i = 0;
        for(Book x: bookings){
            if((x.getBookIn().before(date)||x.getBookIn().equals(date))  && ((x.getBookOut().after(date)||x.getBookOut().equals(date)))){
                System.out.println("Room" + x.getRoomNumber() + " was booked on" + date);
                i++;

            }

        }
        return i;
    }

}
