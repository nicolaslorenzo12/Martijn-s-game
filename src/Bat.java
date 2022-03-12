public class Bat extends Weapon{

    public Bat() {
        damage = 8;
    }

    @Override
    int getDamage() {
        return damage;
    }

    @Override
    String getName() {
        return "Bat";
    }


}
