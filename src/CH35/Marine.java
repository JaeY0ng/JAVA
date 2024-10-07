package CH35;

public class Marine extends Unit{

	public int damageVal;
	public Gun myGun;
	
	
	Marine(){
		
		myGun = new Rifle();
		
	}
	
	public void setMyGun(Gun gun){ // 바꾸기 위한 메서드
		this.myGun = gun;
	}
	
	@Override
	void move() {
		
	}

	@Override
	void UnderAttack (int damage) {
		hp -= damage;
	}
	void attack(Unit unit) {
		
	}
}
