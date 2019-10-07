import java.util.Scanner;
class Bar {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What do you want your character to be made of");
        String Char = sc.next();
        System.out.println("How many do you want of your character");
        int total = sc.nextInt();
        
        
        for(int x=0;x<total;x++){
            System.out.print(Char);
        }
        
        
    }
}