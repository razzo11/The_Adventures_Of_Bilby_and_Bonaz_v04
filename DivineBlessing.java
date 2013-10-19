package bilbyandbonaz;

public class DivineBlessing extends Item
{
	//these are things unique to this item
	private static final String ITEM_NAME = "Divine Blessing";
	private static final String ITEM_DESC = "A frothy golden liquid. Handed down by The Goddess. Extremely rare. Effects unknown.";
	
	public DivineBlessing(Character c) 
	{
		super(c);
		setDesc(ITEM_DESC);
		setName(ITEM_NAME);
		setOwner(c);
	}
	
	public void effect()
	{
		//restore all stats to full
		super.effect();
		getOwner().getHealth().setValue(100);
		getOwner().getToughness().setValue(getOwner().getCurrentMaxToughness());
		getOwner().getStrength().setValue(getOwner().getCurrentMaxStrength());
		getOwner().getDefense().setValue(getOwner().getCurrentMaxDefense());
	}
	
	
	
}
