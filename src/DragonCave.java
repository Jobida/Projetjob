import java.util.InputMismatchException;
import java.util.Scanner;
public class DragonCave {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("you are in a land full of dragon.In front of you,\nyou see two caves.In one cave, the dragon is friendly \nand will share his  treasure with you.The other dragon\nis greedy and hungry and will eat you on sight\nwhich cave will you go into? (1 or 2)");
        System.out.println("you approach the cave");
        boolean accept = false;
        int cave=1;
        while(accept==false){
            try{
             cave = scan.nextInt();
             accept=true;}
            catch(InputMismatchException e) {
                System.out.println("Not valid");
                scan.nextLine();
            }
        }



        switch (cave){
            case 1:
                System.out.println("it is dark and spocky");
                break;
            case 2:
                break;
            default:
                System.out.println("try again");
                break;
        }
    }
}
