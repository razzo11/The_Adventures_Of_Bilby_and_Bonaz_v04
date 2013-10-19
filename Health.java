package bilbyandbonaz;

public class Health extends Stat 
{
	private double value;
	private static final String HEALTH_DESC = "Determines whether you are alive or dead.";
	private static final String NAME = "Health";

	public Health(Character c)
	{
		super(c);
		setName(NAME);
		setDesc(HEALTH_DESC);
		setBaseValue();
	}
	
	public Health(Character c, String n, String d) 
	{
		super(c, n, d);
		setBaseValue();
		setDesc(HEALTH_DESC);
	}
	
	@Override
	public void setBaseValue() 
	{
		value = 100;
	}
	
	@Override
	public void recoverStat(double d)
	{
		value += d;
		if(value >= 100)
			value = 100;	
	}
	
	public double getValue() 
	{
		return value;
	}
	
	public void setValue(double v)
	{
		if(value <= 100)
			value = v;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s %.2f\n", super.toString(), getValue());
	}
	
}
