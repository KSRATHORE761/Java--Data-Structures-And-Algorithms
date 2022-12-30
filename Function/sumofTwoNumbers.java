import java.util.Scanner;

 class Main{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter 1st Number : ");
        num1 = sc.nextInt();
        System.out.println(" ");
        System.out.print("Enter 2nd Number : ");
        num2 = sc.nextInt();
        sum = Findsum(num1,num2);
        System.out.println("Sum is " + sum);
    }
    public static int Findsum(int a, int b){
        return a+b;
    }
}