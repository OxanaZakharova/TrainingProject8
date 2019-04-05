package monsters;

import main.RandomHelper;

public class Dragon extends Monster {

    public Dragon() {
        super(RandomHelper.getInt(20,30), 60, RandomHelper.getInt(30,40), 8);
    }

    public String getName() {
        return "Dragon";
    }

    @Override
    public String toString() {
        return "Dragon{" +
                 ", exp=" + getExp()+
                ", goldRandom=" + getGold() +
                '}';
    }
}
