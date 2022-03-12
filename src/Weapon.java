import java.util.ArrayList;
import java.util.Random;

abstract class Weapon{

    private final ArrayList<Weapon> weapons;
    protected int damage;
    abstract int getDamage();
    private final Random random;

    public Weapon(){
        weapons = new ArrayList<>();
        weapons.add(new Bat());
        weapons.add(new Bow());
        weapons.add(new Dagger());
        weapons.add(new Hammer());
        weapons.add(new ShotGun());
        weapons.add(new Sword());
        random = new Random();
    }

    public Weapon getRandomWeapon(){

        int indexOfRandomWeapon = random.nextInt(weapons.size());
        return weapons.get(indexOfRandomWeapon);
    }
}