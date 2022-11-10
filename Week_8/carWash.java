public class carWash
{
	private String carType;	//MPV, van, lorry etc.
	private String washSelection; //wash and vacuum, full service, handwax dry etc
	private double amountCharge; 
	
	public carWash(String type, String wash, double charge)
	{
		carType = type;
		washSelection = wash;
		amountCharge = charge;
	}
	
	public String getCarType()
	{	return carType;	}
	
	public String getWashSelection()
	{	return washSelection;	}
	
	public double getAmountCharge()
	{	return amountCharge;	}
	
	public String toString()
	{
		return
		"\nCar type: " + getCarType() +
		"\nWash selection: " + getWashSelection() +
		"\nAmount charged: " + getAmountCharge();
	}
	
}