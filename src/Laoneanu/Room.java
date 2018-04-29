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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomNumber == room.roomNumber && Objects.equals(type, room.type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(roomNumber, type);
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

    public boolean inConflict(Book book){
        for(Book x: bookings){
            Boolean test1 = (book.getBookIn().after(x.getBookIn()) || book.getBookIn().equals(x.getBookIn())) &&
                    (book.getBookIn().after(x.getBookOut()) || book.getBookIn().equals(x.getBookOut()));
            Boolean test2 = (book.getBookOut().after(x.getBookIn())||book.getBookOut().equals(x.getBookIn())) &&
                    (book.getBookOut().before(x.getBookOut())|| book.getBookOut().equals(x.getBookOut()));
            Boolean test3 = (book.getBookIn().before(x.getBookIn()))|| book.getBookOut().after(x.getBookOut());
            if(test1 || test2 || test3) {
               return true;
            }
        }
        return false;
    }


    public void addBooking(Book book) {
        if(inConflict(book)){
            return;
        }
        bookings.add(book);
    }

    public void deleteBooking(Book book) {
        bookings.remove(book);
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
        Book testBook=new Book(bookin,bookout,client,roomNumber);
        bookings.remove(book);
        if(inConflict(testBook)){
            System.out.println("Bookin overlaps another bookin, bookin can't be made!");
            bookings.add(book);
            return;
        }
        else
        {
            bookings.add(testBook);
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

    public int listBookins(Client client){
        int i = 0;
        for(Book x: bookings){
            if(x.getClient().equals(client)){
                System.out.println("Room" + x.getRoomNumber() + " was booked by " + client);
                i++;

            }

        }
        return i;
    }



}
