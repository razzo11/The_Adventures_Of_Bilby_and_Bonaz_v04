package bilbyandbonaz;

public class Defense extends Stat 
{
	private int value;
	private static final String DEFENSE_DESC = "Determines your ability to reduce damage taken";
	private static final String NAME = "Defense";
	
	public Defense(Character c)
	{
		super(c);
		setBaseValue();
		setName(NAME);
		setDesc(DEFENSE_DESC);
	}
	
	public Defense(Character c, String n, String d)
	{
		super(c, n, d);
		setBaseValue();
		setDesc(DEFENSE_DESC);
	}
	
	public void setValue(int d)
	{
		if(d <= getOwner().getCurrentMaxDefense())
			value = d;
	}

	@Override
	public void setBaseValue() 
	{
		value = 9;
	}
	
	@Override
	public void recoverStat(int i)
	{
		value += i;
	}
	
	public void recoverStat()
	{
		value++;
	}
	
	public int getValue()
	{
		return value;
	}
}
