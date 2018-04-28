package Laoneanu;

import com.sun.deploy.util.SessionState;
import com.sun.security.ntlm.Client;

import java.util.Date;

public class Book{
    private Date bookIn;
    private Date bookOut;
    private Client client;
    private int roomNumber;

    public Book(Date bookIn, Date bookOut, Client client, int roomNumber) {
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

    public Client getClient() {
        return client;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void addBooking(){

    }

    public void setBookIn(Date bookIn) {
        this.bookIn = bookIn;
    }

    public void setBookOut(Date bookOut) {
        this.bookOut = bookOut;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
