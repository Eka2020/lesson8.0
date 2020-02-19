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
                for (int i = 0; i < heroes.length; i++) {
                    if (!heroes[i].getAbility().equals(SuperAbility.SAVE_DAMAGE_AND_REVERT) &&
                            this.getHealth() > 0 && heroes[i].getHealth() > 0 && boss.getHealth() > 0) {
                      boss.setDamage(this.getDamage() + mirroredDamage);


                    }
                }
            }
    }


