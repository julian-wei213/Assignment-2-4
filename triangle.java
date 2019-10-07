import java.util.Scanner;

class triangle{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What do you want your character to be");
        String Char = sc.next();
        System.out. println("How tall do you want your triangle");
        int height = sc.nextInt();
        
        for(int x = 1; x<=height; x++){
            for(int i = 0; i<x; i++){
                System.out.print(Char);
            }
            System.out.println(" ");
        }
    }
}