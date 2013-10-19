package bilbyandbonaz;

public abstract class Weapon implements Equipment
{
	private Character owner;
	private String name, desc;
	private double damage;
	private DamageTypes damageType;
	private WeaponTypes weaponType;
	
	//a generic weapon with no unique stats
	public Weapon(Character c)
	{
		setOwner(c);
	}

	public Weapon(Character c, DamageTypes t, WeaponTypes w, double d, String n, String de)
	{
		setOwner(c);
		setWeaponDamageType(t);
		setWeaponType(w);
		setWeaponDamage(d);
		setName(n);
		setDesc(de);
	}
	
	
	
	public void setWeaponDamage(double d)
	{
		damage = d;
	}
	
	public double getWeaponDamage()
	{
		return this.damage;
	}
	
	public void setWeaponDamageType(DamageTypes t)
	{
		damageType = t;
	}
	
	public DamageTypes getWeaponDamageType()
	{
		return this.damageType;
	}



	public WeaponTypes getWeaponType() {
		return weaponType;
	}



	public void setWeaponType(WeaponTypes weaponType) {
		this.weaponType = weaponType;
	}



	public Character getOwner() {
		return owner;
	}



	public void setOwner(Character owner) {
		this.owner = owner;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDesc() {
		return desc;
	}



	public void setDesc(String desc) {
		this.desc = desc;
	}

}
