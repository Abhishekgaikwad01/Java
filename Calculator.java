import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Calculator c = new Calculator();
        System.out.println("Enter 1 no :");
        int a= sc.nextInt();
        System.out.println("Enter 2 no :");
        int b=sc.nextInt();
        System.out.println("1.Addiion");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter Your Choice :");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
            int result=c.Add(a,b);
            System.out.println("Addition ="+result);
            break;
            case 2:
            result=c.Sub(a,b);
            System.out.println("Subtraction ="+result);
            break;
            case 3:
            result=c.Mul(a,b);
            System.out.println("Multiplication ="+result);
            break;
            case 4:
            result=c.Div(a,b);
            System.out.println("Division ="+result);
        }
    }
    int Add(int a,int b){
        int c = a + b;
        return c;
    }   
    int Sub(int a, int b){
        int c = a - b;
        return c;
    }
    int Mul(int a, int b){
        int c = a*b;
        return c;
    }
    int Div(int a, int b){
        int c = a/b;
        return c;
    }
}
