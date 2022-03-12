import java.util.Random;

public enum Weapon {

    gun,
    rifle,
    shotGun,
    Sword,
    dagger,
    bow;

    public static Weapon getRandomWeapon(){
        Random random = new Random();
        Weapon[] weapons = Weapon.values();
        int indexRandomWeapon = random.nextInt(Weapon.values().length);
        return weapons[indexRandomWeapon];
    }
}
