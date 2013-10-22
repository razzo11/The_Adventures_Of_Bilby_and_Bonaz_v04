package bilbyandbonaz;

public abstract class Armor implements Equipment
{
	private Character owner;
	private ArmorTypes type;
	private String name, desc;
	private double armorBonus;
	private int armorIntegrity;
	
	public Armor(Character c)
	{
		setOwner(c);
		setName("Name");
		setDesc("Desc");
		setArmorBonus(5);
		setArmorIntegrity(100);
		setType(null);
	}

	public Character getOwner() 
	{
		return owner;
	}

	public void setOwner(Character owner) 
	{
		this.owner = owner;
	}

	public ArmorTypes getType()
	{
		return type;
	}

	public void setType(ArmorTypes type) 
	{
		this.type = type;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getDesc() 
	{
		return desc;
	}

	public void setDesc(String desc) 
	{
		this.desc = desc;
	}

	public double getArmorBonus() 
	{
		return armorBonus;
	}

	public void setArmorBonus(double armorBonus) 
	{
		this.armorBonus = armorBonus;
	}

	public int getArmorIntegrity() 
	{
		return armorIntegrity;
	}

	public void setArmorIntegrity(int armorIntegrity) 
	{
		this.armorIntegrity = armorIntegrity;
	}
}
