package Laoneanu;

import java.util.Date;

public class Book{
    private Date bookIn;
    private Date bookOut;
    private String client;
    private int roomNumber;

    public Book(Date bookIn, Date bookOut, String client, int roomNumber) {
        this.bookIn = bookIn;
        this.bookOut = bookOut;
        this.client = client;
        this.roomNumber = roomNumber;
    }

    public Date getBookIn() {
        return bookIn;
    }

    public Date getBookOut() {
        return bookOut;
    }

    public String getClient() {
        return client;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
