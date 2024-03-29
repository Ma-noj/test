package edu.clarivate.manytone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.clarivate.manytone.entity.Hotel;
import edu.clarivate.manytone.entity.Room;

public class MainClass {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.setHotelId(1);
		hotel.setHotelName("ABC");

		Room room1 = new Room();
		room1.setRoomId(101);
		room1.setRoomName("F01");
		room1.setRoomType("Non-Ac");
		room1.setRoomPrice(2000);
		room1.setHotel(hotel);

		Room room2 = new Room();
		room2.setRoomId(102);
		room2.setRoomName("F02");
		room2.setRoomType("Ac");
		room2.setRoomPrice(4000);
		room2.setHotel(hotel);

		Room room3 = new Room();
		room3.setRoomId(103);
		room3.setRoomName("F03");
		room3.setRoomType("Ac");
		room3.setRoomPrice(4000);
		room3.setHotel(hotel);

		hotel.setNumberOfRooms(3);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		manager.persist(hotel);
		manager.persist(room1);
		manager.persist(room2);
		manager.persist(room3);
		transaction.commit();
	}
}
