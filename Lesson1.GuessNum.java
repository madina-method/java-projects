import java.util.Scanner;

public class GuessNum {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?"); // asks user name
        String name = scanner.nextLine();
        int compNumber = (int) (Math.random()*30); // computer chooses random number [0, 30]
        int tries = 0;
        while(tries < 5){
            System.out.println("\nGuess my number, "+name);
            int myNumber = scanner.nextInt(); // program asks me

            if (compNumber==myNumber) { // numbers r equal
                System.out.println(name+", you won!");
                break;
            }else if(compNumber>myNumber){
                System.out.println("My number is bigger");
            }
            else{
                System.out.println("My number is smaller");
            }
            tries++;
        }
       if(tries == 5) System.out.println(name+", you lost! My number was "+ compNumber); // there is no tries
    }
}
