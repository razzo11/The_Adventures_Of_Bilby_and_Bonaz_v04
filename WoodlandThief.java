package bilbyandbonaz;

public class WoodlandThief extends Enemy 
{
	private static final int WOODLAND_THIEF_STRENGTH = 16;
	private static final int WOODLAND_THIEF_RES = 10;
	private static final double WOODLAND_THIEF_HEALTH = 40;
	
	public WoodlandThief()
	{
		super();
		setStrength(WOODLAND_THIEF_STRENGTH);
		setRes(WOODLAND_THIEF_RES);
		setHealth(WOODLAND_THIEF_HEALTH);
		type = EnemyTypes.WOODLAND_THIEF;
	}
	
	
	
	
	
	
	
	
	
}
