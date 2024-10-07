package CH35;

public abstract class Building {
	public int hp;
	public int shield;
	public int ammor;
	
	public abstract void buildStructure();
	public abstract void underAttack(Unit unit);
	
	
}
