/*****
CSC248 - FUNDAMENTALS OF DATA STRUCTURE
STACK: LAB 1
QUESTION 1
*****/

public class Property
{
	private String propertyNo;
	private String propertyLocation;
	private String ownerName;
	
	public Property(String pNo, String pLocation, String owner)
	{
		propertyNo = pNo;
		propertyLocation = pLocation;
		ownerName = owner;
	}
	
	public Property()
	{
		propertyNo = "";
		propertyLocation = "";
		ownerName = "";
	}
	
	public String getPropertyNo()
	{	return propertyNo;	}
	
	public String getPropertyLocation()
	{	return propertyLocation;	}
	
	public String getOwnerName()
	{	return ownerName;	}
	
	public String toString()
	{
		return
		"\nProperty No = " + propertyNo +
		"\nProperty location = " + propertyLocation +
		"\nOwner of the property = " + ownerName;
	}
}