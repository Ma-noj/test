package edu.clarivate.manytone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Room {
	@Id
	private int roomId;
	private String roomName;
	private String roomType;
	private double roomPrice;
	@ManyToOne
	private Hotel hotel;

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

}
