import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation á 'a * x + b =0', pleas");
        System.out.println("a: ");
        int a = scanner.nextInt();
        System.out.println("b: ");
        int b = scanner.nextInt();
        if(a== 0){
            if(b==0){
                System.out.println("Equation with infinite solutions");
            }else{
                System.out.println("Unsolved equation");
            }
        }else {
            if(b==0){
                System.out.println("Equation has solution x = 0");
            }else{
                int result = -b/a;
                System.out.println("Equation has solution x = " + result);
            }
        }
    }
}
