
public class distance {
	
	private int mph;
	private int hours;
	
	public void setMPH(int miles)
	{
		mph = miles;
	}
	public void setHours(int h)
	{
		hours = h;
	}
	public int getDistance()
	{
		return mph * hours; 
	}
	public int getMPH()
	{
		return mph;
	}
	public int getHours()
	{
		return hours;
	}
}
