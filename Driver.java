package ridessss;

import java.util.ArrayList;

public class Driver {
	static int idGenerator=2000;
	int id;
	String name;
	ArrayList<Ride>rides;
	
	public Driver( String name) {
		this.id = idGenerator++;
		this.name = name;
		this.rides = new ArrayList<Ride>() ;
	}
	public void assignRide(Ride r) {
		rides.add(r);
		System.out.println("Ride Assign Sucessfully To"+ this.name);
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
		return "Driver [id=" + id + ", name=" + name + ", rides=" + rides + "]";
	}
}

