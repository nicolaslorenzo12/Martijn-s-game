public class Bow extends Weapon{

    public Bow() {
       damage = 10;
    }

    @Override
    int getDamage() {
        return damage;
    }
}
