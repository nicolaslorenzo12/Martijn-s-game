public class ShotGun extends Weapon{

    public ShotGun() {
        damage = 11;
    }

    @Override
    int getDamage() {
        return damage;
    }

    @Override
    String getName() {
        return "Shotgun";
    }
}
