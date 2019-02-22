import java.util.Random;
import java.util.Scanner;

public class Program3Test {

	public static void main(String[] args) {
		boolean octopusDefeatedFlag = false;
		Monster [] oceanMonsters = new Monster [4];

		
		System.out.println("Welcome to the start of your adventure! The evil octopus has kidnapped the fair \nprincess of JavaLabnia! With only three spare oxygen tanks, can you make it past the \narmy of monster standing between you and her? \nWe all believe in you!");
		
		System.out.println("Enter the diver's name: ");
		Scanner inputData = new Scanner(System.in);
		String diverName = inputData.nextLine();
		
		ScubaDiver hero = new ScubaDiver(diverName, 100, 3, 0);
		boolean RunawayFlag = false;
		OceanBattle battle = new OceanBattle( hero,  oceanMonsters);
		oceanMonsters[0] = new Lobster();
		oceanMonsters[1] = new Stingray();
		oceanMonsters[2] = new Shark();
		oceanMonsters[3] = new Octopus();
		
		while ((hero.getHealthPoints() > 0) && (octopusDefeatedFlag == false)){
			

			
			Random rn = new Random() ;
			int range = 11 - 1 + 1;
			int monsterChoice = rn.nextInt (range) + 1;
			Monster currentMonster = null;
			
			if ((monsterChoice >= 0) && (monsterChoice <= 2)){
				currentMonster = oceanMonsters[0];
				oceanMonsters[0] = new Lobster();
			}
			else if ((monsterChoice >= 3) && (monsterChoice <= 5)){
				currentMonster = oceanMonsters[1];
				oceanMonsters[1] = new Stingray();
			}
			else if ((monsterChoice >= 6) && (monsterChoice <= 8)){
				currentMonster = oceanMonsters[2];
				oceanMonsters[2] = new Shark();
			}
			else if ((monsterChoice >= 9) && (monsterChoice <= 10)){
				currentMonster = oceanMonsters[3];
			}
			else if (monsterChoice == 11){
				System.out.println("You found a spare oxygen tank!");
				hero.setMagicPoints(hero.getMagicPoints() + 1);
				currentMonster = oceanMonsters[0];
			}
			
			
			System.out.println(hero);
			System.out.println(currentMonster);
			
			
			RunawayFlag = false;
			
			while(((currentMonster.getHealthPoints() > 0 ) && (hero.getHealthPoints() > 0)) && (RunawayFlag == false)){
				battle.Fight();
				String option = inputData.nextLine();
				String optionUpper = option.toUpperCase();
				if (optionUpper.equals("A")){
					battle.Attack(currentMonster);
				}
				else if (optionUpper.equals("B")){
					battle.Berserk(currentMonster);
				}
				else if (optionUpper.equals("M")){
					battle.Magic(currentMonster);
				}
				else if (optionUpper.equals("R")){
					RunawayFlag = battle.Runaway(currentMonster);
				}
				else{
					System.out.println("INVALID OPTION");
				}
				
				if ((hero.getHealthPoints() < 0) && (hero.getMagicPoints() > 0)){
					battle.Magic(currentMonster);
				}
				System.out.println(hero);
				System.out.println(currentMonster);
				
				
				
				if (currentMonster instanceof Octopus){
					octopusDefeatedFlag = true;
				}
				
			}
				
			hero.setGoldCollected(hero.getGoldCollected() + currentMonster.getGoldProtected());
			
		
			
			
			
			
			
		}
			if (octopusDefeatedFlag == true){
				System.out.println("Congratulations! You saved the princess!");
			}
			else{
				System.out.println("Our hero was never to be seen again.");
			}
			battle.Statistics();
	
	
	
	
	
	
	}



}
