
public abstract class Monster {
	protected int HealthPoints;
	protected int GoldProtected;
	protected String FightWeapon;
	
	
	Monster(){
		setHealthPoints(0);
		setGoldProtected(0);
		setFightWeapon("******");
	}
	
	public abstract int Attack ();
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Monster [HealthPoints=" + HealthPoints + ", GoldProtectedHoard=" + 0 + ", FightWeapon="
				+ FightWeapon + "]";
	}

	public int getHealthPoints() {
		return HealthPoints;
	}
	public int getGoldProtected() {
		return GoldProtected;
	}

	public String getFightWeapon() {
		return FightWeapon;
	}
	public void setHealthPoints(int healthPoints) {
		HealthPoints = healthPoints;
	}
	public void setGoldProtected ( int goldProtected) {
		GoldProtected = goldProtected;
	}
	public void setFightWeapon(String fightWeapon) {
		FightWeapon = fightWeapon;
	}
	
	
	
}
