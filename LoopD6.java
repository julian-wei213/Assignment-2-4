import java.util.Scanner;

class LoopD6{
    public static void main( String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String y = "y";
        
        while(y.equals("y")){
        System.out.println("How many dice do you want to roll");
        int total = sc.nextInt();
        
        for(int x = 1; x <= total; x++){
            int a = (int)(Math.random()*6+1);
            sum = sum + a;
            System.out.print(a + ",");
            System.out.println(" ");
       }
       
       System.out.println("Your sum is " + sum);
       System.out.print("Again? [y/n] ");
       y = sc.next();
    }
       
    System.out.println("Bye");
    }

}
