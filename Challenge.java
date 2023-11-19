import java.util.ArrayList;
import java.util.Scanner;

public class Challenge{
    public static void main(String[] args){

        System.out.println("How many sides do you want?");
        Scanner input = new Scanner(System.in);
        int sides = input.nextInt();
        System.out.println("How many die do you want?");
        int dies = input.nextInt();

        ArrayList<Dice> dices = new ArrayList<Dice>(); 

        for(int i = 0; i < dies; i++){
            dices.add(new Dice(sides));

        }
        for(int j = 0; j < dices.size() ; j++){
            
            System.out.println(dices.get(j).roll());
        }

    }

}