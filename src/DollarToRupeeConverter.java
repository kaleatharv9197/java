
public class DollarToRupeeConverter implements CurencyConverter{

	@Override
	public float doConvert(float amountInUsDoller) {
		// TODO Auto-generated method stub
		float amountInIndianRupee = amountInUsDoller * DOLLAR_to_RUPEE;
		
		return amountInIndianRupee;
	}

}
