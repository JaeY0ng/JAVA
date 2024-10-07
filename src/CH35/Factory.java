package CH35;

public class Factory extends Building implements ICanFly{
	
	AddOn addOn;
	
	Factory(){
		
	}
	
	void setAddOn(AddOn addOn) {
		this.addOn = addOn;
	}
	
	public Marine GetMarine(){
		return null;
	}
	public Medic GetMedic(){
		return null;
	}

	@Override
	public void move() {
		
	}

	@Override
	public void land() {
		
	}

	@Override
	public void fly() {
		
	}

	@Override
	public void buildStructure() {
		
	}

	@Override
	public void underAttack(Unit unit) {
		
	}

}