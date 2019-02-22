import java.util.Random;

public class Lobster extends Monster{
	static protected int defeated;
	
	Lobster(){
		setHealthPoints(10);
		setGoldProtected(1);
		setDefeated(defeated + 1);
	}
	
	

	public static int getDefeated() {
		return defeated -1;
	}



	public static void setDefeated(int defeated) {
		Lobster.defeated = defeated;
	}

	public String toString(){
		String info = "";
		info += "VERSUS! \n";
		info += "Health Points: " + getHealthPoints() + "\n";
		info += " Gold Carrying: " + getGoldProtected() + "\n";
		info += " Number Defeated: " + (getDefeated()-1) + "\n";
		info += " "
				   +"\n           .\"\".-._.-.\"\". "
				   +"\n          |   \\  |  /   | "
				   +"\n           \\   \\.T./   /  "
				   +"\n            '-./   \\.-' "
				   +"\n              /     \\ "
				   +"\n             ;       ; "
				   +"\n             |       | "
				   +"\n             |       | "
				   +"\n            /         \\ "
				   +"\n            |    .    | "
				   +"\n         __.|    :    |.__ "
				   +"\n     .-'`   |    :    |   `'-. "
				   +"\n   /`     .\"\\  0 : 0  /\".     `\\ "
				   +"\n  |     _/   './ : \\.'   \\_     | "
				   +"\n  |    /      /`\"\"\"`\\      \\    | "
				   +"\n   \\   \\   .-'       '._   /   / "
				   +"\n    '-._\\                 /_.-'  " ;
		
		return info;
	}

	@Override
	public int Attack() {
		
		Random rn = new Random() ;
		int range = 5 - 1 + 1;
		int damage = rn.nextInt (range) + 1;
		
		return damage;
	}
}
