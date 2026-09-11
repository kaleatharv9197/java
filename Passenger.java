package flight;

public class Passenger {
	static int idGenerator;
	int id ;
	String name;
	int seatNo;
	
	
	public Passenger(String name,int seatNo) {
		super();
		this.name=name;
		this.seatNo=seatNo;
		this.id=idGenerator;
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

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", seatNo=" + seatNo + "]";
	}
	
}
