package CH35;

public abstract class Gun {
	public int bullitCnt;
	public int power;
	
	public abstract void fire (Unit unit);
	public abstract void reload (int bullit);
}
