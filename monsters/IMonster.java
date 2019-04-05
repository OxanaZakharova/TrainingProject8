package monsters;

public interface IMonster {
    int monsterTypeNumber = 3;
    void attack();
    void takeDamage(int damage);
    String getName();
    boolean isDead();
    int getHp();
    int getGold();
    int getAttackPower();
    int getExp();

}

