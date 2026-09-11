package flight;

import java.util.ArrayList;

public class BuissnessFlight extends Flight {
	boolean bagAccess;

	public BuissnessFlight(String flightNo, String source, String destination, ArrayList<Passenger> passenger) {
		super(flightNo, source, destination);
		bagAccess=true;
	}

}
