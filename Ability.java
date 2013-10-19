package bilbyandbonaz;

//abilities!
public class Ability 
{
	 private Character owner;
	 private String name, desc;
	 
	 public Ability(Character c, String n, String d)
	 {
		 owner = c;
		 name = n;
		 desc = d;
	 }
	
	 public void setOwner(Character c)
	 {
		 this.owner = c;
	 }
	
	 public Character getOwner()
	 {
		 return this.owner;
	 }
	 
	 public void setName(String n)
	 {
		 this.name = n;
	 }
	 
	 public String getName()
	 {
		 return this.name;
	 }
	 
	 public void setDesc(String d)
	 {
		 desc = d;
	 }
	 
	 public String getDesc()
	 {
		 return desc;
	 }
	 
	 public void activate(Character c)
	 {
		 //invoked in every ability
	 }
}
