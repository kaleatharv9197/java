
public class RupeeToPoundConverter implements CurencyConverter {

	@Override
	public float doConvert(float amountInIndianRupee) {
		// TODO Auto-generated method stub
		float amountInPound= amountInIndianRupee /POUND_to_RUPEE;
		
		return amountInPound;
		
				
				

				
	}

}
