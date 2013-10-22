package bilbyandbonaz;

//Config for enemies
public class Enemy 
{
	//declaring some variables
	private static final int BASE_RES = 9;
	private static final int BASE_STRENGTH = 15;
	private static final double BASE_HEALTH = 35;
	private Status status;
	private EnemyTypes type;
	private double health;
	private int res, strength;
	private String name, desc;
	private Weapon weapon;
	
	//////////////////////////////////////////////////////////CONSTRUCTORS///////////////////////////////////////////////////////////////
	public Enemy()
	{
		health = BASE_HEALTH;
		res = BASE_RES;
		strength = BASE_STRENGTH;
		name = "An enemy";
		desc = "A bio";
		setStatus(Status.ALIVE);
		weapon = null;
	}
	
	public Enemy(String n, String b)
	{
		health = BASE_HEALTH;
		res = BASE_RES;
		strength = BASE_STRENGTH;
		name = n;
		desc = b;
		setStatus(Status.ALIVE);
		weapon = null;
	}
	
	/////////////////////////////////////////////////////////////SETTERS AND GETTERS///////////////////////////////////////////////////////
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public EnemyTypes getType() {
		return type;
	}

	public void setType(EnemyTypes type) {
		this.type = type;
	}

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
	
	//////////////////////////////////////////////////////////////////////COMBAT////////////////////////////////////////////////////////////////////////////
	
	
	public void getAttacked(Character c)
	{
		health -= (c.attack()) - (1.5 * res);
		if(health <= 0)
		{
			setStatus(Status.DEAD);
		}
	}

	public double attack() 
	{
		return strength + weapon.getWeaponDamage();
	}

}
