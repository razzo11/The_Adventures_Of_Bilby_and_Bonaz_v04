package bilbyandbonaz;
import java.util.*;

//Configuration for characters
public class Character 
{
	
	/////////////////////////////////////////////////VARIABLES////////////////////////////////////////////////////////////////
   private int currentMaxStrength, currentMaxToughness, currentMaxDefense;
   private String name, bio;
   private Health health = new Health(this);
   private Strength strength = new Strength(this);
   private Wallet wallet = new Wallet(this);
   private Defense defense = new Defense(this);
   private Toughness toughness = new Toughness(this);
   private Weapon weapon;
   private Armor armor;
   private boolean isCharBloodied;
   private Status status;    
   //5 items and 5 abilities
   private ArrayList<Item> inventory = new ArrayList<Item>(5);
   private ArrayList<Ability> abilities = new ArrayList<Ability>(5);
   private ArrayList<Stat> stats = new ArrayList<Stat>(5); //hlth, str, def, tgh, wlt
    
   /////////////////////////////////////////////////////CONSTRUCTORS///////////////////////////////////////////////////////////////
   
    public Character(String name, String bio)
    {
    	this.name = name;
    	this.bio = bio;
    	setCurrentMaxStrength(9);
    	setCurrentMaxToughness(10);
    	setCurrentMaxDefense(10);
    	setSpawnWeapon();
    	setSpawnArmor();
    	//going to try to find a better way to order these
    	stats.add(health);
    	stats.add(strength);
    	stats.add(defense);
    	stats.add(toughness);
    	stats.add(wallet);
    	abilities.clear();
    	setCharBloodied(false);
    }
    
    ////////////////////////////////////////////////////////SETTERS AND GETTERS///////////////////////////////////////////////////////
    
    public void setSpawnArmor()
    {
    	equipArmor(new IronArmor(this));
    }
    
    public void setSpawnWeapon()
    {
    	weapon = new IronSword(this);
    }
    
    public Weapon getWeapon()
    {
    	return weapon;
    }
    
    public void equipWeapon(Weapon w)
    {
    	this.weapon = w;
    }
    
    public Armor getArmor() 
    {
		return armor;
	}

	public void equipArmor(Armor armor) 
	{
		this.armor = armor;
	}

	public Health getHealth()
    {
    	return health;
    }
    
    public Strength getStrength()
    {
    	return strength;
    }
    
    public Defense getDefense()
    {
    	return defense;
    }
    
    public Toughness getToughness()
    {
    	return toughness;
    }
    
    public Wallet getWallet()
    {
    	return wallet;
    }
    
    public void setBio(String b)
    {
    	bio = b;
    }
    
    public String getBio()
    {
    	return bio;
    }
    
    public void setName(String n)
    {
    	name = n;
    }
    
    public String getName()
    {
    	return name;
    }
    
	public int getCurrentMaxDefense()
	{
		return currentMaxDefense;
	}

	public void setCurrentMaxDefense(int currentMaxDefense) 
	{
		this.currentMaxDefense = currentMaxDefense;
	}

	public int getCurrentMaxToughness() 
	{
		return currentMaxToughness;
	}

	public void setCurrentMaxToughness(int currentMaxToughness) 
	{
		this.currentMaxToughness = currentMaxToughness;
	}

	public int getCurrentMaxStrength()
	{
		return currentMaxStrength;
	}

	public void setCurrentMaxStrength(int currentMaxStrength) 
	{
		this.currentMaxStrength = currentMaxStrength;
	}
	
	////////////////////////////////////////////////////////////MANIPULATE STATS/////////////////////////////////////////////////////////////
	
	public void raiseCurrentMaxStrength()
    {
    	currentMaxStrength++;
    }
    
    public void raiseCurrentMaxToughness()
    {
    	currentMaxToughness++;
    }
    
    public void raiseCurrentMaxDefense()
    {
    	currentMaxDefense++;
    }
	
	///////////////////////////////////////////////////INVENTORY MANIPULATION//////////////////////////////////////////////////////////

	public boolean searchInventory(Item i)
	{
		boolean search = inventory.contains(i);
		return search;
	}
	
	public void addItemToInventory(Item i)
	{
		try
		{
			inventory.add(i);
		}
		catch(Exception e)
		{
			System.out.println("Inventory full");
		}
	}
	
	///////////////////////////////////////////////////////////////COMBAT////////////////////////////////////////////////////////////

	public double attack()
	{
		return (getStrength().getValue()) + (1.8 * getWeapon().getWeaponDamage());
	}
	
	public void getAttacked(Enemy e)
	{
		double charHealth = getHealth().getValue();
		charHealth -= (e.attack()) - (1.8 * getDefense().getValue()) - (3.0 * getArmor().getArmorBonus());
		getHealth().setValue(charHealth);
		checkStatus();
	}
	
	public void halfAllStatsIfBloodied()
	{
		getDefense().setValue(getDefense().getValue() / 2);
		getStrength().setValue(getStrength().getValue() / 2);
		getToughness().setValue(getToughness().getValue() / 2);
	}
	
	public void returnStatsToNormal()
	{
		getDefense().setValue(getDefense().getValue() * 2);
		getStrength().setValue(getStrength().getValue() * 2);
		getToughness().setValue(getToughness().getValue() * 2);
	}
	
	public boolean isCharBloodied() 
	{
		return isCharBloodied;
	}

	public void setCharBloodied(boolean isCharBloodied) 
	{
		this.isCharBloodied = isCharBloodied;
	}

	public void checkStatus()
	{
		double charHealth = getHealth().getValue();
		if(charHealth <= 100 && charHealth > 30)
			if(isCharBloodied)
			{
				getDefense().setValue(getDefense().getValue() / 2);
				getStrength().setValue(getStrength().getValue() / 2);
				getToughness().setValue(getToughness().getValue() / 2);
				setStatus(Status.ALIVE);
			}
			else 
				setStatus(Status.ALIVE);
		if(charHealth <= 30 && charHealth != 0)
			if(!isCharBloodied)
			{
				setStatus(Status.BLOODIED);
				halfAllStatsIfBloodied();
				isCharBloodied = true;
			}
			else if(isCharBloodied)
			{
				setStatus(Status.BLOODIED);
			}
		if(charHealth <= 0)
			setStatus(Status.DEAD);	
	}
	
	public Status getStatus() 
	{
		return status;
	}

	public void setStatus(Status status) 
	{
		this.status = status;
	}

	public void useAbility(Ability a)
	{
		a.activate(this);
	}
}
