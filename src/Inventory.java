import java.util.ArrayList;

public class Inventory {

    private final ArrayList<String> inventory;
    private final Weapon weapon;

    public Inventory(){
        inventory = new ArrayList<>();
        this.weapon = new Weapon();
    }

    public void addItemToInventory(String weapon){
      if(checkIfValidWeapon(weapon)){
          inventory.add(weapon);
          System.out.println("This weapon was added to your inventory");
      }
      else{
          System.out.println("This is not a valid a weapon");
      }
    }

    public void deleteItemOfInventory(String weapon){

    }

    private boolean checkIfValidWeapon(String weapon){

        String[] weapons = this.weapon.getWeapons();
        boolean weaponFound = false;
        int numberOfWeapon = 0;

        while(!weaponFound && numberOfWeapon < weapons.length){

            if(weapon.equals(weapons[numberOfWeapon])){
                weaponFound = true;
            }
            numberOfWeapon++;
        }
        return  weaponFound;
    }


}
