package bilbyandbonaz;

public class Potion extends Item 
{
	//things unique to this item
	private static final String ITEM_NAME = "Potion";
	private static final String ITEM_DESC = "A sizzling, crimson liquid. Restores some health. Probably safe to drink.";
	
	public Potion(Character c) 
	{
		super(c);
		setName(ITEM_NAME);
		setDesc(ITEM_DESC);
		setOwner(c);
		type = ItemTypes.POTION;
	}
	
	public void effect()
	{
		super.effect();
		getOwner().getHealth().recoverStat(25);
	}
}
