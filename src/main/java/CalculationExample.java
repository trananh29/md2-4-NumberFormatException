public class CalculationExample {
    public void caclutae(int x, int y) {
        try {
            int a= x+y;
            int b= x-y;
            int c= x*y;
            int d= x/y;
            System.out.println("The sum of element x and y is: " + a);
            System.out.println("The subtraction of element x and y is: " + b);
            System.out.println("The multiliption of element x and y is: " + c);
            System.out.println("The division of element x and y is: " + d);
        } catch (Exception e) {
            System.err.printf("Exception happend" + e.getMessage());
        }
    }
}
