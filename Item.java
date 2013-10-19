package bilbyandbonaz;

public class Item 
{
	//variables
	private Character owner;
	private String name, desc;
	public ItemTypes type;
	
	//making items
	public Item(Character c)
	{
		name = "Item";
		desc = "Does something";
		owner = c;
		setType(ItemTypes.NULL);
	}
	
	public Item(String n, Character c)
	{
		name = n;
		desc = "Does something";
		owner = c;
		setType(ItemTypes.NULL);
	}
	
	public Item(String n, String d, ItemTypes t, Character c)
	{
		this.name = n;
		this.desc = d;
		owner = c;
		setType(t);
	}

	public void setType(ItemTypes t)
	{
		type = t;
	}
	
	public Character getOwner()
	{
		return owner;
	}
	
	public void setOwner(Character c)
	{
		owner = c;
	}
	
	public void effect()
	{
		//should be set for every item
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setDesc(String d)
	{
		this.desc = d;
	}
	
	@Override
	public String toString()
	{
		return name + ": " + desc;
	}
}
