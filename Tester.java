package ridessss;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

    ArrayList<Ride> rides;
    ArrayList<Customer> customers;
    ArrayList<Driver> drivers;

    Scanner sc = new Scanner(System.in);

    public Tester() {

        this.rides = new ArrayList<Ride>();
        this.customers = new ArrayList<Customer>();
        this.drivers = new ArrayList<Driver>();
    }

    public void addCustomer() {

        System.out.println("Enter The Name Of Customer");

        String name = sc.next();

        Customer c = new Customer(name);

        customers.add(c);

        System.out.println("Customer Added Successfully");
        System.out.println("Customer Id :- " + c.getId());
    }

    public void addDriver() {

        System.out.println("Enter The Driver Name");

        String name = sc.next();

        Driver d = new Driver(name);

        drivers.add(d);

        System.out.println("Driver Added Successfully");
        System.out.println("Driver Id :- " + d.getId());
    }

    public Customer getCustomerById(int id) {

        for (Customer c : customers) {

            if (c.getId() == id) {
                return c;
            }
        }

        return null;
    }

    public Driver getDriverById(int id) {

        for (Driver d : drivers) {

            if (d.getId() == id) {
                return d;
            }
        }

        return null;
    }

    public Ride getRideById(int id) {

        for (Ride r : rides) {

            if (r.getId() == id) {
                return r;
            }
        }

        return null;
    }

    public void bookRide(
            int cid,
            int did,
            String src,
            String dest,
            int fare) {

        Customer c = getCustomerById(cid);
        Driver d = getDriverById(did);

        if (c == null) {
            System.out.println("Customer With Given Id Not Found");
            return;
        }

        if (d == null) {
            System.out.println("Driver With Given Id Not Found");
            return;
        }

        Ride r = new Ride(src, dest, fare);

        c.bookRide(r);
        d.assignRide(r);
        rides.add(r);

        System.out.println("Ride Booked Successfully");
        System.out.println("Ride Id :- " + r.getId());
    }

    public void cancelRide(int rid) {

        Ride r = getRideById(rid);

        if (r == null) {
            System.out.println("Ride With Given Id Not Found");
            return;
        }

        if (r.getStatus().equals("CANCELLED")) {
            System.out.println("Ride Is Already Cancelled");
            return;
        }

        r.setStatus("CANCELLED");
        r.setFare(0);

        System.out.println("Ride Cancelled Successfully");
    }

    public void displayCustomers() {

        if (customers.isEmpty()) {
            System.out.println("No Customers Found");
            return;
        }

        for (Customer c : customers) {
            System.out.println(c);
        }
    }

    public void displayDrivers() {

        if (drivers.isEmpty()) {
            System.out.println("No Drivers Found");
            return;
        }

        for (Driver d : drivers) {
            System.out.println(d);
        }
    }

    public void displayRides() {

        if (rides.isEmpty()) {
            System.out.println("No Rides Found");
            return;
        }

        for (Ride r : rides) {
            System.out.println(r);
        }
    }

    public void calculateBill(int cid) {

        Customer c = getCustomerById(cid);

        if (c == null) {
            System.out.println("Customer With Given Id Not Found");
            return;
        }

        c.calculateBill();
    }
}