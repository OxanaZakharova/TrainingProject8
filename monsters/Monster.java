package monsters;

public abstract class Monster implements IMonster {
   private int exp;
   private int hp;
   private int gold;
   private int attackPower;

    public Monster(int exp, int hp, int gold, int attackPowerpower) {
        this.exp = exp;
        this.hp = hp;
        this.gold = gold;
        this.attackPower = attackPowerpower;
    }

    public int getExp() {
        return exp;
    }

    public int getHp() {
        return hp;
    }

    public int getGold() {
        return gold;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void attack() {
        System.out.println(getName() + " is attacking");
    }

    public void takeDamage(int damage){
        hp -= damage;
    }

    public boolean isDead() {
        return (hp <= 0);
    }
}
