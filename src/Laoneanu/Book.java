package Laoneanu;

import java.util.Date;
import java.util.Objects;

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

    public void setBookIn(Date bookIn) {
        this.bookIn = bookIn;
    }

    public Date getBookOut() {
        return bookOut;
    }

    public void setBookOut(Date bookOut) {
        this.bookOut = bookOut;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Room: " + roomNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return roomNumber == book.roomNumber && Objects.equals(bookIn, book.bookIn) && Objects.equals(bookOut, book.bookOut) && Objects.equals(client, book.client);
    }

    @Override
    public int hashCode() {

        return Objects.hash(bookIn, bookOut, client, roomNumber);
    }
}
