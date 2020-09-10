import java.util.Scanner;

public class controlflow {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("write a number");
        int age = in.nextInt();
        if(age<14){
            System.out.println("a");
        }
        else if(age<16){
            System.out.println("b");
        }
        else{
            System.out.println("c");
        }
    }
}