package bilbyandbonaz;

//Beginnings of NPC function
public class NonPlayingCharacter 
{
	//variables
	private int characterID;
	private String name, bio;
	
	
	public NonPlayingCharacter()
	{
		setCharacterID(0);
		setName("name");
		setBio("bio");
	}
	
	public NonPlayingCharacter(int i, String n, String b)
	{
		setCharacterID(i);
		setName(n);
		setBio(b);
	}

	public int getCharacterID() {
		return characterID;
	}

	public void setCharacterID(int characterID) 
	{
		this.characterID = characterID;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getBio() 
	{
		return bio;
	}

	public void setBio(String bio)
	{
		this.bio = bio;
	}
}
