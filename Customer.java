package ridessss;

import java.util.ArrayList;

public class Customer {
	static int idGenerator=3000;
	int id;
	String name;
	ArrayList<Ride>rides;
	
	public Customer(String name) {
		this.name=name;
		this.id=idGenerator++;
		this.rides=new ArrayList<Ride>();
		}
	public void bookRide(Ride r) {
		rides.add(r);
		System.out.println("Ride Booked Sucessfully");
	}
	public void removeRide(int rideId) {
		for(Ride r : rides) {
			if(r.getId()==rideId);{
				r.setStatus("CANCLE");
				r.setFare(0);
				System.out.println("Ride Cancle Successfully");
				return;
			}
		}
		System.out.println("Ride With Given Id Not Found");
	}
	public void displyRide() {
		for(Ride r:rides) {
			System.out.println(r);
		}
	}
	public void calculateBill() {
		int total=0;
		for(Ride r:rides) {
			total=total+r.getFare();
			}
		System.out.println("Total:-"+total);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Ride> getRides() {
		return rides;
	}
	public void setRides(ArrayList<Ride> rides) {
		this.rides = rides;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", rides=" + rides + "]";
	}
	
}
