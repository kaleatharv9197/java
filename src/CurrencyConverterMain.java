
class CurrencyConverterMain {

	public static void main(String[] args) {
		CurencyConverter forex;
		forex =new DollarToRupeeConverter();
		float inr =forex.doConvert(5000);
		System.out.println("$5000 = Rs."+ inr);
		System.out.println("----------------------");
		forex=new RupeeToPoundConverter();
		float gbp = forex.doConvert(2575000);
		System.out.println("Rs.2575000 GBP."+gbp);
		
	}

}
