import java.util.Scanner;
class Print{
    public static void main(String[] args){
        int[] A = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Element of array -----");
        for(int i=0;i<A.length;i++){
            System.out.print("Input " + i + " Element of array : ");
            A[i]= sc.nextInt();
            System.out.println(" ");
        }
        printArray(A);
    }
    public static void printArray(int[] A){
      
        // for(int i = 0 ; i<A.length;i++){
        //     System.out.println(A[i]);
        // }
        System.out.println("Element of array are : ");
        for(int a : A){
            System.out.println(a);
        }
    }
}