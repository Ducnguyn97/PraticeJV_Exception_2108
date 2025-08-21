import java.util.Scanner;

public class CalculationExample {
    public void calculate(int x,int y){
        try{
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = "+a);
            System.out.println("Hiệu x - y = "+ b);
            System.out.println("Tích x * y = "+ c);
            System.out.println("Thương x / y =" + d);
        }catch(ArithmeticException e){
            System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào x: ");
            int x = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập vào y: ");
            int y = Integer.parseInt(scanner.nextLine());
            CalculationExample calc = new CalculationExample();
            calc.calculate(x, y);
        }catch(NumberFormatException e){
            System.out.println("Không chuyển đổi sang số: "+e.getMessage());
        }
    }
}
