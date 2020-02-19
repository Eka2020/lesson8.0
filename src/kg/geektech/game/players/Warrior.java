package kg.geektech.game.players;

import kg.geektech.game.players.Boss;
import kg.geektech.game.players.Hero;
import kg.geektech.game.players.SuperAbility;

import java.util.Random;

public class Warrior extends Hero {

      private int critDamage;

    public Warrior(int health, int damage, int critDamage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
        this.critDamage = critDamage;
    }

    public int getCritDamage() {
        return critDamage;
    }

    public void setCritDamage(int critDamage) {
        this.critDamage = critDamage;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random rand = new Random();
        for (int i = 2; i < 4; i++) {
        }
        boss.setHealth(boss.getHealth() - (critDamage * rand.nextInt(4)));

    }


}