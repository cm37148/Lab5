import java.util.Scanner;
public class PlayableCharacter {

	public static void main(String[] args) {
		
	    //Player's turn to move
	    public void move(Scanner input) {
	        System.out.println("Where to move? w for up, s for down, a for left, d for right. Any other key will skip the turn.");
	        String in = input.next();
	        switch (in) {
	        case "w":
	            this.setLocationY(this.getLocationY() + 1);
	            break;
	        case "s":
	            this.setLocationY(this.getLocationY() - 1);
	            break;
	        case "a":
	            this.setLocationX(this.getLocationX() - 1);
	            break;
	        case "d":
	            this.setLocationX(this.getLocationX() + 1);
	            break;
	        default:
	            System.out.println("Turn Skipped. u for up, d for down, l for left, r for right. Any other key will skip the turn.");
	        }
}
	    
	    /**
	     * @param name
	     * @param locationX
	     * @param locationY
	     */
	   public PlayableCharacter(String name) {
	        super(name, 0, 0); //This character always starts furthest from the stairs
	        this.setCurrentHitPoints(10);
	        this.setWeaponDamage(4);
	    }
	   @Override
	    public void specialAbility() {
	        System.out.printf("%s used special ability: heal\n", this.getName());
	        setCurrentHitPoints(this.getCurrentHitPoints() + 2);
	    }
	   //Player's turn to move
	    public void move(Scanner input) {
	        System.out.println("Where to move? w for up, s for down, a for left, d for right. Press q for special ability. Any other key will skip the turn.");
	        String in = input.next();
	        switch (in) {
	        case "w":
	            this.setLocationY(this.getLocationY() + 1);
	            break;
	        case "s":
	            this.setLocationY(this.getLocationY() - 1);
	            break;
	        case "a":
	            this.setLocationX(this.getLocationX() - 1);
	            break;
	        case "d":
	            this.setLocationX(this.getLocationX() + 1);
	            break;
	        case "q":
	            this.specialAbility();
	            break;
	        default:
	            System.out.println("Turn Skipped. u for up, d for down, l for left, r for right. Press q for special ability. Any other key will skip the turn.");
	        }
	    }
	    }
	
	

}
