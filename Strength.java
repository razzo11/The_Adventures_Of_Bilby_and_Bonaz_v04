package bilbyandbonaz;

public class Strength extends Stat
{	
	private int value;
	private static final String STRENGTH_DESC = "Determines the damage you do with physical attacks";
	private static final String NAME = "Strength";

	public Strength(Character c)
	{
		super(c);
		setName(NAME);
		setDesc(STRENGTH_DESC);
	}
	
	public Strength(Character c, String n, String d) 
	{
		super(c, n, d);
		setBaseValue();
		setDesc(STRENGTH_DESC);
	}

	@Override
	public void setBaseValue() 
	{
		value = 9;
	}
	
	public void recoverStat()
	{
		value++;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) 
	{
		if(value <= getOwner().getCurrentMaxStrength())
			this.value = value;
	}

}
