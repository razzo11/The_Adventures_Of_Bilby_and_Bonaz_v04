package bilbyandbonaz;
import java.util.*;

//Configuration for characters
public class Character 
{
	
	//declaring some variables
   private int currentMaxStrength, currentMaxToughness, currentMaxDefense;
   private String name, bio;
   private Health health = new Health(this);
   private Strength strength = new Strength(this);
   private Wallet wallet = new Wallet(this);
   private Defense defense = new Defense(this);
   private Toughness toughness = new Toughness(this);
   private Weapon weapon;
   private double attackDamage;
   
   public Status status;    
   //5 items and 5 abilities
   private ArrayList<Item> inventory = new ArrayList<Item>(5);
   private ArrayList<Ability> abilities = new ArrayList<Ability>(5);
   private ArrayList<Stat> stats = new ArrayList<Stat>(5); //hlth, str, def, tgh, wlt
    
    public Character(String name, String bio)
    {
    	this.name = name;
    	this.bio = bio;
    	setCurrentMaxStrength(9);
    	setCurrentMaxToughness(10);
    	setCurrentMaxDefense(10);
    	//going to try to find a better way to order these
    	stats.add(health);
    	stats.add(strength);
    	stats.add(defense);
    	stats.add(toughness);
    	stats.add(wallet);
    	abilities.clear();
    }
    
    public void setSpawnWeapon()
    {
    	weapon = new IronSword
    }
    
    public Weapon getWeapon()
    {
    	return weapon;
    }
    
    public void equipWeapon(Weapon w)
    {
    	this.weapon = w;
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

	public void setCurrentMaxDefense(int currentMaxDefense) {
		this.currentMaxDefense = currentMaxDefense;
	}

	public int getCurrentMaxToughness() {
		return currentMaxToughness;
	}

	public void setCurrentMaxToughness(int currentMaxToughness) {
		this.currentMaxToughness = currentMaxToughness;
	}

	public int getCurrentMaxStrength() {
		return currentMaxStrength;
	}

	public void setCurrentMaxStrength(int currentMaxStrength) {
		this.currentMaxStrength = currentMaxStrength;
	}

	public boolean searchInventory(Item i)
	{
		boolean search = inventory.contains(i);
		return search;
	}
	
	public double attack()
	{
		return getStrength().getValue() *
	}
	
	public void useAbility(Ability a)
	{
		a.activate(this);
	}

}
