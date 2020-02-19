package kg.geektech.game.players;

public class Tank extends Hero {
    public int mirroredDamage;
    private Object Hero;

    public Tank(int health, int damage, int selectedDamage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
        this.mirroredDamage = selectedDamage;
        
    }

    public int getMirroredDamage() {
        return mirroredDamage;
    }

    public void setMirroredDamage(int mirroredDamage) {
        this.mirroredDamage = mirroredDamage;
    }

            @Override
        public void applySuperAbility (Boss boss, Hero[]heroes) {
                boss.setHealth(boss.getHealth() - mirroredDamage);


                    }


    }


