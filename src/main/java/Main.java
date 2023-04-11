import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Input x value: ");
        int x= sc.nextInt();
        System.out.println("Input y value: ");
        int y= sc.nextInt();
        CalculationExample abc =new CalculationExample();
        abc.caclutae(x,y);

    }

}
