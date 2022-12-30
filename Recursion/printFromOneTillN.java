
//Recursion Level - 1 Questions 
//Write a progam to print the numbers from n to 1 using recursion.

public class printFromOneTillN {
    public static void main(String[] args){
        int n = 64;
        printNos(n);
    }
    //If n = 5; Prints : 5,4,3,2,1;
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n); 
        print(n-1);
    }
    // If n = 5; Prints : 1,2,3,4,5 // Printing after empting the stack
    public static void reversePrinting(int n){
        if(n==0){
            System.out.println(n);  
            return;
        }
        print(n-1);
        System.out.println(n);  
    } 
    public static void printNos(int N){
        prints(N,1);
    }
    
    public static void prints(int N, int a){
        if(N>=a){
            System.out.println(a);
            prints(N,a+1);
        }
    }
}
