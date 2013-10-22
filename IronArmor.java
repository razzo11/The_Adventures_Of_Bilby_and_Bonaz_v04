package bilbyandbonaz;

public class IronArmor extends Armor 
{
	public IronArmor(Character c) 
	{
		super(c);
		setName("Iron Armor");
		setDesc("Poorly made Iron Armor. Provides some protection.");
		setArmorBonus(7.6);
		setType(ArmorTypes.HEAVY_ARMORED);
	}

	@Override
	public void statEffects(Character c) 
	{
		//no implementation. this item does not affect stats
	}

}
