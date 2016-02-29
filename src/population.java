
public class population {

	private int startingNum;
	private double dailyIncrease;
	private int daysToMultiply;
	
	public void setStartNum(int num)
	{
		startingNum = num;
	}
	public void setDailyIncrease(double daily)
	{
		dailyIncrease = daily;
	}
	public void setdaysToMultiply(int multi)
	{
		daysToMultiply = multi;
	}
	public int getStartNum() 
	{
		return startingNum;
	}
	public double getDailyIncrease() 
	{
		return dailyIncrease;
	}
	public int setdaysToMultiply() 
	{
		return daysToMultiply;
	}

	
	public void populationIncrease()
	{
		double newpop = startingNum + (startingNum * dailyIncrease);
		System.out.printf("The population for day 1 is %.02f. \n", newpop);
		for(int count = 2; count <= daysToMultiply;)
		{
			newpop += (newpop * dailyIncrease);
			System.out.printf("The population for day %d is %.02f. \n", count, newpop);
			++count;
		}
	}


}

