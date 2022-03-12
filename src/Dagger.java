public class Dagger extends Weapon{

    public Dagger() {
        damage = 5;
    }

    @Override
    int getDamage() {
        return damage;
    }

    @Override
    String getName() {
        return "Dagger";
    }
}
