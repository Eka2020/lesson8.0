package kg.geektech.game.players;

public class Magic extends Hero {
    public int selectedDamage;

    public Magic(int health, int damage, int selectedDamage) {

        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (!heroes[i].getAbility().equals(SuperAbility.SAVE_DAMAGE_AND_REVERT) &&
                    this.getHealth() > 0 && heroes[i].getHealth() > 0 && boss.getHealth() > 0) {
                heroes[i].setDamage (heroes[i].getDamage() + selectedDamage);

            }
        }
    }
}
