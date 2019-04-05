package monsters;

public class GiantWurm extends Monster {
    public GiantWurm() {
        super(20, 50, 30, 7);
    }

    public String getName() {
        return "Giant Wurm";
    }

    @Override
    public String toString() {
        return "GiantWurm{" +
                "exp=" + getExp() +
                ", hp=" + getHp() +
                ", gold=" + getGold() +
                ", damage=" + getAttackPower() +
                '}';
    }
}
