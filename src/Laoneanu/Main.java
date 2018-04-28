package Laoneanu;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
    	Hotel hotel = new Hotel("Ritz","5steleba!");
	    Room room1 = new Room(1,"Double");
	    Room room2 = new Room(2,"Singe");
		Room room3 = new Room(3,"King");
		Room room4 = new Room(4,"King");
		Room room5 = new Room(5,"King");
		Room room6 = new Room(6,"King");
		hotel.addRoom(room1);
		hotel.addRoom(room2);
		hotel.addRoom(room3);
		hotel.addRoom(room4);
		hotel.addRoom(room5);
		hotel.addRoom(room6);

	    Client client1 = new Client("George",123);

	    Book book1 = new Book(new Date(2018,03,04),new Date(2018,3,24),client1,1);
		Book book2 = new Book(new Date(2018,03,04),new Date(2018,3,24),client1,2);
		Book book3 = new Book(new Date(2018,03,04),new Date(2018,3,24),client1,3);
		Book book4 = new Book(new Date(2018,03,04),new Date(2018,3,24),client1,4);
		Book book5 = new Book(new Date(2018,03,04),new Date(2018,3,24),client1,5);
		Book book6 = new Book(new Date(2018,03,04),new Date(2018,3,24),client1,6);

	    room1.addBooking(book1);
	    room2.addBooking(book2);
	    room3.addBooking(book3);
	    room4.addBooking(book4);
	    room5.addBooking(book5);
	    room6.addBooking(book6);
	    //room1.modifyBooking(book1);
	    hotel.printRooms(book1.getBookIn());
    }

}
