package Laoneanu;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    Room room1 = new Room(1,"Double");
	    Room room2 = new Room(2,"Singe");
	    Room room3 =  new Room(3,"King");
	    Client client1 = new Client("George",123);

	    Book book1 = new Book(new Date(2018,03,04),new Date(2018,3,24),client1,1);
	    room1.addBooking(book1);

        room1.modifyBooking(book1);
    }
}
