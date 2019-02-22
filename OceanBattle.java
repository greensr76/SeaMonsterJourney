
public class OceanBattle {
	private ScubaDiver Fighter;
	private Monster [] OceanMonsters = new Monster [4];
	
	OceanBattle(ScubaDiver hero, Monster[] monsters){
		setFighter(hero);
		setOceanMonsters(monsters);
		
	}
	
	public void Fight(){
		System.out.println("--------------------------------------");
		System.out.println("What will you do? [A]ttack, \n[B]erserk attack (3x damage, 2x return damage), \n[M]agic (heal to full, but the monster gets a free attack!), \n[R]unaway (get away from the monster, but it gets a free attack!");
		

	}
	
	public boolean Runaway(Monster m){
		int MonsterDamage = 0;
		if (m instanceof Lobster){
			MonsterDamage = ((Lobster)m).Attack();
		}
		else if (m instanceof Stingray){
			MonsterDamage = ((Stingray)m).Attack();
		}
		else if (m instanceof Shark){
			MonsterDamage = ((Shark)m).Attack();
		}
		else if (m instanceof Octopus){
			MonsterDamage = ((Octopus)m).Attack();
		}
		System.out.printf("You run away from the monster but they get one last attack doing %3d damage \n",MonsterDamage);
		
		Fighter.setHealthPoints(Fighter.getHealthPoints() - MonsterDamage);
	
		return true;
	}
	
	public void Attack(Monster m){
		int HeroDamage = Fighter.Attack();
		m.setHealthPoints(m.getHealthPoints() - HeroDamage);
		
		int MonsterDamage = 0;
		if (m instanceof Lobster){
			MonsterDamage = ((Lobster)m).Attack();
			System.out.printf("You hit the monster for %2d damage! \nIt counters with its immobilizing pincer attack for %2d damage! \n", HeroDamage, MonsterDamage);
		}
		else if (m instanceof Stingray){
			MonsterDamage = ((Stingray)m).Attack();
			System.out.printf("You hit the monster for %2d damage! \nIt counters with its poisoning sting attack for %2d damage! \n", HeroDamage,MonsterDamage);
		}
		else if (m instanceof Shark){
			MonsterDamage = ((Shark)m).Attack();
			System.out.printf("You hit the monster for %2d damage! \nIt counters with its vicious bite attack for %2d damage! \n", HeroDamage,MonsterDamage);
		}
		else if (m instanceof Octopus){
			MonsterDamage = ((Octopus)m).Attack();
			System.out.printf("You hit the monster for %2d damage! \nIt counters with its black ink attack for %2d damage! \n",HeroDamage,MonsterDamage);
		}
		
		Fighter.setHealthPoints(Fighter.getHealthPoints() - MonsterDamage);
		
	}
	public void Berserk(Monster m){
		int HeroDamage = Fighter.Attack() * 3;
		m.setHealthPoints(m.getHealthPoints() - HeroDamage);
		int MonsterDamage = 0;
		if (m instanceof Lobster){
			MonsterDamage = ((Lobster)m).Attack();
			System.out.printf("You fly into a wild rage! You manage to hit the monster for %2d points of damage! But you're left open, and the monster strikes with its immobilizing pincer attack for %2d damage! \n",HeroDamage,MonsterDamage);
		}
		else if (m instanceof Stingray){
			MonsterDamage = ((Stingray)m).Attack();
			System.out.printf("You fly into a wild rage! You manage to hit the monster for %2d points of damage! But you're left open, and the monster strikes with its poisoning sting attack for %2d damage! \n",HeroDamage,MonsterDamage);

		}
		else if (m instanceof Shark){
			MonsterDamage = ((Shark)m).Attack();
			System.out.printf("You fly into a wild rage! You manage to hit the monster for %2d points of damage! But you're left open, and the monster strikes with its vicous bite attack for %2d damage! \n",HeroDamage,MonsterDamage);
		}
		else if (m instanceof Octopus){
			MonsterDamage = ((Octopus)m).Attack();
			System.out.printf("You fly into a wild rage! You manage to hit the monster for %2d points of damage! But you're left open, and the monster strikes with its black ink attack for %2d damage! \n",HeroDamage,MonsterDamage);
		}
		
		Fighter.setHealthPoints(Fighter.getHealthPoints() - MonsterDamage * 2);
	}
	
	public void Magic(Monster m){
		Fighter.setHealthPoints(100);
		Fighter.setMagicPoints(Fighter.getMagicPoints() - 1);
		System.out.println("");
		
		int MonsterDamage = 0;
		if (m instanceof Lobster){
			MonsterDamage = ((Lobster)m).Attack();
			System.out.printf("You use one of your spare oxygen to return to full health! \nHowever, the monster is able to get in a strike with its immobilizing pincer attack for %2d damage while you change tanks! \n", MonsterDamage);
		}
		else if (m instanceof Stingray){
			MonsterDamage = ((Stingray)m).Attack();
			System.out.printf("You use one of your spare oxygen to return to full health! \nHowever, the monster is able to get in a strike with its poisoning sting attack for %2d damage while you change tanks! \n", MonsterDamage);
		}
		else if (m instanceof Shark){
			MonsterDamage = ((Shark)m).Attack();
			System.out.printf("You use one of your spare oxygen to return to full health! \nHowever, the monster is able to get in a strike with its vicious bite attack for %2d damage while you change tanks! \n", MonsterDamage);
		}
		else if (m instanceof Octopus){
			MonsterDamage = ((Octopus)m).Attack();
			System.out.printf("You use one of your spare oxygen to return to full health! \nHowever, the monster is able to get in a strike with its black ink attack for %2d damage while you change tanks! \n", MonsterDamage);
		}
		
		Fighter.setHealthPoints(Fighter.getHealthPoints() - MonsterDamage);
	}
	
	public void Statistics(){
		int gold = Fighter.getGoldCollected();
		System.out.println("Through your quest to save the princess from the octopus you collected " + gold + " gold");
		System.out.printf("Lobster defeated: %3d \nStingray Defeated: %3d \nShark Defeated: %3d \n",Lobster.getDefeated(),Stingray.getDefeated(), Shark.getDefeated());
	}

	public ScubaDiver getFighter() {
		return Fighter;
	}

	public Monster[] getOceanMonsters() {
		return OceanMonsters;
	}

	public void setFighter(ScubaDiver fighter) {
		Fighter = fighter;
	}

	public void setOceanMonsters(Monster[] oceanMonsters) {
		
		for (int i = 0; i < oceanMonsters.length; i ++){
			OceanMonsters[i] = oceanMonsters[i];
		}
	}
	
	
}
