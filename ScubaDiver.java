import java.util.Random;

public class ScubaDiver {
	private String Name;
	private int HealthPoints;
	private int MagicPoints;
	private int goldCollected;
	
	
	ScubaDiver(){
		setName("");
		setHealthPoints(0);
		setMagicPoints(0);
		setGoldCollected(0);
	}
	
	ScubaDiver(String name, int health, int magic, int gold){
		setName(name);
		setHealthPoints(health);
		setMagicPoints(magic);
		setGoldCollected(gold);
	}
	
	public void AddMoreGold(int monsterGold){
		setGoldCollected(getGoldCollected() + monsterGold);
	}
	
	public int Attack(){
		Random rn = new Random() ;
		int range = 15 - 1 + 1;
		int damage = rn.nextInt (range) + 1;
		
		return damage;
	}
	
	public int Berserk(){
		Random rn = new Random() ;
		int range = 15 - 1 + 1;
		int damage = rn.nextInt (range) + 1;
		return damage;
	}
	
	public String toString(){
		String info = "";
		info += "Diver: " + getName() + "\n";
		info += "Health Points: " + getHealthPoints() + "\n";
		info += "Gold Collected: " + getGoldCollected() + "\n";
		info += "Magic Points: " + getMagicPoints() + "\n";
		info +=  " "
				   +"\n                             _______ ______"
				   +"\n                               |     / |    /"
				   +"\n                    O          |    /  |   /"
				   +"\n                               |   /   |  /"
				   +"\n                 o  O 0         \\  \\   \\  \\"
				   +"\n                 o               \\  \\   \\  \\"
				   +"\n                    o            /  /   /  /"
				   +"\n                     o     /\\_  /\\\\\\   /  /"
				   +"\n                      O  /    /    /     /"
				   +"\n              ..       /    /    /\\=    /"
				   +"\n             .  ))))))) = /====/    \\"
				   +"\n             . (((((((( /    /\\=  _ }"
				   +"\n             . |-----_|_+( /   \\}"
				   +"\n             . \\_<\\_//|  \\  \\ }"
				   +"\n              ...=Q=  |==)\\  \\"
				   +"\n                \\----/     ) )"   
				   +"\n                          / /"
				   +"\n                         /=/"
				   +"\n                       \\|/"
				   +"\n                       o} ";
		
		
		return info;
	}


	public String getName() {
		return Name;
	}


	public int getHealthPoints() {
		return HealthPoints;
	}


	public int getMagicPoints() {
		return MagicPoints;
	}


	public int getGoldCollected() {
		return goldCollected;
	}


	public void setName(String name) {
		Name = name;
	}


	public void setHealthPoints(int healthPoints) {
		HealthPoints = healthPoints;
	}


	public void setMagicPoints(int magicPoints) {
		MagicPoints = magicPoints;
	}


	public void setGoldCollected(int goldCollected) {
		this.goldCollected = goldCollected;
	}
	
	
}
