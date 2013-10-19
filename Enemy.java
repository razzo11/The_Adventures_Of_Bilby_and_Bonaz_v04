package bilbyandbonaz;

//Config for enemies
public class Enemy 
{
	//declaring some variables
	private static final int BASE_RES = 9;
	private static final int BASE_STRENGTH = 15;
	private static final double BASE_HEALTH = 35;
	public Status status;
	public EnemyTypes type;
	private double health;
	private int res, strength;
	private String name, desc;
	
	//make a random enemy with no stats
	public Enemy()
	{
		health = BASE_HEALTH;
		res = BASE_RES;
		strength = BASE_STRENGTH;
		name = "An enemy";
		desc = "A bio";
		status = Status.ALIVE;
	}
	
	//make an enemy with specialized name and description
	public Enemy(String n, String b)
	{
		health = BASE_HEALTH;
		res = BASE_RES;
		strength = BASE_STRENGTH;
		name = n;
		desc = b;
		status = Status.ALIVE;
	}
	
	//set and get methods to be used outside class (same as character)
	public void setRes(int r)
	{
		if(r <= BASE_RES)
			this.res = r;
		else
			this.res = BASE_RES;	
	}
	
	public int getRes()
	{
		return this.res;
	}
		
	
	public void setStrength(int s)
	{
		if(s <= BASE_STRENGTH)
			this.strength = s;
		else
			this.strength = BASE_STRENGTH;
	}
	
	public int getStrength()
	{
		return this.strength;
	}
	
	public void setHealth(double hp)
	{
		if(hp <= BASE_HEALTH)
			this.health = hp;
		else
			this.health = BASE_HEALTH;
	}
	
	public double getHealth()
	{
		return this.health;
	}
	
	public void setDesc(String d)
	{
		this.desc = d;
	}
	
	public String getDesc()
	{
		return this.desc;
	}
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void getAttacked(Character c)
	{
		health -= c.
	}

}
