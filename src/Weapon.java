import java.util.Random;

public enum Weapon {

    gun(0),
    rifle(1),
    shotGun(2),
    Sword(3),
    dagger(4),
    bow(5);

    int idWeapon;
    Random random;

    Weapon(int idWeapon){
        this.idWeapon = idWeapon;
        random = new Random();
    }

    public Weapon getRandomWeapon(){
        Weapon[] weapons = Weapon.values();
        int indexRandomWeapon = random.nextInt(Weapon.values().length);
        return weapons[indexRandomWeapon];
    }
}
