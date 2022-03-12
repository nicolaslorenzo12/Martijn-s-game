import java.util.ArrayList;
import java.util.Random;

abstract class Weapon{

    protected int damage;
    abstract int getDamage();
    abstract String getName();
    private final Random random;

    public Weapon(){
        random = new Random();
    }
}