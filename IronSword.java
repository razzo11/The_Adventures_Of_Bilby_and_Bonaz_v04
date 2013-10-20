package bilbyandbonaz;

public class IronSword extends Weapon {

	public IronSword(Character c) 
	{
		super(c);
		setName("Iron Sword");
		setDesc("A basic and frail Iron Sword");
		setWeaponDamage(10);
		setWeaponDamageType(DamageTypes.PHYSICAL);
		setWeaponType(WeaponTypes.SWORD);
		
	}

	public IronSword(Character c, DamageTypes t, WeaponTypes w, double d,
			String n, String de) 
	{
		super(c, t, w, d, n, de);
		setWeaponDamage(10);
	}

	@Override
	public void statEffects(Character c) 
	{
		//this weapon does not modify stats
	}

}
