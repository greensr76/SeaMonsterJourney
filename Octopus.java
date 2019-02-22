import java.util.Random;

public class Octopus extends Monster {
	
	Octopus(){
		super();
		setHealthPoints(100);
		setGoldProtected(14);
	}
	
	public int Attack (){
		int damage = 0;
		
		Random rn = new Random() ;
		int range = 20 - 1 + 1;
		damage = rn.nextInt (range) + 1;
		
		return damage;
	}
	
	public String toString(){
			String info = "";
			info += "VERSUS! \n";
			info += "Health Points: " + getHealthPoints() + "\n";
			info += " Gold Carrying: " + getGoldProtected() + "\n";
			info += " Number Defeated: " + 0 + "\n";
			info += " "
					   +"\n                    .-'   `'. "
					   +"\n                   /         \\ "
					   +"\n                   |         ; "
					   +"\n                   |         |           ___.--, "
					   +"\n          _.._     |0) ~ (0) |    _.---'`__.-( (_. "
					   +"\n   __.--'`_.. '.__.\\    '--. \\_.-' ,.--'`      `\"\"` "
					   +"\n  ( ,.--'`   ',__ /./;   ;, '.__.'`    __ "
					   +"\n  _`) )  .---.__.' / |   |\\   \\__..--\"\"  \"\"\"--.,_ "
					   +"\n `---' .'.''-._.-'`_./  /\\ '.  \\ _.-~~~````~~~-._`-.__.' "
					   +"\n       | |  .' _.-' |  |  \\  \\  '.               `~---` "
					   +"\n        \\ \\/ .'     \\  \\   '. '-._) "
					   +"\n         \\/ /        \\  \\    `=.__`~-. "
					   +"\n         / /\\         `) )    / / `\"\".`\\ "
					   +"\n   , _.-'.'\\ \\        / /    ( (     / / "
					   +"\n    `--~`   ) )    .-'.'      '.'.  | ( "
					   +"\n           (/`    ( (`          ) )  '-; "
					   +"\n            `      '-;         (-'  "   ;
			
			
			return info;
		
	}
}
