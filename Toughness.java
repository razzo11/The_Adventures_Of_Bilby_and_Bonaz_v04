package bilbyandbonaz;

public class Toughness extends Stat
{
	private int value;
	private static final String TOUGHNESS_DESC = "Determines your overall morale. Losing it can have adverse effects";
	private static final String NAME = "Toughness";

	public Toughness(Character c)
	{
		super(c);
		setName(NAME);
		setDesc(TOUGHNESS_DESC);
		setBaseValue();
	}
	
	public Toughness(Character c, String n, String d) 
	{
		super(c, n, d);
		setBaseValue();
		setDesc(TOUGHNESS_DESC);
	}

	@Override
	public void setBaseValue() 
	{
		value = 10;
	}
	
	@Override
	public void recoverStat(int i)
	{
		value += i;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void recoverStat()
	{
		value++;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s %d",super.toString(),getValue());
	}

	public void setValue(int i) 
	{
		if(i <= 10)
			value = i;
	}

}
