package ridessss;

public class Ride {
	static int idGenerator= 1000;
	int id;
	String source;
	String destination;
	int fare;
	String status;
	
	public Ride( String source, String destination, int fare) {
		this.id = idGenerator++;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
		this.status = "Book";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Ride [id=" + id + ", source=" + source + ", destination=" + destination + ", fare=" + fare + ", status="
				+ status + "]";
	}
}
