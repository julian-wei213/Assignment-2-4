import java.util.Scanner;

class GuessingGame{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int sum = (int)(Math.random()*100 +1);
        int ans = -1;
        int tries = 0;
        
        System.out.println("Guess a number between 1 and 100");
        System.out.println(" ");
        
        while (ans!=sum){
            System.out.println("What is your guess?");
            ans = sc.nextInt();
            
            if(ans > sum){
                System.out.println("too high...");
            }else if(ans < sum){
                System.out.println("too low...");
            }
            
            tries++;
        }
        
        System.out.println("You guessed my number, it was " +sum+ " it only took you " +tries+ " tries");
    }
}