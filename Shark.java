import java.util.Random;

public class Shark extends Monster {
	static protected int defeated;
	
	public static int getDefeated() {
		return defeated -1;
	}

	public static void setDefeated(int defeated) {
		Shark.defeated = defeated;
	}

	Shark(){
		setHealthPoints(50);
		setGoldProtected(53);
		setDefeated(defeated + 1);
	}
	
	public String toString(){
		String info = "";
		info += "VERSUS! \n";
		info += "Health Points: " + getHealthPoints() + "\n";
		info += " Gold Carrying: " + getGoldProtected() + "\n";
		info += " Number Defeated: " + (getDefeated()-1) + "\n";
		info +=  " "
				   +"\n _________         .    . "
				   +"\n(..       \\_    ,  |\\  /| "
				   +"\n \\       O  \\  /|  \\ \\/ / "
				   +"\n  \\______    \\/ |   \\  /  "
				   +"\n     vvvv\\    \\ |   /  | "
				   +"\n     \\^^^^  ==   \\_/   | "
				   +"\n      `\\_   ===    \\.  | "
				   +"\n      / /\\_   \\ /      | "
				   +"\n      |/   \\_  \\|      / "
				   +"\n             \\________/  " ;
		
		
		return info;
		
	}

	@Override
	public int Attack() {
		
		Random rn = new Random() ;
		int range = 25 - 1 + 1;
		int damage = rn.nextInt (range) + 1;
		
		return damage;
	}
}

