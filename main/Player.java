package main;

public class Player  implements IPlayer{
    private int hp, exp;
    private int gold;
    private String name;
    private int level = 1;
    private int strength;
    private int toughness;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getExp() {
        return exp;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }


    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getGold() {
        return gold;
    }


    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStrength() {
        return strength;
    }

    public int getToughness() {
        return toughness;
    }

    public Player(String name) {
        this.name = name;
        this.hp = hpMax;
    }

    public int attack() {
        System.out.println("Player is attacking...");
        return RandomHelper.getInt((int)((1+strength/10.0)*5),(int)((1+strength/10.0)*(7+13*(exp/100.0))));

    }

    public void takeDamage(int damage){
        hp -= (int)(damage/(1+ toughness/6.0));
    }

    public boolean isDead() {
       return (hp <= 0);
    }

    public void giveExp(int exp) {
        this.exp += exp;
    }

    public void giveGold(int gold) {
        this.gold += gold;
    }

    public void levelUp(){
        level++;
        hp = hpMax;
        if (exp >= expMax ){
            exp -= expMax;
        }
        System.out.println("You are leveled up!  You are " + level + " level");
        if (level == 10){
            System.out.println("Congratulations! You reached the level 10! You win this game!!!");
            System.exit(1);
        }
    }



    @Override
    public String toString() {
        return "Player{" +
                "hp=" + hp +
                ", exp=" + exp +
                ", name='" + name + '\'' +
                '}';
    }
    public void printPlayer() {
        System.out.println("***********\n" +
                "Name: " + name + "\n"+
                "Level: " + level + "\n" +
                "HP: " + hp + "/" +hpMax + "\n" +
                "Exp: " + exp + "/" + expMax + "\n" +
                "Gold: " + gold + "\n" +
                "Strength: " + strength + "\n" +
                "Toughness: " + toughness + "\n" +
                "*******************");
    }


}
