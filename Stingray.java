import java.util.Random;

public class Stingray extends Monster{
	static protected int defeated;
	
	Stingray(){
		super();
		setHealthPoints(20);
		setGoldProtected(94);
		setDefeated(defeated + 1);
		
		
	}
	
	
	public static int getDefeated(){
		return defeated -1;
	}
	
	public void setDefeated(int newDefeated){
		defeated = newDefeated;
	}

	public String toString(){
		String info = "";
		info += "VERSUS! \n";
		info += "Health Points: " + getHealthPoints() + "\n";
		info += " Gold Carrying: " + getGoldProtected() + "\n";
		info += " Number Defeated: " + (getDefeated()-1) + "\n";
		info +=  "  "
				   +"\n                (\\.-./)"
				   +"\n                /     \\"
				   +"\n              .'   :   '."
				   +"\n         _.-'`     '     `'-._"
				   +"\n      .-'          :          '-."
				   +"\n    ,'_.._         .         _.._',"
				   +"\n    '`    `'-.     '     .-' `    '"
				   +"\n              '.   :   .'"
				   +"\n                \\_. ._/"
				   +"\n          \\       |^|"
				   +"\n           |      | ;"
				   +"\n           \'.___.' /"
				   +"\n            '-....-' " ;
		
		
		
		return info;
	}

	@Override
	public int Attack() {
		
		Random rn = new Random() ;
		int range = 10 - 1 + 1;
		int damage = rn.nextInt (range) + 1;
		
		return damage;
	}
}
