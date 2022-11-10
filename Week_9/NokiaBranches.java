/***** 
CSC248: FUNDAMENTALS OF DATA STRUCTURES
QUEUE: LAB EXERCISE 1 
QUESTION #1
*****/


public class NokiaBranches
{
	String managerName;
	int no_of_dept;
	String location;
	int no_of_worker;
	
	public NokiaBranches(String n, int dept, String loc, int num)
	{
		managerName = n;
		no_of_dept = dept;
		location = loc;
		no_of_worker = num;
	}
	
	public String getName()
	{	return managerName;	}
	
	public int getNumDept()
	{	return no_of_dept;	}
	
	public String getLocation()
	{	return location;	}
	
	public int getNumWorker()
	{	return no_of_worker;	}
	
	public String toString()
	{
		return 
		"\nName of the manager: " + managerName +
		"\nNumber of departments: " + no_of_dept +
		"\nLocation of the branch: " + location +
		"\nNumber of workers in the branch: " + no_of_worker;
	}
}