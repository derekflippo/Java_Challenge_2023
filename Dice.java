
public class Dice {
    private static int lastRoll;
    private int sides;
    
    public Dice(){
        this.sides =6;
    }
    public Dice (int n){
        this.sides = n;
    }
    public int numSides(){
        return sides;
    }
    public int roll(){
        int roll = (int) (Math.random()*sides + 1);
        lastRoll = roll; 
        return roll;
    }
    public int readLastRoll(){
        return lastRoll;
    }

}
