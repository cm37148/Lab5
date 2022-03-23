import java.util.Random;
public class Character {

	public static void main(String[] args) {
	 //class fields
     String name;
     int currentHitPoints = 0;
     int weaponDamage = 0;
     int locationX;
    int locationY;
    
  //Abstract method that needs to be implemented in child classes.
    //The actual implementation depends on the subclass
    public abstract void specialAbility();
    
    //Lower our current hitpoints by the damageTaken argument
    public void receiveDamage(int damageTaken) {
        this.currentHitPoints -= damageTaken;
    }

    //Object interaction. The parameter is an Character object
    //Check if this character is in the same location as the other character, if so then do weapon damage to them
    //We call the opponent's receiveDamage method within this attack method
    public void attack(Character other) {
        if (other.getLocationX() == this.getLocationX() && other.getLocationY() == this.getLocationY() && other.getCurrentHitPoints() > 0){
            System.out.printf("%s attacked %s\n", this.getName(), other.getName());
            other.receiveDamage(this.weaponDamage);
            if (other.getCurrentHitPoints() <= 0) {//if true, then the other character is defeated
                System.out.printf("%s defeated %s\n", this.getName(), other.getName());
                //Move them off the board
                other.setLocationX(-999);
                other.setLocationY(-999);
            }
        }
    }

    public String toString() {
        return String.format("%s location: %d, %d. HitPoints: %d", this.getName(), this.getLocationX(), this.getLocationY(), this.getCurrentHitPoints());
    }
    
    public boolean equals(Object other) {
        //Cast the Object parameter to a Character so we can access its name
        Character tempCast = (Character)other;
        if (this.name.equals(tempCast.getName())){
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * @param name
     * @param locationX
     * @param locationY
     */
    public Character(String name, int locationX, int locationY) {
        this.name = name;
        this.locationX = locationX;
        this.locationY = locationY;
    }
	
  
}

	private static void specialAbility() {
		// TODO Auto-generated method stub
		
	}
}