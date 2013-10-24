package bilbyandbonaz;

class CharTest {

	public static void main(String[] args) 
	{
		Character c = new Character("Test", "Test bio");
		System.out.println(c.getName());
		System.out.println("Health: " + c.getHealth().getValue());
		c.addItemToInventory(new Potion(c));
		c.getHealth().setValue(50);
		System.out.println("Health after deduction: " + c.getHealth().getValue());
		
		

	}

}
