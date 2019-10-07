







import java.util.Scanner;

class RunningTally{
   

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Running Tally");
        System.out.println("-------------");

        int n = 1; 
        int sum = 0; 
        while( n > 0){
            System.out.println("Next Number");
            n = sc.nextInt();
            if( n >0) {
            sum = sum + n; 

        }

       } 
            System.out.println("Your tally is");
               System.out.println(sum);

    } 
}
