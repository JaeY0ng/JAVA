package CH35;

public class Medic extends Unit {

	int heallingPoint;
	int mana;

	@Override
	void move() {

	}

	@Override
	void UnderAttack(int damage) {

	}

	void Healling(Unit unit) {

		while (mana >= 200) {
			mana += 2;
		}

		if (mana > 0) {
			hp += heallingPoint;
			mana -= 0.5 * heallingPoint;
		} 

	}
}
