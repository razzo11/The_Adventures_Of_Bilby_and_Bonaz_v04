package bilbyandbonaz;

//means this is a type of enemy
public class Deprived extends Enemy implements SpecialEnemyDropsItem
{
	//some variables unique of this enemy
	private static final String DEPRIVED_BIO = "A deprived enemy. No special traits.";
	private static final String ENEMY_NAME = "Deprived";
	
	
	

	public Deprived() 
	{
		super();
		setDesc(DEPRIVED_BIO);
		setName(ENEMY_NAME);
	}

	public Deprived(String n, String b) 
	{
		super(n, b);
		setDesc(DEPRIVED_BIO);
		setName(ENEMY_NAME);
	}
	
	public void dropSpecialItem(Character c)
	{
		DivineBlessing db = new DivineBlessing();
		db.setOwner(c);
		c.addItemToInventory(db);
	}
}
