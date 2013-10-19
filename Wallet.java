package bilbyandbonaz;

public class Wallet extends Stat
{
	private int amountOfGold;
	private static final String WALLET_DESC = "How much gold you are currently carrying";
	private static final String NAME = "Wallet";
	
	public Wallet(Character c)
	{
		super(c);
		setName(NAME);
		setDesc(WALLET_DESC);
	}
	
	public Wallet(Character c, String n, String d)
	{
		super(c, n, d);
		setBaseValue();
		setDesc(WALLET_DESC);
	}

	@Override
	public void setBaseValue() 
	{
		amountOfGold = 0;
	}
	
	public void getGold(int g)
	{
		amountOfGold += g;
	}
	
	public void loseGold(int g)
	{
		amountOfGold -= g;
		if(amountOfGold <= 0)
			amountOfGold = 0;
	}

}
