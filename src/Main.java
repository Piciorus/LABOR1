import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N,sum=0;
        int count=0;
        System.out.print("Enter the number:");
        Scanner s = new Scanner(System.in);
        while(s.hasNextInt()){
            System.out.print("Enter the number:");
            sum+=s.nextInt();
            count++;
        }
        System.out.println(sum/count);
    }
}