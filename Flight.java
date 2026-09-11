package flight;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Flight {
 String flightNo;
 String source;
 String destination;
 ArrayList<Passenger>passenger;
 
 public Flight(String flightNo, String source, String destination) {
	super();
	this.flightNo = flightNo;
	this.source = source;
	this.destination = destination;
	this.passenger = passenger;
 }
 public void addPassenger(Passenger p) {
	 for(Passenger p1:passenger) {
		 if(p1.getSeatNo()==p.getSeatNo()) {
			 System.out.println("Seat is already booked");
			 return;
		 }
	 }
	 passenger.add(p);
	 System.out.println("passenger add sucessfully");
 }
 public void removePassenger(int id) throws PassengerNotFound {
	 ListIterator<Passenger>itr=passenger.listIterator();
	 while(itr.hasNext()) {
		 Passenger p=itr.next();
		 if(p.getId()==id) {
			 passenger.remove(p);
			 System.out.println("passenger remove succesfully");
			 return;
		 }
	 }
	 throw new PassengerNotFound("passengr with given id not found");
 }
 public void searchPassengerBySeatNo(int seatNo) {
	 Iterator<Passenger>itr=passenger.iterator();
	 while(itr.hasNext());{
		 Passenger p= itr.next();
		 if(p.getSeatNo()==seatNo) {
			 System.out.println("passengr details");
			 System.out.println(p);
			 return;
		 }
 }
	 System.out.println("passengr with given id not found");
 	}
 public void changeSeatById(int id ,int seatNo ) {
	 for(Passenger p:passenger) {
		 if(p.getSeatNo()==seatNo) {
			 System.out.println("seat alread book");
			 return;
			 
		 }
	 }
	 for(Passenger p1:passenger) {
		 if(p1.getId()==id) {
			 p1.setSeatNo(seatNo);
			 System.out.println("seat change successfuly");
		 }
	 }
 }
 public void displayAll() {
	 for(Passenger p:passenger) {
		 System.out.println(p);
	 }
 }
 @Override
 public String toString() {
	return "Flight [flightNo=" + flightNo + ", source=" + source + ", destination=" + destination + ", passenger="
			+ passenger + "]";
 }


 }
