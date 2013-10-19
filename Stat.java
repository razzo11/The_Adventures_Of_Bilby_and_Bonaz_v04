package bilbyandbonaz;

public abstract class Stat 
{
	private Character owner;
	private String name, desc;
	
	public Stat(Character c)
	{
		setOwner(c);
	}
	
	public Stat(Character c, String n, String d)
	{
		setOwner(c);
		setName(n);
		setDesc(d);
	}
	
	public Character getOwner()
	{
		return owner;
	}
	
	public void setOwner(Character c)
	{
		this.owner = c;
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

	public void recoverStat(int i)
	{
		//no implementation
	}
	
	public void recoverStat(double d)
	{
		//no implementation
	}

	public abstract void setBaseValue();
	
	public String toString()
	{
		return String.format("Name: %s\nDesc: %s\nValue: ",
				getName(), getDesc());
	}
}
