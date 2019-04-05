package main;

public interface IPlayer {
    int hpMax = 300;
    int expMax = 100;

    int attack();
    void takeDamage(int damage);
    boolean isDead();
    void  giveExp(int exp);
    void  giveGold(int gold);
    void levelUp();
    int getExp();
    int getLevel();
    void printPlayer();
    String getName();
    int getHp();
    int getGold();
    void setGold(int gold);
    void setStrength(int strength);
    void setToughness(int toughness);
    int getStrength();
    int getToughness();








}
